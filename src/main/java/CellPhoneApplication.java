import java.util.Scanner;

public class CellPhoneApplication {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("What is the serial number? ");
        int serialNumber = scanner.nextInt();
        scanner.nextLine();
        String model = userStringInput("What model is the phone? ");
        String carrier = userStringInput("Who is the carrier? ");
        String phoneNumber = userStringInput("What is the phone number? ");
        String owner = userStringInput("Who is the owner of the phone? ");

        populateCellPhoneData(serialNumber, model, carrier, phoneNumber, owner);

    }

    public static String userStringInput(String message) {
        System.out.print(message);
        return scanner.nextLine();
    }


    public static void populateCellPhoneData(int serialNumber, String model, String carrier, String phoneNumber, String owner) {
        CellPhone userCellPhone = new CellPhone();

        userCellPhone.setSerialNumber(serialNumber);
        userCellPhone.setModel(model);
        userCellPhone.setCarrier(carrier);
        userCellPhone.setPhoneNumber(phoneNumber);
        userCellPhone.setOwner(owner);

        System.out.println("New cellphone created with this data: \nSerial Number: " + userCellPhone.getSerialNumber() + "\nModel: " + userCellPhone.getModel() + "\nCarrier: " + userCellPhone.getCarrier() + "\nPhone Number: " + userCellPhone.getOwner());

    }
}

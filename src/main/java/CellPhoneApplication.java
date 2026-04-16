import java.util.Scanner;

public class CellPhoneApplication {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        CellPhone cellPhone1 = promptCellphoneInput();
        CellPhone cellPhone2 = promptCellphoneInput();

        System.out.println();
        display(cellPhone1);
        System.out.println();
        display(cellPhone2);
        System.out.println();
        cellPhone1.dial(cellPhone2.getPhoneNumber());
        System.out.println();
        cellPhone2.dial(cellPhone1.getPhoneNumber());
    }

    public static String userStringInput(String message) {
        System.out.print(message);
        return scanner.nextLine();
    }

    public static CellPhone promptCellphoneInput() {
        System.out.print("What is the serial number? ");
        int serialNumber = scanner.nextInt();
        scanner.nextLine();
        String model = userStringInput("What model is the phone? ");
        String carrier = userStringInput("Who is the carrier? ");
        String phoneNumber = userStringInput("What is the phone number? ");
        String owner = userStringInput("Who is the owner of the phone? ");

        return populateCellPhoneData(serialNumber, model, carrier, phoneNumber, owner);
    }


    public static CellPhone populateCellPhoneData(int serialNumber, String model, String carrier, String phoneNumber, String owner) {
        CellPhone userCellPhone = new CellPhone();

        userCellPhone.setSerialNumber(serialNumber);
        userCellPhone.setModel(model);
        userCellPhone.setCarrier(carrier);
        userCellPhone.setPhoneNumber(phoneNumber);
        userCellPhone.setOwner(owner);

        return userCellPhone;

    }

    public static void display(CellPhone userCellPhone) {
        System.out.println("New cellphone created with this data: \nSerial Number: " + userCellPhone.getSerialNumber() + "\nModel: " + userCellPhone.getModel() + "\nCarrier: " + userCellPhone.getCarrier() + "\nPhone Number: " + userCellPhone.getPhoneNumber() + "\nOwner: " + userCellPhone.getOwner());
    }
}

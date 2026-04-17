import java.util.Scanner;

public class CellPhoneApplication {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        Create Phones
        CellPhone cellPhone1 = createCellPhone();
        CellPhone cellPhone2 = createCellPhone();
        CellPhone cellPhone3 = new CellPhone(12345, "iPhone12", "T-Mobile", "972-972-9972", "Marcus P.");

//        Display phone data
        System.out.println();
        display(cellPhone1);
        System.out.println();
        display(cellPhone2);
        System.out.println();
        display(cellPhone3);
        System.out.println();

//        Dial phones
        cellPhone1.dial(cellPhone2.getPhoneNumber());
        System.out.println();
        cellPhone2.dial(cellPhone1.getPhoneNumber());
        System.out.println();
        cellPhone3.dial(cellPhone2);

    }

    public static String userStringInput(String message) {
        System.out.print(message);
        return scanner.nextLine();
    }

    public static CellPhone createCellPhone() {
        System.out.print("What is the serial number? ");
        int serialNumber = scanner.nextInt();
        scanner.nextLine();
        String model = userStringInput("What model is the phone? ");
        String carrier = userStringInput("Who is the carrier? ");
        String phoneNumber = userStringInput("What is the phone number? ");
        String owner = userStringInput("Who is the owner of the phone? ");

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

import java.util.Scanner;

public class CellPhoneApplication {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

    }

    public static String userStringInput(String message) {
        System.out.println(message);
        return scanner.nextLine();
    }
}

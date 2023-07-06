import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] a = new String[9999][4];

        int currentIndex = 0;

        while(true){
            System.out.println("Press [0] - Exit");
            System.out.println("Press [1] - Add contacts");
            System.out.println("Press [2] - List contacts");

            String input = scanner.next();

            if (input.equals("0")){
                System.out.println("Exiting...");
                break;
            }
            else if (input.equals("1")){
                System.out.println("First Name");
                String firstName = scanner.next();
                System.out.println("Last Name");
                String lastName = scanner.next();
                System.out.println("Phone");
                String phone = scanner.next();
                System.out.println("City");
                String city = scanner.next();

                a[currentIndex][0] = firstName;
                a[currentIndex][1] = lastName;
                a[currentIndex][2] = phone;
                a[currentIndex][3] = city;
                currentIndex++;

                System.out.println("Contacts were added");

            }
            else if (input.equals("2")){
                System.out.println("****************");
                for (int i = 0; i < currentIndex; i++) {
                    for (int j = 0; j < a[i].length; j++) {
                        System.out.print(a[i][j] + " ");
                    }
                    System.out.println();
                }
                System.out.println("****************");
            }
            else {
                System.out.println("Invalid input");
            }
        }
    }
}

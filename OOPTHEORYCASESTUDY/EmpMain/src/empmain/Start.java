upackage empmain;

import java.io.IOException;
import java.util.Scanner;

public class Start {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int i = 1;
        while (i == 1) {
            String choice;
            System.out.println("\n\n\t\tWELOME TO OFFICE SUPPLY ORDERING SYSTEM\n\n");
            System.out.println("\tLOGIN AS USERS Press U\n");
            System.out.println("\tLOGIN AS DEPARTMENT MANAGER press M\n");
            choice = sc.nextLine();
            if (choice.equals("U") || choice.equals("u")) {
                int n = 1;
                while (n == 1) {
                    System.out.println("\tEnter User name :\n");
                    String Username = sc.nextLine();
                    System.out.println("\tEnter Password\n");
                    String password = sc.nextLine();
                    if (Username.equals("User") && password.equals("001")) {
                        Employee.main(null);
                        n++;
                    } else {
                        System.out.println("wrong input");

                    }
                }
                i++;

            } else if (choice.equals("M") || choice.equals("m")) {
                int n = 1;
                while (n == 1) {
                    System.out.println("\tEnter User name :\n");
                    String Username = sc.nextLine();
                    System.out.println("\tEnter Password\n");
                    String password = sc.nextLine();

                    if (Username.equals("Manager") && password.equals("002")) {
                        departmentManager.main(null);
                        n++;
                    } else {
                        System.out.println("wrong input");

                    }
                }
                i++;
            } else {
                System.out.println("wrong input");

            }
        }

    }

}

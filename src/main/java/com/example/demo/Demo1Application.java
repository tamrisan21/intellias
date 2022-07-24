package com.example.demo;

import java.util.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class Demo1Application {

    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                String id = scanner.nextLine();
                System.out.println("User id = " + id);
                String firstName = scanner.nextLine();
                System.out.println("User name = " + firstName);
                String lastName = scanner.nextLine();
                System.out.println("User lastname = " + lastName);
                String money = scanner.nextLine();
                System.out.println("User money = " + money);


                String userArr[] = new String[]{id, firstName, lastName, money};

                System.out.println();
                System.out.println("Your INFO:");
                System.out.println();

                System.out.println("Your ID = " + userArr[0]);
                System.out.println("Your Name = " + userArr[1]);
                System.out.println("Your Last Name = " + userArr[2]);
                System.out.println("Your Funds = " + userArr[3]);
                System.out.println();


                int money2 = Integer.parseInt(money);

                String prId = scanner.nextLine();
                System.out.println("Pr prid = " + prId);
                String prName = scanner.nextLine();
                System.out.println("Pr name = " + prName);
                String price = scanner.nextLine();
                System.out.println("Pr price = " + price);


                String prArr[] = new String[]{prId, prName, price};

                System.out.println();
                System.out.println("Product INFO:");
                System.out.println();

                System.out.println("Product ID = " + prArr[0]);
                System.out.println("Product Name = " + prArr[1]);
                System.out.println("Product Price = " + prArr[2]);


                int price2 = Integer.parseInt(price);

                if (money2 >= price2) {
                    money2 -= price2;
                    System.out.println("Order SUCCESSFUL!  Your remaining funds = " + money2);
                } else {
                    System.out.println("Order FAILED! Insufficient funds");
                }
                System.out.println();

                System.out.println("User products:");
                String[][] mon2 = {{id, firstName},{prId, prName}};
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        System.out.print(" " + mon2[i][j] + " ");
                    }
                    System.out.println();
                }

                System.out.println();

                System.out.println("Users that bought product:");
                String[][] mon3 = {{prId, prName},{id, firstName}};
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        System.out.print(" " + mon3[i][j] + " ");
                    }
                    System.out.println();
                }



                scanner.close();


        SpringApplication.run(Demo1Application.class, args);
    }

}

package com.pluralsight;

import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {
        // initialize Scanner object and StringBuilder objects
        Scanner input = new Scanner(System.in);

        System.out.println("Please provide the following information:");

        System.out.print("Full name: ");
        String fullName = input.nextLine();

        // prompt for billing and shipping addresses
        String billingAddress = addressBuilder("Billing", input);
        String shippingAddress = addressBuilder("Shipping", input);

        // print output
        System.out.println();
        System.out.println(fullName);
        System.out.println(billingAddress);
        System.out.println(shippingAddress);

    }

    // method to build string and convert to string
    public static String addressBuilder (String addressType, Scanner input) {
        StringBuilder fullAddressStringBuilder = new StringBuilder();

        System.out.print(addressType + " Street: ");
        String street = input.nextLine();

        System.out.print(addressType + " City: ");
        String city = input.nextLine();

        System.out.print(addressType + " State: ");
        String state = input.nextLine();

        System.out.print(addressType + " Zip: ");
        String zip = input.nextLine();

        // can change to chained append calls
        fullAddressStringBuilder.append("\n" + addressType + " Address:\n" +
                street + "\n" + city + ", " +
                state + " " + zip
        );
        return fullAddressStringBuilder.toString();
    }
}
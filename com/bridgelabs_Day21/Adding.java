package com.bridgelabs_Day21;

import java.util.ArrayList;
import java.util.Scanner;

public class Adding extends contact{

		    public static void main(String[] args) {
		        System.out.println("Welcome to Address book");

		        contact obj = new contact();
		        contact.FirstName = new ArrayList<>();
		        contact.LastName = new ArrayList<>();
		        contact.Address = new ArrayList<>();
		        contact.City = new ArrayList<>();
		        contact.state = new ArrayList<>();
		        contact.Zip = new ArrayList<>();
		        contact.PhoneNuber = new ArrayList<>();
		        contact.email = new ArrayList<>();

		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter the number of contact you want to add");
		        int a = sc.nextInt();

		        for (int i = 0; i<a; i++){
		            System.out.println("Enter the First name");
		            String Str1 = sc.next();
		            FirstName.add(Str1);

		            System.out.println("Enter the last name");
		            String Str2 = sc.next();
		            LastName.add(Str2);

		            System.out.println("Enter the Address");
		            String Str3 = sc.next();
		            Address.add(Str3);

		            System.out.println("Enter the city");
		            String Str4 = sc.next();
		            City.add(Str4);

		            System.out.println("Enter the state");
		            String Str5 = sc.next();
		            state.add(Str5);

		            System.out.println("Enter the zip");
		            String Str6 = sc.next();
		            Zip.add(Str6);

		            System.out.println("Enter the Phone Number");
		            String Str7 = sc.next();
		            PhoneNuber.add(Str7);

		            System.out.println("Enter the email");
		            String Str8 = sc.next();
		            email.add(Str8);

		        }

		        System.out.println(FirstName);
		        //String st19 = FirstName.get(0);
		        //System.out.println(st19);
		        for (int j = 0; j < a; j++) {
		            System.out.println(FirstName.get(j));
		            System.out.println(LastName.get(j));
		            System.out.println(Address.get(j));
		            System.out.println(City.get(j));
		            System.out.println(state.get(j));
		            System.out.println(Zip.get(j));
		            System.out.println(PhoneNuber.get(j));
		            System.out.println(email.get(j));
		            System.out.println("------------------------------------");
		        }
	}

}

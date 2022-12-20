package com.bridgelabs_Day21;

import java.util.ArrayList;
import java.util.Scanner;

public class feature extends contact{

		    public void Add(ArrayList a){
		        Scanner sc = new Scanner(System.in);

		        System.out.println("Enter the First name");
		        String Str1 = sc.next();

		        boolean dup = a.stream().anyMatch(e->e.equals(Str1));
		        if (dup == true){
		            System.out.println("The name already exists");
		        }else {
		            a.add(Str1);

		            System.out.println("Enter the last name");
		            String Str2 = sc.next();
		            a.add(Str2);

		            System.out.println("Enter the Address");
		            String Str3 = sc.next();
		            a.add(Str3);

		            System.out.println("Enter the city");
		            String Str4 = sc.next();
		            a.add(Str4);

		            System.out.println("Enter the state");
		            String Str5 = sc.next();
		            a.add(Str5);

		            System.out.println("Enter the zip");
		            String Str6 = sc.next();
		            a.add(Str6);

		            System.out.println("Enter the Phone Number");
		            String Str7 = sc.next();
		            a.add(Str7);

		            System.out.println("Enter the email");
		            String Str8 = sc.next();
		            a.add(Str8);
		        }
	}

}

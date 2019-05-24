package com.pack;

import java.util.Random;
import java.util.Scanner;

import com.pack.model.Customer;
import com.pack.service.CustomerServiceImpl;

public class Main {

	private static Scanner sin;

	public static void main(String[] args) {
		
		sin = new Scanner(System.in);
		System.out.println("#application#");
		System.out.println("1 add");
		System.out.println("2.update");
		System.out.println("3.delete");
		System.out.println("4.fetch");
		System.out.println("5.Exit");
		int ch,age,custid;
		String name,address;
		float salery;
		do 
		{
			System.out.println("enter your choice");
			ch=Integer.parseInt(sin.nextLine());
			switch(ch) 
			{
			case 1:
				System.out.println("enter the name");
				name=sin.nextLine();
				System.out.println("enter the address");
				address=sin.nextLine();
				System.out.println("enter age");
				age=Integer.parseInt(sin.nextLine());
				System.out.println("Enter salery");
				salery=Float.parseFloat(sin.nextLine());
				Random r=new Random();
				custid=r.nextInt(900000)+100000;
				Customer customer=new Customer(custid, name, address, age, salery);
				new CustomerServiceImpl().insertCustomer(customer);
				break;
				
			case 2:
				System.out.println("Enter id");
				custid=Integer.parseInt(sin.nextLine());
				System.out.println("enter the address");
				address=sin.nextLine();
				System.out.println("enter age");
				age=Integer.parseInt(sin.nextLine());
				System.out.println("Enter salery");
				salery=Float.parseFloat(sin.nextLine());
				
				Customer customer2=new Customer(custid, address, age, salery);
				new CustomerServiceImpl().updateCustomer(customer2);
				break;
			case 3:
				System.out.println("Enter your id");
				custid=Integer.parseInt(sin.nextLine());
				new CustomerServiceImpl().deleteCustomer(custid);
				break;
			case 4:
				System.out.println("Enter your id");
				custid=Integer.parseInt(sin.nextLine());
				Customer customer3=new CustomerServiceImpl().fetchCustomerID(custid);

				
				System.out.format("%-15s %-20s %-20s %-5s %-10s\n", "CustomerId","customerName","adderss","age","salery");
				System.out.format("%-15s %-20s %-20s %-5s %-10s\n",customer3.getCustid(),customer3.getName(),customer3.getAddress(),customer3.getAge(),customer3.getSalery());
				break;
			case 5:
				System.exit(0);
			}
		}
		while(ch<=4);
	}

}

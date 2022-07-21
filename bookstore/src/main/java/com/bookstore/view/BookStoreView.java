package com.bookstore.view;

import java.util.Scanner;

import com.bookstore.controller.BookStoreController;
import com.bookstore.controller.BookStoreControllerInterface;

public class BookStoreView {

	public static void main(String[] args) {
		String st="yes";
		
		while(st.equals(st)) {
			System.out.println("*******************MAIN MENU**********");
			System.out.println("press 1 to create profile");
			System.out.println("press 2 to view profile");
			System.out.println("press 3 to update profile");
			System.out.println("press 4 to delete profile");
			System.out.println("press 5 to view all profiles");
			
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter your choice");
			int input=sc.nextInt();
			
			BookStoreControllerInterface bc=new BookStoreController();
			
			switch(input) {
				case 1: bc.createBookController();
				break;
				
				case 2: bc.viewBookController();
				break;
				
				case 3: bc.updateBookController();
				break;
				
				case 4: bc.deleteBookController();
				break;
				
				case 5: bc.viewBooksController();
				break;
				
				default:System.out.println("wrong choice");
			}
			System.out.println("Continue press yes/no");
			st=sc.next();
			
		}

	}

}

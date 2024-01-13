package com.if_else;

import java.util.Scanner;

class DB{
	private static final String storedUsername = "admin@123";
	private static final String storedPassword = "admin";
	
	public static String getUsername(){
		return storedUsername;
	}
	
	public static String getPassword(){
		return storedPassword;
	}
}

class LoginSystem{
	public static void loginCredientials(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username");
		String enteredUsername = sc.next();
		if(enteredUsername.equals(DB.getUsername())){
			System.out.println("Enter your password");
			String enteredPassword = sc.next();
			if(enteredPassword.equals(DB.getPassword())){
				System.out.println("Welcome "+enteredUsername);
			}else{
				System.out.println("Invalid password");
			}
		}else{
			System.out.println("Wrong username");
		}
		
	}
}
public class Test2 {

	public static void main(String[] args) {
		LoginSystem.loginCredientials();

	}

}

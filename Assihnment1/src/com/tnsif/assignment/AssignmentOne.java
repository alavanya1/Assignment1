
package com.tnsif.assignment;

import java.util.Scanner;

public class AssignmentOne {
	private String name;
	private String source;
	private String destination;
	public void getInput() {
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("enter name ");
		this.name=scanner.nextLine();
		
		System.out.print("enter source ");
		this.source=scanner.nextLine();
		
		System.out.print("enter destination ");
		this.destination=scanner.nextLine();
	}
	
	public void printMessage() {
		System.out.println("dear " + name + ",welcome onboard with service from"+ source +"to"+destination+".thank youfor choosing sky airline. enjoy your flight.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AssignmentOne assignmentone=new AssignmentOne();
		assignmentone.getInput();
		assignmentone.printMessage();
			
		
	}

}

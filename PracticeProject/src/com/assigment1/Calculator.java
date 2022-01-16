package com.assigment1;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		double s;
		Scanner sc=new Scanner(System.in);
		System.out.println("eneter the two numbers");
		int firstnum=sc.nextInt();
		int secnum= sc.nextInt();
		System.out.println("Enter the operator ");
		char op=sc.next().charAt(0);
		double s1=0;

		switch(op){
		case '+': s1=firstnum+secnum;
		break;
		case '-':s1=firstnum-secnum;
		break;
		case '*':s1=firstnum*secnum;
		break;
		case '/':s1=firstnum/secnum;
		break;
		}
		System.out.println("the answer is " +s1);
	}


	}



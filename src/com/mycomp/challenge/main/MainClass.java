//replicating lcd display in console

package com.mycomp.challenge.main;

import java.util.Scanner;

import com.mycomp.challenge.inputanalizer.InputAnalizer;

public class MainClass {

	private static Scanner sc;
	public static int rowTrack=1;
	
	static {
		sc=new Scanner(System.in);
	}
	public static void main(String[] args) {
		System.out.println("Enter the number to be displayed");
		String input=sc.next();
		InputAnalizer.inputAnalizer(input);
	}
}

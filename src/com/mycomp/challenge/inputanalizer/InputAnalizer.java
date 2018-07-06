package com.mycomp.challenge.inputanalizer;

import com.mycomp.challenge.digits.Digits;
import com.mycomp.challenge.main.MainClass;

public class InputAnalizer {

	private static int var=3;
	public static void inputAnalizer(String catchInput) {
		int length=catchInput.length();
		
		while(var!=0) {
			for(int i=0;i<length;i++) {
				switch(catchInput.charAt(i)) {
				case '0':
					Digits.digitZero();
					break;
				case '1':
					Digits.digitOne();
					break;
				case '2':
					Digits.digitTwo();
					break;
				case '3':
					Digits.digitThree();
					break;
				case '4':
					Digits.digitFour();
					break;
				case '5':
					Digits.digitFive();
					break;
				case '6':
					Digits.digitSix();
					break;
				case '7':
					Digits.digitSeven();
					break;
				case '8':
					Digits.digitEight();
					break;
				case '9':
					Digits.digitNine();
					break;
				default:
					System.out.println("Invalid entry");
				}
			}
			MainClass.rowTrack++;
			System.out.println();
			var--;
		}
	}
}

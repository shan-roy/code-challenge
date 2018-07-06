package com.mycomp.challenge.digits;

import com.mycomp.challenge.main.MainClass;

public class Digits {
	private static int row;
	private static int col;
	private static int matrixSize=3;

	public static void digitZero() {
		for(row=MainClass.rowTrack;row<=matrixSize;row++) {
			for(col=1;col<=matrixSize;col++) {
				if(row==1&&col==1||row==1&&col==3||row==2&&col==2)
					System.out.print(".");
				else if(row==1&&col==2||row==3&&col==2)
					System.out.print("_");
				else
					System.out.print("|");
			}
			System.out.print("   ");
			break;
		}
		//
	}
	public static void digitOne() {
		for(row=MainClass.rowTrack;row<=matrixSize;row++) {
			for(col=1;col<=matrixSize;col++) {
				if(row==2&&col==3||row==3&&col==3)
					System.out.print("|");
				else
					System.out.print(".");
			}
			System.out.print("   ");
			break;
		}
	}
	public static void digitTwo() {
		for(row=MainClass.rowTrack;row<=matrixSize;row++) {
			for(col=1;col<=matrixSize;col++) {
				if(row==1&&col==1||row==1&&col==3||row==2&&col==1||row==3&&col==1)
					System.out.print(".");
				else if(row==2&&col==3||row==3&&col==1)
					System.out.print("|");
				else
					System.out.print("_");
			}
			System.out.print("   ");
			break;
		}
	}
	public static void digitThree() {
		for(row=MainClass.rowTrack;row<=matrixSize;row++) {
			for(col=1;col<=matrixSize;col++) {
				if(row==2&&col==3||row==3&&col==3)
					System.out.print("|");
				else if(row==1&&col==2||row==2&&col==2||row==3&&col==2)
					System.out.print("_");
				else
					System.out.print(".");
			}
			System.out.print("   ");
			break;
		}
	}
	public static void digitFour() {
		for(row=MainClass.rowTrack;row<=matrixSize;row++) {
			for(col=1;col<=matrixSize;col++) {
				if(row==2&&col==2)
					System.out.print("_");
				else if(row==2&&col==1||row==2&&col==3||row==3&&col==3)
					System.out.print("|");
				else
					System.out.print(".");
			}
			System.out.print("   ");
			break;
		}
	}
	public static void digitFive() {
		for(row=MainClass.rowTrack;row<=matrixSize;row++) {
			for(col=1;col<=matrixSize;col++) {
				if(row==2&&col==1||row==3&&col==3)
					System.out.print("|");
				else if(row==1&&col==2||row==2&&col==2||row==3&&col==2)
					System.out.print("_");
				else
					System.out.print(".");
			}
			System.out.print("   ");
			break;
		}
	}
	public static void digitSix() {
		for(row=MainClass.rowTrack;row<=matrixSize;row++) {
			for(col=1;col<=matrixSize;col++) {
				if(row==1&&col==1||row==1&&col==3||row==2&&col==3)
					System.out.print(".");
				else if(row==1&&col==2||row==2&&col==2||row==3&&col==2)
					System.out.print("_");
				else
					System.out.print("|");
			}
			System.out.print("   ");
			break;
		}
	}
	public static void digitSeven() {
		for(row=MainClass.rowTrack;row<=matrixSize;row++) {
			for(col=1;col<=matrixSize;col++) {
				if(row==2&&col==3||row==3&&col==3)
					System.out.print("|");
				else if(row==1&&col==2)
					System.out.print("_");
				else
					System.out.print(".");
			}
			System.out.print("   ");
			break;
		}
	}
	public static void digitEight() {
		for(row=MainClass.rowTrack;row<=matrixSize;row++) {
			for(col=1;col<=matrixSize;col++) {
				if(row==1&&col==2||row==2&&col==2||row==3&&col==2)
					System.out.print("_");
				else if(row==1&&col==1||row==1&&col==3)
					System.out.print(".");
				else
					System.out.print("|");
			}
			System.out.print("   ");
			break;
		}
	}
	public static void digitNine() {
		for(row=MainClass.rowTrack;row<=matrixSize;row++) {
			for(col=1;col<=matrixSize;col++) {
				if(row==1&&col==2||row==2&&col==2)
					System.out.print("_");
				else if(row==2&&col==1||row==2&&col==3||row==3&&col==3)
					System.out.print("|");
				else
					System.out.print(".");
			}
			System.out.print("   ");
			break;
		}
	}
}

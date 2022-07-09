package asgbootcamp_00_introduction;
import java.util.*;

public class Main {
	public static Scanner sc = new Scanner(System.in);
	public Main() {
		Logo(); cls();
		int choiceMenu;
		do{
			System.out.println("1. Start The Simulation!!");
			System.out.println("2. Close App");
			System.out.print("Choice >> ");
			choiceMenu = sc.nextInt(); sc.nextLine();
			if (choiceMenu == 1) {
				simulMenu();
			}
		}while (choiceMenu != 2);
		System.out.println("thank you for using the apps");
	}
	
	public static void Logo() {
		System.out.println(" /$$$$$$$    /$$$$$$                       /$$$$$ /$$$$$$$  /$$$$$$$         /$$       /$$");
		System.out.println("| $$__  $$   |__  $$                      |__  $$| $$__  $$|__  $$__/       | $$      | $$");
		System.out.println("| $$  \\ $$      | $$                         | $$| $$  \\ $$   | $$  /$$$$$$ | $$$$$$$ | $$  /$$$$$$");
		System.out.println("| $$$$$$        | $$       /$$$$$$           | $$| $$$$$$$/   | $$ |____  $$| $$__  $$| $$ /$$__ $$");
		System.out.println("| $$__  $$ /$$  | $$      |______/      /$$  | $$| $$____/    | $$  /$$$$$$$| $$  \\ $$| $$| $$$$$$$");
		System.out.println("| $$  \\ $$| $$  | $$                   | $$  | $$| $$         | $$ /$$__  $$| $$  | $$| $$| $$____/");
		System.out.println("| $$$$$$$/|  $$$$$$/                   |  $$$$$$/| $$         | $$|  $$$$$$$| $$$$$$$/| $$|  $$$$$$");
		System.out.println("|_______/  \\______/                     \\______/ |__/         |__/ \\_______/|_______/ |__/ \\______/");
	}
	
	public static void cls() {
		for (int i = 0; i < 101; i++) {
			System.out.println();
		}
	}
	
	public static void simulMenu() {
		int inputnum1, inputnum2;
		do {
			System.out.print("Input the first number [1-100](inclusive): ");
			inputnum1 = sc.nextInt(); sc.nextLine();
		} while (inputnum1 < 1 || inputnum1 > 100);
		
		do{
			System.out.print("Input the second number [1-100](inclusive): ");
			inputnum2 = sc.nextInt(); sc.nextLine();
		}while (inputnum2 < 1 || inputnum2 > 100);
		
		String sType = Integer.toString(inputnum1) + " + " + Integer.toString(inputnum2);
		char cType1 = (char) inputnum1;
		char cType2 = (char) inputnum2;
		int iType = inputnum1*inputnum2;
		float fType = (float) inputnum1/inputnum2;
		boolean bType = false;
		if (inputnum1 == inputnum2) bType = true;
		
		
		System.out.println("+=========================================================================================================================+");
		System.out.println("+  + (String type)  |  (Character Type)  |  * (Integer Type)  |  / (Floating Type)  |  input 1 == input 2 (Boolean Type)  +");
		System.out.println("+=========================================================================================================================+");
		System.out.printf("| %-18s| %8c  %-9c| %-19s| %-20.3f| %-36s|\n", sType, cType1, cType2, iType, fType, bType);
		System.out.println("+=========================================================================================================================+");
		System.out.println("+===========================================================+");
		System.out.println("+Data Type : Integer                                        +");
		System.out.println("+===========================================================+");
		System.out.println("+     +     |     -     |     *     |     /     |     %     +");
		System.out.println("+===========================================================+");
		System.out.printf("+ %-10d| %-10d| %-10d| %-10d| %-10d+\n", (inputnum1 + inputnum2), (inputnum1 - inputnum2), (inputnum1 * inputnum2), (inputnum1 / inputnum2), (inputnum1 % inputnum2));
		System.out.println("+===========================================================+");
		sc.nextLine();
		cls();
		
		boolean value1, value2;
		
		do{
			System.out.print("Give me value for p1 [true | false]: ");
			value1 = sc.nextBoolean();
		}while(value1 != false && value1 != true);
		
		do{
			System.out.print("Give me value for p2 [true | false]: ");
			value2 = sc.nextBoolean();
		}while (value2 != false && value2 != true);
		
		char p1;
		if (value1 == true) p1 = 'T';
		else p1 = 'F';
		
		char p2;
		if (value2 == true) p2 = 'T';
		else p2 = 'F';
		
		System.out.println("+=====================================================================+");
		System.out.println("+Logical Table                                                        +");
		System.out.println("+=====================================================================+");
		System.out.printf("+ P1 = %c , P2 = %c                                                     +\n", p1, p2);
		System.out.println("+=====================================================================+");
		System.out.println("+       !P1       |       !P2       |       &&       |       ||       +");
		System.out.println("+=====================================================================+");
		System.out.printf("+ %-16s| %-16s| %-15s| %-15s|\n", (!value1), (!value2), (value1 && value2), (value1 || value2));
		System.out.println("+=====================================================================+");
		sc.nextLine();
		sc.nextLine();
		cls();
	}

	public static void main(String[] args) {
		new Main();
	}

}

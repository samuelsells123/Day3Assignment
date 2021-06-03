import java.util.Scanner;

public class DayThree {
	public static Scanner scan;
	
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		int select = 0;
		
		printProblems();
		
		while(select != 12) {
			bufferPrint("1-10 \t: Problems" + "\n"
						+ "11 \t: Print Problems List" + "\n"
						+ "12 \t: Exit");
			
			System.out.print("Make a Decision: ");
			
			select = scan.nextInt();
			
			switch(select) {
				case 1:
					DayThree.problem1();
					break;
				case 2:
					DayThree.problem2();
					break;
				case 3:
					DayThree.problem3();
					break;
				case 4:
					DayThree.problem4();
					break;
				case 5:
					DayThree.problem5();
					break;
				case 6:
					DayThree.problem6();
					break;
				case 7:
					DayThree.problem7();
					break;
				case 8:
					DayThree.problem8();
					break;
				case 9:
					DayThree.problem9();
					break;
				case 10:
					DayThree.problem10();
					break;
				case 11:
					DayThree.printProblems();
					break;
				case 12:
					System.out.println("\n" + "Exiting...");
					break;
				default:
					bufferPrint("None Chosen");
			}
		}
		
		scan.close();
	}
	
	public static void printProblems() {
		System.out.println("\n" + "Day 3:\r\n"
				+ "-----------------------\r\n"
				+ "Collections:\r\n"
				+ "1. Write a Java program of swap two elements in an array list which holds the strings.\r\n"
				+ "2.  Write a program to clone an array list to another array list using clone() of arraylist.\r\n"
				+ "3. Iterate a linked list in reverse order.\r\n"
				+ "4. Write a Java program to insert the specified element at the end of a linked list using offerLast().\r\n"
				+ "5. Search an element in a array list\r\n"
				+ "6. Write a program to join two array lists\r\n"
				+ "Comprable and Compartor:\r\n"
				+ "7. Write a program to compare the ranking of Player where Player class has ranking, name and age as attributes using comparabel interface.\r\n"
				+ "8. Write a program to compare the  Player based on age and ranking using Comparator interface.\r\n"
				+ "FileIO:\r\n"
				+ "9. Wrie a program to Open a text file so that you can read the file one line at a time.\r\n"
				+ " Read each line as a String and print the total number of characters.\r\n"
				+ "\r\n"
				+ "Lambda:\r\n"
				+ "10. Write a lambda expression to generate the square of a number.");
	}
	
	public static void bufferPrint(String message) {
		System.out.println("\n" + message + "\n");
	}
	
	public static void problem1() {
		bufferPrint("");
		
		
	}
	
	public static void problem2() {
		bufferPrint("");
		
		
	}
	
	public static void problem3() {
		bufferPrint("");
		
		
	}
	
	public static void problem4() {
		bufferPrint("");
		
		
	}
	
	public static void problem5() {
		bufferPrint("");
		
		
	}
	
	public static void problem6() {
		bufferPrint("");
		
		
	}
	
	public static void problem7() {
		bufferPrint("");
		
		
	}
	
	public static void problem8() {
		bufferPrint("");
		
		
	}
	
	public static void problem9() {
		bufferPrint("");
		
		
	}
	
	public static void problem10() {
		bufferPrint("");
		
		
	}
}
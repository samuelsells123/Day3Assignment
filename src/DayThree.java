import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class DayThree {
	public static Scanner scan;
	
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		int select = 0;
		
		//printProblems();
		
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
				+ "10. Write a lambda expression to generate the square of a number.\n");
	}
	
	public static void bufferPrint(String message) {
		System.out.println("\n" + message + "\n");
	}
	
	public static void problem1() {
		bufferPrint("Swap Two Elements in an ArrayList");
		
		ArrayList<String> arr = new ArrayList<>();
		
		arr.add("Swap");
		arr.add("These");
		arr.add("Values");
		
		
		System.out.println("Array: " + arr + "\n\n"
							+ "Swapping first two values");
		
		Collections.swap(arr, 0, 1);
		
		bufferPrint("Array: " + arr);
	}
	
	public static void problem2() {
		bufferPrint("Clone ArrayList");
		
		ArrayList<String> arr = new ArrayList<>();
		
		arr.add("Clone");
		arr.add("This");
		arr.add("List");
		
		System.out.println("First ArrayList: " + arr + "\n");
		
		System.out.println("Cloning ArrayList");
		
		ArrayList<String> newList = (ArrayList<String>) arr.clone();
		
		bufferPrint("New ArrayList: " + newList);
	}
	
	public static void problem3() {
		bufferPrint("Iterate LinkedList in Reverse Order");
		
		LinkedList<Integer> list = new LinkedList<>();
		
		for(int i = 1; i <= 10; i++)
			list.add(i);
		
		System.out.println("Linked List: " + list + "\n\n" 
							+ "Printing list in reverse order" + "\n");
		
		//ListIterator<Integer> itr = list.listIterator(list.size());
		
		/*while(itr.hasPrevious()) {
			System.out.print(itr.previous() + ", ");
		}*/
		
		for(int i = list.size()-1; i >= 0; i--) {
			System.out.print(list.get(i) + ", ");
		}
		
		System.out.println("\n");
	}
	
	public static void problem4() {
		bufferPrint("Insert Specified Element at the End of a LinkedList");
		
		LinkedList<Integer> list = new LinkedList<>();
		
		for(int i = 1; i <= 10; i++)
			list.add(i);
		
		System.out.println("Linked List: " + list + "\n");
		
		System.out.println("Using offerLast function to insert 56 into linked list" + "\n");
		list.offerLast(56);
		
		System.out.println("Linked List: " + list + "\n");
	}
	
	public static void problem5() {
		bufferPrint("Search Element in ArrayList");
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 1; i <= 10; i++)
			list.add(i);
		
		System.out.println("Array List: " + list + "\n");
		
		for(int i = 2; i < 10; i += 3)
			System.out.println("index of " + i + ": " + list.indexOf(i));
		System.out.println();
	}
	
	public static void problem6() {
		bufferPrint("Join Two ArrayLists");
		
		ArrayList<Integer> listOne = new ArrayList<>();
		ArrayList<Integer> listTwo = new ArrayList<>();
		
		for(int i = 1; i < 4; i++)
			listOne.add(i);
		for(int i = 4; i < 7; i++)
			listTwo.add(i);
		
		System.out.println("First List \t: " + listOne + "\n"
							+ "Second List \t: " + listTwo + "\n\n"
							+ "Adding second list to first" + "\n");
		
		listOne.addAll(listTwo);
		
		System.out.println("First List \t: " + listOne + "\n");
	}
	
	public static void problem7() {
		bufferPrint("Compare Player Ranking Using Interface");
		
		ArrayList<Player> p = new ArrayList<>();
		
		p.add(new Player(5, "Alex", 27));
		p.add(new Player(3, "Ryan", 27));
		p.add(new Player(14, "Sam", 23));
		p.add(new Player(14, "Emily", 23));
		p.add(new Player(14, "Rachel", 18));
		
		System.out.println("Name" + "\t" + "Ranking" + "\t" + "Age");
		
		for(int i = 0; i < p.size(); i++) {
			System.out.println(p.get(i).getName() + "\t" 
								+ p.get(i).getRanking() + "\t"
								+ p.get(i).getAge());
		}
			
		System.out.println("\n" + "compareTo results:");
		
		for(int i = 1; i < p.size(); i++) {
			System.out.println(p.get(i-1).getName() + " compareTo "
								+  p.get(i).getName() + "\t: "
								+ p.get(i-1).compareTo(p.get(i)));
		}
		
		System.out.println();
	}
	
	public static void problem8() {
		bufferPrint("Compare Player Based On Age and Ranking");
		
		PlayerComparator pc = new PlayerComparator();
		
		ArrayList<Player> p = new ArrayList<>();
		
		p.add(new Player(5, "Alex", 27));
		p.add(new Player(3, "Ryan", 27));
		p.add(new Player(14, "Sam", 23));
		p.add(new Player(14, "Emily", 23));
		p.add(new Player(14, "Rachel", 18));
		
		System.out.println("Name" + "\t" + "Ranking" + "\t" + "Age");
		
		for(int i = 0; i < p.size(); i++) {
			System.out.println(p.get(i).getName() + "\t" 
								+ p.get(i).getRanking() + "\t"
								+ p.get(i).getAge());
		}
			
		System.out.println("\n" + "compare results:");
		
		for(int i = 1; i < p.size(); i++) {
			System.out.println("compare " + p.get(i-1).getName()
								+ ", " +  p.get(i).getName() + "\t: "
								+ pc.compare(p.get(i-1), p.get(i)));
		}
		
		System.out.println();
	}
	
	public static void problem9() {
		bufferPrint("Print Number of Characters in Each Line of a .txt File");
		
		
	}
	
	public static void problem10() {
		bufferPrint("Lambda Expression to Generate Square of a Number");
		
		
	}
}
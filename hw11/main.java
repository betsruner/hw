
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		boolean run = true;
		int choice;
		String filename;
		ArrayList<Person> people = new ArrayList<>();
		
		int count = 0;
		
		while (run == true) {
			System.out.println("");
			System.out.println("###########################################");
			System.out.println("1. Add Person into file");
			System.out.println("2. Retrieve Information from a file and display");
			System.out.println("3. Exit");
			System.out.println("###########################################");
			choice = kb.nextInt();
			kb.nextLine();
			
			if (choice == 1) {
				//Variables
				String personName;
				ArrayList<Integer> phoneNumber = new ArrayList();
				int d,m,y,tempPhone;
				
				//Filename
				System.out.print("What would you like the file to be named: ");
				filename = kb.nextLine();
				
				//Filling Variables
				System.out.println("What is your Person's name: ");
				personName = kb.nextLine();
				
				System.out.println("What is your Person's Phone Number: ");
				tempPhone = kb.nextInt();
				
				System.out.println("What is day of the month was your person born on (1-31): ");
				d = kb.nextInt();
				
				System.out.println("What is month was your person born(1-12): ");
				m = kb.nextInt();
				
				System.out.println("What is year was your person born: ");
				y = kb.nextInt();
				
				phoneNumber.add(tempPhone);
				//Creating Person
				Person fill = new Person(personName, phoneNumber, d,m,y);
				people.add(fill);
				//Adding Person to file
				try {
					writeToFile(people, filename);
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
				count++;
			}
			else if (choice == 2) {
				System.out.print("What file would you like to read: ");
				filename = kb.nextLine();
				try {
					readFile(filename,count);
				} catch (ClassNotFoundException | IOException e) {
					System.out.println(e.getMessage());
				}
			}
			else {run = false;}
		}
	}
	
	public static void writeToFile(ArrayList<Person> list, String filename) throws IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename));
		oos.writeObject(list);
	}
	
	public static void readFile(String filename,int count) throws IOException, ClassNotFoundException {
		ArrayList<Person> people = new ArrayList<>();
		  try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename));) {
		    Object p = ois.readObject();
		    System.out.println(p.toString());
		      people.add((Person) p);
		  } catch (Exception e) {
		    // System.out.println(e.printStackTrace());
		}	
	}
	

}



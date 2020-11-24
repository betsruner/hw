
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Hashtable;

public class Person implements Serializable{
	private String name;
	private ArrayList<Integer> phoneNumbers;
	private Hashtable<String, Integer> DoB = new Hashtable<String, Integer>();
	private int D,M,Y;
	
	public Person() {
		super();
		name = "Unknown";
		DoB.put("D", 0);
		DoB.put("M", 0);
		DoB.put("Y", 0);
	}

	public Person(String name, ArrayList<Integer> phoneNumbers, int d, int m, int y) {
		super();
		this.name = name;
		this.phoneNumbers = phoneNumbers;
		D = d;
		M = m;
		Y = y;
		DoB.put("D", d);
		DoB.put("M", m);
		DoB.put("Y", y);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Integer> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(ArrayList<Integer> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public Hashtable<String, Integer> getDoB() {
		return DoB;
	}

	public void setDoB(Hashtable<String, Integer> doB) {
		DoB = doB;
	}

	public int getD() {
		return D;
	}

	public void setD(int d) {
		D = d;
	}

	public int getM() {
		return M;
	}

	public void setM(int m) {
		M = m;
	}

	public int getY() {
		return Y;
	}

	public void setY(int y) {
		Y = y;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", phoneNumbers=" + phoneNumbers + ", DoB=" + DoB + "]";
	}
	
}

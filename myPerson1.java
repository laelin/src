import java.util.*;

public class myPerson1 {
	
	
	private String guestName;
	private int age;
	private int stars;
	

	//method inside object(class) myPerson1.
	public void helloMessage(String aName, int aStars) {
		
		System.out.println("Hello there "+aName+"You have "+aStars);
		
	}
	
	
	
	
	public int getStars() {
		return stars;
	}




	public void setStars(int stars) {
		this.stars = stars;
	}




	// friend message method??
	public void friendMessage(String aName, int aAge) {
		
		System.out.println("Hello there, "+aName+".\nYour age is, "+aAge);
		
	}
	
	public String getGuestName() {
		return guestName;
	}

	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	//main method
	public static void main(String [] args) {
		Scanner kb = new Scanner(System.in); // for user input
		
		System.out.println("Enter self or guest");
		
		String profile = kb.nextLine();
		
		if (profile.equalsIgnoreCase("self")) {
			
		myPerson1 display = new myPerson1();// Creating a new object(the object has the methods, we need to import the object into the main to we can use the helloMessage method) called display.
		
		
		System.out.println("Enter your name");
		String name = kb.nextLine();
		
		System.out.println("Enter the number of stars.");
		int stars= kb.nextInt();
		display.setStars(stars);
		
		display.helloMessage(name, stars);
		}
		
		else if (profile.equalsIgnoreCase("guest")) {
			
			myPerson1 display = new myPerson1();
			
			System.out.println("What is your name, guest?");
			String guestName= kb.nextLine();
			
			display.setGuestName(guestName);
			
			System.out.println("What is your age, guest?");
			int age = kb.nextInt();
			
			display.setAge(age);
			
			display.friendMessage(guestName, age);
			
			

// i was here
		}
	}

	
}

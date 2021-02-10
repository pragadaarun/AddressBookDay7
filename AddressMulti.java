import java.util.ArrayList;
import java.util.Scanner;

public class AddressMulti {
	Scanner input = new Scanner(System.in);
	static ArrayList<Book> Pages = new ArrayList<Book>();
	int length = Pages.size();

	static boolean exit = false;

	void addNew() {

		System.out.println("Enter the number of Persons to add in Address Book");
		int count = input.nextInt();

		for (int i = 0; i < count; i++) {
			Book b1 = new Book();
			System.out.println("Enter ID");
			b1.setId(input.nextInt());
			System.out.println("Enter the First Name");
			b1.setFname(input.next());
			System.out.println("Enter the Last Name");
			b1.setLname(input.next());
			System.out.println("Enter the city");
			b1.setCity(input.next());
			System.out.println("Enter the state");
			b1.setState(input.next());
			System.out.println("Enter the Zip Code");
			b1.setZipCode(input.next());
			System.out.println("Enter the Phone Number");
			b1.setPhone(input.next());
			System.out.println("Enter the Email Address");
			b1.setEmail(input.next());
			System.out.println("Adding the records " + b1.toString());

			Pages.add(b1);

			System.out.println(Pages.toString());

		}

	}
		void update() {
			System.out.println("Enter the First Name to update");
			String nameUpdate=input.next();
			Book bookUpdate=null;
			for(int index=0; index<=Pages.size(); index++)
			{   
				if(Pages.get(index).getFname().equals(nameUpdate))
				{
					bookUpdate=Pages.get(index);
					pageIndex=1;
					break;
				}
				
			}
			
			if(pageIndex==-1)
			{
				System.out.println("There is no such person in the Address Book");
				
			}
			
			else
			{
				System.out.println("Choose field of person details that wanted to update");
				
				System.out.println("1 --> Change First Name");
				System.out.println("1 --> Change Last Name");
				System.out.println("2 --> Change City");
				System.out.println("3 --> Change State");
				System.out.println("4 --> Change Zip Code");
				System.out.println("5 --> Change Number");
				System.out.println("6 --> Change Email");
				int change=sc.nextInt();
				 switch(change)
				 {
					case 1:
						System.out.println("Enter the First Name");
						bookUpdate.setFname(input.next());
						break;
					case 2:
						System.out.println("Enter the Last Name");
						bookUpdate.setLname(input.next());
						break;
					case 3:
						System.out.println("Enter the City");
						bookUpdate.setCity(input.next());
						break;	 
					case 4:
						System.out.println("Enter the State");
						bookUpdate.setState(input.next());
						break;	 
					case 5:
						System.out.println("Enter Zip Code");
						bookUpdate.setZipCode(input.next());
						break;	 
					case 6:
						System.out.println("Enter the Phone Number");
						bookUpdate.setPhone(input.next());
						break;	 
					case 7:
						System.out.println("Enter Email");
						bookUpdate.setEmail(input.next());
						break;
					default:
						System.out.println("There is no option for that")
				 }	
			}		
		}
		 
		void delete() {
	        	System.out.println("Enter the User Name to delete");
	    		String nameDelete=input.next();
	    		Book bookUpdate=null;
	    		int pageIndex=-1;
	    		for(int index=0; index<=Pages.size();index++)
	    		{   
	    			if(Pages.get(index).getFsname().equals(nameDelete))
	    			{
		    			bookUpdate=Pages.remove(index);
		    		    	pageIndex=1;
	    		    		break;
	    			}
		}
	}
		
	static void print() {

		System.out.println(Pages.toString());

	}
	 
	static void end() {
         	System.out.println("Bye");
		exit=true;
	}

	public static void main(String[] args) {

		while (!exit) {
			Scanner input = new Scanner(System.in);
			System.out.println("Execution Details");
			System.out.println("1. To Add Person Detail");
			System.out.println("2. To Print all Persons Details");
			System.out.println("3. To Update the Address Book");
			System.out.println("4. To Delete the Person Detail ");
			System.out.println("5. Exit");
			System.out.println("Enter the number for executing");
			int choice = input.nextInt();
			switch (choice) {
			case 1:
				new AddressMulti().addNew();
				break;
			case 2:
				print();
				break;
			case 3:
				new AddressMulti().update();
				break;
			case 4:
				new AddressMulti().delete();
				break;
			case 5:
				end();
				break;
			default:
				System.out.println("That is Wrong Option, choose correct one");
			}
		}
	}

}
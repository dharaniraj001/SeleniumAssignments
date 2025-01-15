package assignments.week2.day1Assignment;

public class Library {

	
		// TODO Auto-generated method stub
		
		public String addBook(String bookTitle) {
			System.out.println("Book added successfully");
			return(bookTitle);
			
		}
		
		public void issueBook() {
			System.out.println("Book issued successfully");
		}
		
		public static void main(String[] args) {
			Library obj1 = new Library();
			obj1.addBook(null);
			obj1.issueBook();
		}
		
	}



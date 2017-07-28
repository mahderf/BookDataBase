package bookdata;
 import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Bookdata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //adding object of Bookprop class
		BookProp bkedt=new BookProp();
		
		String bkinf;
		boolean cont= true;
		// Declaring the Arraylist and instantiating it
		
		ArrayList <BookProp> bookstaff;
		bookstaff= new ArrayList <BookProp>();
		// Adding a  Scanner
		Scanner scan= new Scanner(System.in);
	// add to the arraylist
		while(cont)
		{
		System.out.println("Please enter your book information");
		 System.out.println("What is the Sku of your book?");
		  String tsku= scan.nextLine();
		  bkedt.setSku(tsku);
		  
		  
		  System.out.println("Please enter the title of the book");
		  String tile = scan.nextLine();
		  bkedt.setTitle(tile);
		  
		  System.out.println("Please enter the name of the Author:");
		  String tathr= scan.nextLine();
		  bkedt.setAuthor(tathr);
		  
		  System.out.println("Please enter the a short description of the book: ");
		  String tdesc= scan.nextLine();
		  bkedt.setDiscription(tdesc);
		  
		  System.out.println("Please enter the price of the book:");
		  double tprc=scan.nextDouble();
		  bkedt.setPrice(tprc);
		  bookstaff.add(bkedt);
		  System.out.println("Do you wanto add more books? (y/n)" );
		  String response=scan.next();
		  scan.nextLine();
		  if(response.equalsIgnoreCase("n"))
		  {
			  cont=false;
		  }
		  else if(!response.equalsIgnoreCase("y"))
		  {
			  System.out.println("that is not an option");
		  }
		}
		for (BookProp cnd:bookstaff)
		{
			
		
		  System.out.println("Book SKU: " + cnd.getSku());
		  System.out.println("Book Title: " + cnd.getTitle());
		  System.out.println("Book Author :" + cnd.getAuthor());
		  System.out.println("Book Description : " + cnd.getDiscription());
		  System.out.println("Book price: " + cnd.getPrice());
		}
		  
	}
}

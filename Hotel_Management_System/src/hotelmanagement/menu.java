package hotelmanagement;

import java.sql.SQLException;
import java.util.Scanner;


public class menu {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		System.out.println("*************************");
		System.out.println("       BREWBERRYS         ");
		System.out.println("*************************");
		menu m=new menu();
		m.login();
			}
			void login() throws ClassNotFoundException, SQLException 
			{
				Scanner s=new Scanner(System.in);
				System.out.println("\n");
				System.out.println("       1.ADMIN LOGIN\n       2.CUSTOMER LOGIN\n       3.EXIT\n       ENTER YOUR CHOICE");
				int n=s.nextInt();
				if(n==1)
				{
					//creating admin  class
				Admin1 ad=new Admin1();
				ad.admin1();
				}
				else if(n==2)
				{
					//creating and calling customer class
					Customer1 cu=new Customer1();
					cu.agent();
				}
				else 
				{
					System.out.println("PROCESS COMPLETE");
					System.exit(0);
				
				
				
	}

}
}
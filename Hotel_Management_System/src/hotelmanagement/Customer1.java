package hotelmanagement;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Customer1 {
	//connectionmanager is a class and con is the object;
	ConnectionManager con=new ConnectionManager();
	Scanner s=new Scanner(System.in);
	void agent() throws ClassNotFoundException, SQLException
	{
		int flag=0;
		do {
		System.out.println("       1.NEW CUSTOMER\n       2.LOGIN\n       3.LOGOUT\n       ENTER YOUR CHOICE\n");
		int n=s.nextInt();
		
	     if(n==1)
	     {
	    	 
	     int match=0;
	    	 do {
			System.out.println("Enter the username");
			String name=s.next();
			System.out.println("Enter the password");
			String pw=s.next();
			//pattern for email
			String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
			//pattern for password
			Pattern pswNamePtrn = Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,15})");
			 //pattern is object and Pattern is a class
			Pattern pattern = Pattern.compile(regex);
			//Matcher is a class ,em is the object and matcher is a method. 
			 Matcher em=pattern.matcher(name);
			 Matcher emm=pswNamePtrn.matcher(pw);
			 //if both password and user name matches 
			 if(em.matches()&&emm.matches())
			 {
				 //query for inserting values into table agent login,getconnection is a method
				 PreparedStatement pr=(PreparedStatement) con.getConnection().prepareStatement("insert into agentlogin(username,password) values(?,?)");
					//setting name @ index 1
				    pr.setString(1,name);
				  //setting password @ index 2
					pr.setString(2,pw);
					pr.executeUpdate();
					match=1;
					//closing connection using con object
					con.getConnection().close();
					flag=1;
					}
					else
					{
						
					   match=0;
						if(!em.matches())
							System.out.println("invalid user name ");
						if(!emm.matches())
							System.out.println("invalid password ");
					}
	    	 }while(match==0);
			 }
	     else if(n==2)
	     {
	    	 int match1=0;
	    	 do {
	    	 System.out.println("ENTER NAME");
	 		String name=s.next();
	 		System.out.println("ENTER PASSWORD");
	 		String pw=s.next();
	 		java.sql.Statement s1=con.getConnection().createStatement();
	 		//selecting all the values from table 
	 		ResultSet r=s1.executeQuery("select * from agentlogin");
	 		while(r.next())
	 		{
	 			String name1=r.getString(1);
	 			String pw1=r.getString(2);
	 			if(name1.equals(name)&&pw1.equals(pw)) {
	 				match1=1;
	 				System.out.println("Successfully verified");
	 		}}
	 		if(match1==0)
	 			System.out.println("Invalid username and pass word");
	    	 }while(match1==0);
	 		int ok=0;
	 		if(match1==1)
	 		{
	 		do {	
	 			System.out.println("        1)Buy an item\n        2)View items\n        3)Back to homepage\n         Enter your choice\n");
				int num=s.nextInt();
				if(num==1) {
				int i=1;
				flag=1;
				java.sql.Statement s11=con.getConnection().createStatement();
				//selecting all the values from table 
				ResultSet r1=s11.executeQuery("select * from addproduct");
				
				System.out.println("\n");
				System.out.println("*******MENU********");
				while(r1.next())
				{
				
				System.out.printf("***FOOD %d***\n",i);
				System.out.println("FOOD ID -> "+r1.getInt(1));
				System.out.println("NAME OF FOOD -> "+r1.getString(2));
					i++;
	 		     }
				System.out.println();
				System.out.println("Enter the id you want to buy");
				int id=s.nextInt();
				System.out.println("ENTER QUANTITY");
				int quantity=s.nextInt();
				java.sql.Statement ss=con.getConnection().createStatement();
				//selecting all the values from table 
				ResultSet r11=ss.executeQuery("select * from addproduct");
				int q=0,qa=0;
				while(r11.next())
				{
					
					if(r11.getInt(1)==id) {
						q=r11.getInt(3);
						qa=r11.getInt(4);
						break;
				}}
				if(q<quantity) {
					ok=1;
				
					System.out.println("There is no enough product");
					}
				else
				{
				int total=qa*quantity;
				int tt=total;
				System.out.println("       1.Take away\n       2.Home Delivery\n       3.Table Reservation\n        Enter your choice");
				int ch=s.nextInt();
				if(ch==1)
				System.out.printf("total cost is %d",total);
				if(ch==2)
				{
					total=total+50;
					System.out.printf("total cost is %d",               total);
				}
				if(ch==3)
				{
					total=total+100;
					System.out.printf("total cost is %d",total);
				}
				
				System.out.println("\nenter 1 for confirm booking");
				int n1=s.nextInt();
				if(n1==1)
				{
					ok=1;
					System.out.println("BOOKED\n");
					System.out.println("THANK YOU\n");
					int t=q-quantity;
					//updating quantity,update tablename set quantity =?where id=?;
				PreparedStatement pr=(PreparedStatement) con.getConnection().prepareStatement("update addproduct set quantity=? where productid=?");
				pr.setInt(1,t);
				pr.setInt(2,id);
				pr.executeUpdate();
				//printing bill
				
				System.out.println("*****Bill*****\n");
				//selecting all data from table
				ResultSet r12=ss.executeQuery("select * from addproduct");
				String pname="";
				while(r12.next())
				{
					
					if(r12.getInt(1)==id) {
						pname=r12.getString(2);
						
						break;
				}}
				
				System.out.println("Name of food  "+pname);
				System.out.println("Quantity of food   "+quantity);
				System.out.println("Cost of food   "+tt);
				if(ch==1)
					System.out.println("Take away :no charge");
				
				if(ch==2) 
					System.out.printf("Home Delivery charge %d\n",50);
				if(ch==3)
					System.out.printf("Table booking charge %d\n",100);
				System.out.println("Total Cost of food   "+total);
				System.out.println("\n*******************");
				
				
				
				
				
				con.getConnection().close();
				}
				else {
					ok=1;
					
				}
				}}
				else if(num==2)
				{
					int i=1;
					java.sql.Statement s11=con.getConnection().createStatement();
					//selecting all the values from table 
					ResultSet r1=s11.executeQuery("select * from addproduct");
					
					System.out.println("\n");
					System.out.println("*******MENU********");
					while(r1.next())
					{
					
					System.out.printf("***FOOD %d***\n",i);
					System.out.println("FOOD ID -> "+r1.getInt(1));
					System.out.println("NAME OF FOOD -> "+r1.getString(2));
					System.out.println("QUANTITY OF FOOD -> "+r1.getInt(3));
					System.out.println("PRICE OF FOOD -> "+r1.getInt(4));
						i++;
						ok=1;
						System.out.println();
					}
					System.out.println("*************************");
				}
				else
				{
					menu m=new menu();
					m.login();
				}
	 		 }while(ok==1);
				
	 		}
	 }
	     else
	     {
	    	 menu m=new menu();
				m.login(); 
	     }
	     
		}while(flag==1);
	}

}

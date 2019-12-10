package hotelmanagement;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
public class Admin1 {
	ConnectionManager con=new ConnectionManager();
	Scanner s=new Scanner(System.in);
	static int dis=0;
	public void admin1() throws ClassNotFoundException, SQLException {
		
	int ok=0,up=0,f=0,okk=0;
	do {
		System.out.println("ENTER NAME");
		String name=s.next();
		System.out.println("ENTER PASSWORD");
		String pw=s.next();
		//creating connection to database
		java.sql.Statement s1=con.getConnection().createStatement();
		//selecting details from table
		ResultSet r=s1.executeQuery("select * from adminlogin");
		//selecting all the values from table 
		int flag=0;
		while(r.next())
		{
			String name1=r.getString(1);
			String pw1=r.getString(2);
			if(name1.equals(name)&&pw1.equals(pw)) {
				flag=1;
				f=0;
				System.out.println("Successfully verified");}
		}
		if(flag==1)
		{
		do {	
		ok=0;
			System.out.println("1.ADD FOOD\n2.DISPLAY\n3.REMOVE\n4.UPDATE\n5.EXIT\nENTER YOUR CHOICE");
			int n=s.nextInt();
			if(n==1)
			{
					// TODO Auto-generated method stub
					Scanner s=new Scanner(System.in);
					System.out.println("PRODUCT ID");
					int id=s.nextInt();
					System.out.println("ENTER NAME OF FOOD");
					String name2=s.next();
					System.out.println("FOOD QUANTITY");
					int quantity=s.nextInt();
					System.out.println("FOOD PRICE");
					int price=s.nextInt();
					//insert id,name,quantity,price into table addproduct
					PreparedStatement pr=(PreparedStatement) con.getConnection().prepareStatement("insert into addproduct(productid,productName,quantity,price) values(?,?,?,?)");
					//inserting data at specific index
					pr.setInt(1,id);
					pr.setString(2,name2);
					pr.setInt(3,quantity);
					pr.setInt(4,price);
					pr.executeUpdate();
					//closing connections
					con.getConnection().close();
					System.out.println("DATA ADDED SUCCESSFULLY");
					ok=1;
					dis=1;
					}
			else if(n==2)
			{
				int i=1;
				java.sql.Statement s11=con.getConnection().createStatement();
				ResultSet r1=s11.executeQuery("select * from addproduct");
				//to view the products from addproduct table
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
			else if(n==3)
			{
				int i=1;
				java.sql.Statement s11=con.getConnection().createStatement();
				//selecting all datas from table add product
				ResultSet r1=s11.executeQuery("select * from addproduct");
				//for printing the details we want to get whole data from  addproduct ie displayed here
				System.out.println("*************************");
				System.out.println("*******BREWBERRYS********");
				System.out.println("*************************");
				System.out.println("\n");
				System.out.println("*******MENU********");
				while(r1.next())
				{
				
				System.out.printf("***FOOD %d***\n",i);
				System.out.println("FOOD ID -> "+r1.getInt(1));
				System.out.println("NAME OF FOOD -> "+r1.getString(2));
					i++;
				
				}
				System.out.println("*************************");
				System.out.println("*************************");
				System.out.println("PRODUCT ID OF PRODUCT YOU WANT TO DELETE");
				int id=s.nextInt();
				//delete from tablename where id=?;
				PreparedStatement pr=(PreparedStatement) con.getConnection().prepareStatement("delete from addproduct where Productid=?");
				// to delete a product from addproduct table
				pr.setInt(1,id);
				pr.executeUpdate();
				con.getConnection().close();
				System.out.println("DATA DELETED SUCCESSFULLY");
				ok=1;
			}
			else if(n==4)
			{
				int i=1;
				java.sql.Statement s11=con.getConnection().createStatement();
				//selecting all the values from table 
				ResultSet r1=s11.executeQuery("select * from addproduct");
				System.out.println("*******MENU********");
				while(r1.next())
				{
				
				System.out.printf("***FOOD %d***\n",i);
				System.out.println("FOOD ID -> "+r1.getInt(1));
				System.out.println("NAME OF FOOD -> "+r1.getString(2));
					i++;
				
				}
				
				System.out.println("enter the id");
				int id1=s.nextInt();
				//selecting all the values from table 
				ResultSet r12=s11.executeQuery("select * from addproduct");
				while(r12.next())
				{
					
					if(r12.getInt(1)==id1) {
						okk=1;
						break;
						
					}
						
					}
				if(okk==1)
				{
				System.out.println("1.Name  (2)\n2.quantity(3)\n3.price  (4)\n enter number of fields you want to update");
				  int c=s.nextInt();
				  System.out.println("enter the fields");
				 int a[]=new int[c];
				  int j=0;
				  up=0;
				  for(j=0;j<c;j++)
				 {
				a[j]=s.nextInt();
				  }
				  for(j=0;j<c;j++)
				  {
					 
				  if(a[j]==2)
				 {
				  System.out.println("ENTER NEW NAME");
					String name1=s.next();
					//selecting all the values from table 
				  ResultSet r11=s11.executeQuery("select * from addproduct");
					int q=0,na=0;
					String na1="";
					while(r11.next())
					{
						
						if(r11.getInt(1)==id1) {
							 na1=r11.getString(2);
						na=1;
						break;
					}
					}
					if(na==1)
					{
						//updating name
						//update tablename set name=?,where id=?
					PreparedStatement p1r=(PreparedStatement) con.getConnection().prepareStatement("update addproduct set ProductName=? where Productid=?");
					p1r.setString(1,name1);
					p1r.setInt(2,id1);
					if(name1.equals(na1))
					up=0;
					p1r.executeUpdate();
					
					}
					else
					System.out.println("Not present");
					}
					if(a[j]==4)
				  {
				  System.out.println("ENTER NEW PRICE");
					int price=s.nextInt();
					//selecting all the values from table 
				 ResultSet r11=s11.executeQuery("select * from addproduct");
					int p=1;
					while(r11.next())
					{
						
						if(r11.getInt(1)==id1) {
						p=1;
						break;
					}
					}
					if(p==1)
					{
						//updating price update tablename set price=?,where id=?
					PreparedStatement p1r=(PreparedStatement) con.getConnection().prepareStatement("update addproduct set Price=? where Productid=?");
					p1r.setInt(1,price);
					p1r.setInt(2,id1);
					p1r.executeUpdate();
					}
					else
					System.out.println("Not present");
					}
					if(a[j]==3)
					{
				int total=0;
					System.out.println("ENTER NEW QUANTITY");
					int qnt=s.nextInt();
					int q=0;
					if(up==0)
					{
						//selecting all the values from table 
					ResultSet r11=s11.executeQuery("select * from addproduct");
					while(r11.next())
					{
						
						if(r11.getInt(1)==id1) {
							q=r11.getInt(3);
							break;
					}}
					}
					else
						q=0;
						total=qnt+q;
						
						//to update the quantity in the addproduct table
						PreparedStatement p1r=(PreparedStatement) con.getConnection().prepareStatement("update addproduct set quantity=? where productid=?");
						
						p1r.setInt(1,total);
						p1r.setInt(2,id1);
						p1r.executeUpdate();
						}}
					con.getConnection().close();
					
					System.out.println("Updated successfully");
					ok=1;
					}
			
			else
			{
				System.out.println("ID NOT PRESENT");
				ok=1;
			}
			}
		else
		{
			menu m=new menu();
			m.login();
		}
			}while(ok==1);
		}
		else {
			
			System.out.println("Invalid username &password");
			f=1;
			}
	}while(f==1);
	
	}}

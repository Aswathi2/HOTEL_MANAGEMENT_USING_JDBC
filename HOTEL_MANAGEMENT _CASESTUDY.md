HOTEL MANAGEMENT SYSTEM




DATABASE	 & SERVER	:

	Database name:	Hotelmanagement

	Server		:	 localhost

TABLES  &  FIELDS 	:	

	Table1:	adminlogin(username, password)

	Table2:	userlogin   (username, password)

	Table3:	addproduct(productid, productname, quantity, price)

The above are the some of the things you need to notice while doing this case-study.

Step 1 :
	The program should display the menu as follows
	1. Admin Login (Fields : Username, Password)
	2. User Login 	(Fields : Username, Password)
	3. Exit
Step 2:
	 If 1 is pressed, get the admin login details and validate. On valid log-in, show the below menu
	1. Add Product (Fields : Product Id, Product Name, Quantity, Price)
	2. Display Products ( Product Id , Product Name, Quantity, Price)
	3. Update Products => While selecting this it should display the product details as well as ask for product id and number of fields you want to update and what are all the fields to be updated.
	4.Remove Products=> This will ask for the product id to delete the intended product. Just give the id and it should remove the product form entire menu.
	5. Back to homepage =>While selecting this option you show go back to the home page. And it must show the menu of home page as in Step1.
Step:3 :
If 2 is pressed(from Step 1 menu), it must shows another menu to get us-er login details.
	1. New Customer
	2. Already registered
	3. Back to homepage
If 1st Option is selected ask for new username and password to register and after that show the menu again for logging in.
If 2nd Option is chosen then ask for username and password. Enter the details. If the details are correct the user will be successfully logged in and he get options to view products and to buy them.
If 3rd Option is selected, it will redirect the user to home page.
Inside the user login page, the user will be able to view products and can buy products.
	1.Buy an item
	2.View items
	3.Back to homepage
While option 1 is chosen the user will be able to buy a product by enter-ing the product id, quantity. Then he will be asked for whether he wants home delivery, table booking.
	1.Take away
	2.Home Delivery
	3.Table Reservation
If any of the options are chosen then it will calculate the cost correspond-ing to the selected option.Then booking confirmation will be asked and while confirmation the bill will be generated.
When option 2 is chosen the user may be able to view items. The dis-played item’s quantity will be updated by reducing the quantity of items bought by any user.
While option 3 is chosen the user will be redirected to home page.
The message will be printed as “Logout Successfull”.
Step:4 :
While selecting this option it will exits the program.
OUTPUT:

*************************
       BREWBERRYS         
*************************


       1.ADMIN LOGIN
       2.CUSTOMER LOGIN
       3.EXIT
       ENTER YOUR CHOICE
1
ENTER NAME
Admin
ENTER PASSWORD
Admin@123
Successfully verified
1.ADD FOOD
2.DISPLAY
3.REMOVE
4.UPDATE
5.EXIT
ENTER YOUR CHOICE
1
PRODUCT ID
5
ENTER NAME OF FOOD
SHAWARMA
FOOD QUANTITY
30
FOOD PRICE
60
DATA ADDED SUCCESSFULLY
1.ADD FOOD
2.DISPLAY
3.REMOVE
4.UPDATE
5.EXIT
ENTER YOUR CHOICE
2


*******MENU********
***FOOD 1***
FOOD ID -> 1
NAME OF FOOD -> COFFEE
QUANTITY OF FOOD -> 39
PRICE OF FOOD -> 10

***FOOD 2***
FOOD ID -> 2
NAME OF FOOD -> BIRIYANI
QUANTITY OF FOOD -> 65
PRICE OF FOOD -> 80

***FOOD 3***
FOOD ID -> 3
NAME OF FOOD -> SHAWAI
QUANTITY OF FOOD -> 20
PRICE OF FOOD -> 180

***FOOD 4***
FOOD ID -> 4
NAME OF FOOD -> AL-FAHM
QUANTITY OF FOOD -> 30
PRICE OF FOOD -> 190

***FOOD 5***
FOOD ID -> 5
NAME OF FOOD -> SHAWARMA
QUANTITY OF FOOD -> 30
PRICE OF FOOD -> 60

*************************
1.ADD FOOD
2.DISPLAY
3.REMOVE
4.UPDATE
5.EXIT
ENTER YOUR CHOICE
3
*************************
*******BREWBERRYS********
*************************


*******MENU********
***FOOD 1***
FOOD ID -> 1
NAME OF FOOD -> COFFEE
***FOOD 2***
FOOD ID -> 2
NAME OF FOOD -> BIRIYANI
***FOOD 3***
FOOD ID -> 3
NAME OF FOOD -> SHAWAI
***FOOD 4***
FOOD ID -> 4
NAME OF FOOD -> AL-FAHM
***FOOD 5***
FOOD ID -> 5
NAME OF FOOD -> SHAWARMA
*************************
*************************
PRODUCT ID OF PRODUCT YOU WANT TO DELETE
5
DATA DELETED SUCCESSFULLY
1.ADD FOOD
2.DISPLAY
3.REMOVE
4.UPDATE
5.EXIT
ENTER YOUR CHOICE
2


*******MENU********
***FOOD 1***
FOOD ID -> 1
NAME OF FOOD -> COFFEE
QUANTITY OF FOOD -> 39
PRICE OF FOOD -> 10

***FOOD 2***
FOOD ID -> 2
NAME OF FOOD -> BIRIYANI
QUANTITY OF FOOD -> 65
PRICE OF FOOD -> 80

***FOOD 3***
FOOD ID -> 3
NAME OF FOOD -> SHAWAI
QUANTITY OF FOOD -> 20
PRICE OF FOOD -> 180

***FOOD 4***
FOOD ID -> 4
NAME OF FOOD -> AL-FAHM
QUANTITY OF FOOD -> 30
PRICE OF FOOD -> 190

*************************
1.ADD FOOD
2.DISPLAY
3.REMOVE
4.UPDATE
5.EXIT
ENTER YOUR CHOICE
4
*******MENU********
***FOOD 1***
FOOD ID -> 1
NAME OF FOOD -> COFFEE
***FOOD 2***
FOOD ID -> 2
NAME OF FOOD -> BIRIYANI
***FOOD 3***
FOOD ID -> 3
NAME OF FOOD -> SHAWAI
***FOOD 4***
FOOD ID -> 4
NAME OF FOOD -> AL-FAHM
enter the id
4
1.Name  (2)
2.quantity(3)
3.price  (4)
 enter number of fields you want to update
1
enter the fields
3
ENTER NEW QUANTITY
20
Updated successfully
1.ADD FOOD
2.DISPLAY
3.REMOVE
4.UPDATE
5.EXIT
ENTER YOUR CHOICE
2


*******MENU********
***FOOD 1***
FOOD ID -> 1
NAME OF FOOD -> COFFEE
QUANTITY OF FOOD -> 39
PRICE OF FOOD -> 10

***FOOD 2***
FOOD ID -> 2
NAME OF FOOD -> BIRIYANI
QUANTITY OF FOOD -> 65
PRICE OF FOOD -> 80

***FOOD 3***
FOOD ID -> 3
NAME OF FOOD -> SHAWAI
QUANTITY OF FOOD -> 20
PRICE OF FOOD -> 180

***FOOD 4***
FOOD ID -> 4
NAME OF FOOD -> AL-FAHM
QUANTITY OF FOOD -> 50
PRICE OF FOOD -> 190

*************************
1.ADD FOOD
2.DISPLAY
3.REMOVE
4.UPDATE
5.EXIT
ENTER YOUR CHOICE
5


       1.ADMIN LOGIN
       2.CUSTOMER LOGIN
       3.EXIT
       ENTER YOUR CHOICE
2
       1.NEW CUSTOMER
       2.LOGIN
       3.LOGOUT
       ENTER YOUR CHOICE

1
Enter the username
Jomol@gmail.com
Enter the password
jomol@123
invalid password 
Enter the username
Jomol@gmail.com
Enter the password
Jomol@123
       1.NEW CUSTOMER
       2.LOGIN
       3.LOGOUT
       ENTER YOUR CHOICE

2
ENTER NAME
Jomol@gmail.com
ENTER PASSWORD
Jomol@123
Successfully verified
        1)Buy an item
        2)View items
        3)Back to homepage
         Enter your choice

1


*******MENU********
***FOOD 1***
FOOD ID -> 1
NAME OF FOOD -> COFFEE
***FOOD 2***
FOOD ID -> 2
NAME OF FOOD -> BIRIYANI
***FOOD 3***
FOOD ID -> 3
NAME OF FOOD -> SHAWAI
***FOOD 4***
FOOD ID -> 4
NAME OF FOOD -> AL-FAHM

Enter the id you want to buy
3
ENTER QUANTITY
3
       1.Take away
       2.Home Delivery
       3.Table Reservation
        Enter your choice
2
total cost is 590
enter 1 for confirm booking
1
BOOKED

THANK YOU

*****Bill*****

Name of food  SHAWAI
Quantity of food   3
Cost of food   540
Home Delivery charge 50
Total Cost of food   590

*******************
        1)Buy an item
        2)View items
        3)Back to homepage
         Enter your choice

2


*******MENU********
***FOOD 1***
FOOD ID -> 1
NAME OF FOOD -> COFFEE
QUANTITY OF FOOD -> 39
PRICE OF FOOD -> 10

***FOOD 2***
FOOD ID -> 2
NAME OF FOOD -> BIRIYANI
QUANTITY OF FOOD -> 65
PRICE OF FOOD -> 80

***FOOD 3***
FOOD ID -> 3
NAME OF FOOD -> SHAWAI
QUANTITY OF FOOD -> 17
PRICE OF FOOD -> 180

***FOOD 4***
FOOD ID -> 4
NAME OF FOOD -> AL-FAHM
QUANTITY OF FOOD -> 50
PRICE OF FOOD -> 190

*************************
        1)Buy an item
        2)View items
        3)Back to homepage
         Enter your choice

3


       1.ADMIN LOGIN
       2.CUSTOMER LOGIN
       3.EXIT
       ENTER YOUR CHOICE
3
PROCESS COMPLETE


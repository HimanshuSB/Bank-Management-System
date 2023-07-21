# Bank-Management-System

Execution Steps :

1. Extract the bank.management.system zip file on specific folder.

2. open Apache Netbeans IDE.

3. Open project in Apache Netbeans IDE : 
   1. file 
   2. Open Project. 
   3. Select the project in which drive the project is saved. 
   4. click on open.

4. Add JAR files :
   1. click on right click on Libraries option it shoes in left panel.
   2. click on Add Jar/Folder.
   3. Select where you saved the jar file.
   4. click on Open.

5. Open mysql workbench and type below queries :
   
   1 - Create database with name bankmanagementsystem in mysql

       create database bankmanagementsystem;

   2 - Select the database you just created

       use bankmanagementsystem;

   3 - Create our first Table in the selected database with name signup

       create table signup(formno varchar(20), name varchar(20), father_name varchar(20), dob varchar(20), gender varchar(20),email varchar(30), marital_status varchar(20), address varchar(40), city varchar(25), pincode varchar(20), state varchar(25));

   4 - Create the second table to store more information of user

       create table signuptwo(formno varchar(20), religion varchar(20), category varchar(20), income varchar(20), education varchar(20), occupation varchar(20), pan varchar(20), aadhar varchar(20), seniorcitizen varchar(20), existingaccount varchar(20));

   5 - Create the third table to store the account information of user

       create table signupthree(formno varchar(20), accountType varchar(40), cardnumber varchar(25), pin varchar(10), facility varchar(100)); 

   6 - Create the Login table to store login information

       create table login(formno varchar(20), cardnumber varchar(25), pin varchar(10));

   7 - Now create bank table to store transactions related information 

       create table bank(pin varchar(10), date varchar(50), type varchar(20), amount varchar(20));

7. Run the code.

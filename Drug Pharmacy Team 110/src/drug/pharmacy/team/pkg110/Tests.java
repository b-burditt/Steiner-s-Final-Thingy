/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drug.pharmacy.team.pkg110;

import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author Brian
 */
public class Tests 
{
    public static void main(String[] args) throws ClassNotFoundException, SQLException 
    {
	//testEmployee();
	testCustomer();
		
    }
    static void testCustomer() throws SQLException, ClassNotFoundException
    {
	int id;
	String name;
	String address;
	Scanner input = new Scanner(System.in);
        Customer customer = new Customer();
	
	System.out.print("Enter ID: ");
	id = input.nextInt();
	
	customer.login(id);
	
	if(customer.checkValidation())
	{
	    System.out.println(customer.getID() + " " + customer.getName()+ " " + customer.getAddress() + " " + customer.getRewardPoints());
	}
	else
	{
	    System.out.println("Failed login");
	}
	
	System.out.print("Enter Name: ");
	name = input.next();
	System.out.print("Enter Address: ");
	address = input.next();
	
	customer = new Customer();
	
	customer.login(name, address);
	
	if(customer.checkValidation())
	{
	    System.out.println(customer.getID() + " " + customer.getName()+ " " + customer.getAddress() + " " + customer.getRewardPoints());
	}
	else
	{
	    customer.registerNewCustomer(name, address);
	    System.out.println("Failed login");
	}
    }
    static void testEmployee() throws SQLException, ClassNotFoundException
    {
	int id;
	String password;
	Scanner input = new Scanner(System.in);
        Employee employee = new Employee();
	
	id = input.nextInt();
	password = input.next();
	
	employee.login(id, password);
	
	if(employee.checkValidation())
	{
	    System.out.println(employee.getID() + " " + employee.getManager() + " " + employee.getName());
	    
	}
	else
	{
	    System.out.println("Failed login");
	}
		
    }
}

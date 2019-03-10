package packagejava;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class JavaBasicMain {
	
	List<Order> orderList;

	public static void main(String[] args) {
		Order order = new Order();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter name: ");
		order.name = scanner.nextLine();
		
		System.out.println("Please enter email: ");
		order.emailId = scanner.nextLine();
		
		System.out.println("Please enter mobileno: ");
		order.mobileNo = Long.parseLong(scanner.nextLine());
		
		System.out.println("Please enter address: ");
		order.address = scanner.nextLine();
		
		System.out.println("Please enter ordertype: ");
		order.orderType = scanner.nextLine();
		
		System.out.println("Please enter menu: ");
		order.menu = scanner.nextLine();
		

	}

}

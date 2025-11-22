package datetime;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import calci.Calculator;
import calci.CalculatorImplementation;


public class DateTimeServer {

	public static void main(String[] args) {
		try {
			DateTime dt= new DateTimeImpl();
			Registry registry=LocateRegistry.createRegistry(1091);
			registry.rebind("DateTimeServer", dt);
			System.out.println("DateTime RMI Server is Running....");
		}catch(Exception e) {
			e.printStackTrace();
		}


	}

}

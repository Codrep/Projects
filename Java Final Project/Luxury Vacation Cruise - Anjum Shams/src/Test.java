/*
 * This program implements Serialization and uses ArrayList. This program is a menu driven program for Luxury Vacation Cruise company that collects 
 * information from the user and writes it to a binary file. The user can also retrieve information from the file and also has options to update 
 * the information and print lists. 
 * Author: Anjum Shams
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		ArrayList<Object> arrayOfShips = new ArrayList<>();
		ArrayList<Object> arrayOfShipNames = new ArrayList<>();
		ArrayList<Object> arrayOfShipsInservice = new ArrayList<>();		
		ArrayList<Object> arrayOfCruises = new ArrayList<>();
		ArrayList<Object> arrayOfCruiseNames = new ArrayList<>();
		ArrayList<Object> arrayOfPassengers = new ArrayList<>();
		ArrayList<Object> arrayOfPassengerNames = new ArrayList<>();		
		 
		 try {
			 
			int selection;
			
			 do {
			 System.out.println("Please select from the following options:\r\n"	
					    + "1. Add Ship.\r\n"			 		
				 		+ "2. Edit Ship\r\n"
				 		+ "3. Add Cruise.\r\n"			 		
				 		+ "4. Edit Cruise.\r\n"
				 		+ "5. Add Passenger.\r\n"			 		
				 		+ "6. Edit Passenger\r\n"
				 		+ "7. Print Ship Names.\r\n"
				 		+ "8. Print Ship In Service list.\r\n"
				 		+ "9. Print Ship Full list.\r\n"
				 		+ "10. Print Cruise list.\r\n"
				 		+ "11. Print Cruise Details.\r\n"
				 		+ "12. Print Passenger list.\r\n"
				 		+ "0. Exit\r\n");
			 
			  selection = input.nextInt();
		      if (selection == 1) {
		    	  System.out.println("");
		    	  System.out.println("Please enter ship name: ");			    	 
		    	  String shipName = input.next();				    	 
		    	  System.out.println("Please enter the number of balcony cabins: ");
		    	  int balcony = input.nextInt();
		    	  System.out.println("Please enter the number of ocean view cabins: ");
		    	  int oceanView = input.nextInt();
		    	  System.out.println("Please enter the number of suite cabins: ");
		    	  int suite = input.nextInt();
		    	  System.out.println("Please enter the number of interior cabins: ");
		    	  int interior = input.nextInt();
		    	  System.out.println("Is ship in service? yes or no: ");			    	 
		    	  String inservice = input.next();
		    	  Ship S1 = new Ship(shipName, balcony, oceanView, suite, interior, inservice);
		    	  arrayOfShips.add(S1.toString());		    	  		    	
		    	  arrayOfShipNames.add(S1.shipNames());
		    	  arrayOfShipsInservice.add(S1.shipInservice());
		    	  Ship.writeToFile(S1);
		    	  System.out.println("");
		    	  Ship.readFile();
		    	  System.out.println("Ship added.\r\n");
		      }
		      
		      if (selection == 2) {		    	 
		    	  System.out.println("");
		    	  System.out.println("Please edit ship information.");
		    	  Ship.readFile();			    	  
		    	  System.out.println("");
		    	  System.out.println("Please enter ship name: ");			    	 
		    	  String shipName = input.next();				    	 
		    	  System.out.println("Please enter the number of balcony cabins: ");
		    	  int balcony = input.nextInt();
		    	  System.out.println("Please enter the number of ocean view cabins: ");
		    	  int oceanView = input.nextInt();
		    	  System.out.println("Please enter the number of suite cabins: ");
		    	  int suite = input.nextInt();
		    	  System.out.println("Please enter the number of interior cabins: ");
		    	  int interior = input.nextInt();
		    	  System.out.println("Is ship in service? yes or no: ");			    	 
		    	  String inservice = input.next();
		    	  Ship S2 = new Ship(shipName, balcony, oceanView, suite, interior, inservice);
		    	  arrayOfShips.add(S2.toString());
		    	  arrayOfShipsInservice.add("Updated Information");
		    	  arrayOfShipsInservice.add(S2.shipInservice());
		    	  Ship.writeToFile(S2);
		    	  System.out.println("");
		    	  System.out.println("Updated ship information:");
		    	  Ship.readFile();
		    	  System.out.println("");
		      }
			  	
		      if (selection == 3) {
		    	  System.out.println("");
		    	  System.out.println("Please enter cruise name: ");			    	 
		    	  String cruiseName = input.next();				    	 
		    	  System.out.println("Please enter cruise ship name: ");
		    	  String cruiseShip = input.next();		    	 
		    	  System.out.println("Please enter departure port: ");
		    	  String departurePort = input.next();
		    	  System.out.println("Please enter cruise destination: ");
		    	  String destination = input.next();
		    	  Cruise C1 = new Cruise(cruiseName, cruiseShip, departurePort, destination);
		    	  arrayOfCruises.add(C1.toString());
		    	  arrayOfCruiseNames.add(C1.CruiseNames());
		    	  Cruise.writeToFile(C1);
		    	  System.out.println("");
		    	  Cruise.readFile();
		    	  System.out.println("Cruise added.\r\n");
		      }
		      
		      if (selection == 4) {		    
		    	  System.out.println("");
		    	  System.out.println("Please edit cruise information.");
		    	  Cruise.readFile();			    	  
		    	  System.out.println("");
		    	  System.out.println("Please enter cruise name: ");			    	 
		    	  String cruiseName = input.next();				    	 
		    	  System.out.println("Please enter cruise ship name: ");
		    	  String cruiseShip = input.next();		    	 
		    	  System.out.println("Please enter departure port: ");
		    	  String departurePort = input.next();
		    	  System.out.println("Please enter cruise destination: ");
		    	  String destination = input.next();		    	 			    	 
		    	  Cruise C2 = new Cruise(cruiseName, cruiseShip, departurePort, destination);
		    	  arrayOfCruises.add(C2.toString());			    	  
		    	  Cruise.writeToFile(C2);
		    	  System.out.println("");
		    	  System.out.println("Updated cruise information:");
		    	  Cruise.readFile();
		    	  System.out.println("");
		      }
		      
			      if (selection == 5) {
			    	  System.out.println("");
			    	  System.out.println("Please enter passenger's name: ");			    	 
			    	  String passengerName = input.next();				    	 
			    	  System.out.println("Please enter passenger's phone number: ");
			    	  String phone = input.next();
			    	  System.out.println("Please enter passenger's email address: ");
			    	  String email = input.next();
			    	  System.out.println("Please enter passenger's cruise: ");
			    	  String passengerCruise = input.next();
			    	  System.out.println("Please enter passenger's cabin: ");
			    	  String passengerCabin = input.next();
			    	  Passenger P1 = new Passenger(passengerName, phone, email, passengerCruise, passengerCabin);
			    	  arrayOfPassengers.add(P1.toString());
			    	  arrayOfPassengerNames.add(P1.passengerNames());
			    	  Passenger.writeToFile(P1);
			    	  System.out.println("");
			    	  Passenger.readFile();
			    	  System.out.println("Passenger added.\r\n");
			      }
			      
			      if (selection == 6) {			    	 
			    	  System.out.println("");
			    	  System.out.println("Please edit passenger information.");
			    	  Passenger.readFile();			    	  
			    	  System.out.println("");
			    	  System.out.println("Please enter passenger's name: ");			    	 
			    	  String passengerName = input.next();			    	  
			    	  System.out.println("Please enter passenger's phone number: ");
			    	  String phone = input.next();
			    	  System.out.println("Please enter passenger's email address: ");
			    	  String email = input.next();
			    	  System.out.println("Please enter passenger's cruise: ");
			    	  String passengerCruise = input.next();
			    	  System.out.println("Please enter passenger's cabin: ");
			    	  String passengerCabin = input.next();			    	 			    	 
			    	  Passenger P2 = new Passenger(passengerName, phone, email, passengerCruise, passengerCabin);
			    	  arrayOfPassengers.add(P2.toString());			    	  
			    	  Passenger.writeToFile(P2);
			    	  System.out.println("");
			    	  System.out.println("Updated passenger information:");
			    	  Passenger.readFile();
			    	  System.out.println("");
			      }
			      
			      if (selection == 7) {		    	  
			    	  System.out.println("");
			    	  System.out.println("Ship Names: ");
			    	  for (int i=0; i<arrayOfShipNames.size(); i++) {			 
			 			 System.out.println(arrayOfShipNames.get(i));
			 		 }			    				    	  
			    	  System.out.println("");		    			    	  
			      }				      
		    	  
			      if (selection == 8) {		    	  
			    	  System.out.println("");
			    	  System.out.println("Ship In Service list: ");
			    	  for (int i=0; i<arrayOfShipsInservice.size(); i++) {			 
			 			 System.out.println(arrayOfShipsInservice.get(i));
			 		 }			    				    	  
			    	  System.out.println("");		    			    	  
			      }	
			      
			      if (selection == 9) {		    	  
			    	  System.out.println("");
			    	  System.out.println("Ship Full list: ");
			    	  Ship.readFile();			    	  
			    	  System.out.println("");			 			    			    	  
			      }
			      
			      if (selection == 10) {	    	 
			    	  System.out.println("");
			    	  System.out.println("Cruise List: ");
			    	  for (int i=0; i<arrayOfCruiseNames.size(); i++) {			 
							 System.out.println(arrayOfCruiseNames.get(i));
						 }			    	  
			    	  System.out.println("");			    	  
			      }	
	    	  
	      if (selection == 11) {	    	 
	    	  System.out.println("");
	    	  System.out.println("Cruise details: ");
	    	  Cruise.readFile();			    	  
	    	  System.out.println("");	    	 			    	  
	      }	
			    	  
			      if (selection == 12) {			    	  
			    	  System.out.println("");
			    	  System.out.println("Passenger List: ");
			    	  for (int i=0; i<arrayOfPassengerNames.size(); i++) {			 
							 System.out.println(arrayOfPassengerNames.get(i));
						 }			    	 		    	  
			    	  System.out.println("");			    	  
			      }			      
			  								      			    	  
			    } while (selection != 0 );						 
			    	  System.out.println("");			    	  
			    	  System.exit(0); // Exit
			}		 
		 
		 //Exception Handling
		 catch (Exception e) {
			 System.out.println(e.getMessage());			 
		 }
		 
		 input.close();
	}
	
	

}
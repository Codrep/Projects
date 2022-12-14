import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Cruise implements Serializable {
	private String CruiseName;
	private String CruiseShip;
	private String departurePort;
	private String destination;
	
	public Cruise() {		
	}

	public Cruise(String cruiseName, String cruiseShip, String departurePort, String destination) {		
		CruiseName = cruiseName;
		CruiseShip = cruiseShip;
		this.departurePort = departurePort;
		this.destination = destination;
	}

	public String getCruiseName() {
		return CruiseName;
	}

	public void setCruiseName(String cruiseName) {
		CruiseName = cruiseName;
	}

	public String getCruiseShip() {
		return CruiseShip;
	}

	public void setCruiseShip(String cruiseShip) {
		CruiseShip = cruiseShip;
	}

	public String getDeparturePort() {
		return departurePort;
	}

	public void setDeparturePort(String departurePort) {
		this.departurePort = departurePort;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	@Override
	public String toString() {
		return "Cruise [CruiseName=" + CruiseName + ", CruiseShip=" + CruiseShip + ", departurePort=" + departurePort
				+ ", destination=" + destination + "]";
	}
	
	public String CruiseNames() {
		return "Cruise [CruiseName=" + CruiseName + "]";
	}
	
	
	public static void writeToFile(Cruise C) throws IOException{
		ObjectOutputStream OOS = new ObjectOutputStream(new FileOutputStream("Cruise.bin"));
		OOS.writeObject(C);
		OOS.close();
	}
	
	public static void readFile() throws IOException, ClassNotFoundException{
		ObjectInputStream OIS = new ObjectInputStream(new FileInputStream("Cruise.bin"));
		Cruise C = (Cruise) OIS.readObject();
		System.out.println(C);
		OIS.close();
	}
	

	
}

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Ship implements Serializable {
	private String shipName;
	private int Balcony;
	private int OceanView;
	private int Suite;
	private int Interior;
	private String Inservice;
	
	public Ship() {	
	}
	
	public Ship(String shipName, int balcony, int oceanView, int suite, int interior, String inservice) {
		super();
		this.shipName = shipName;
		Balcony = balcony;
		OceanView = oceanView;
		Suite = suite;
		Interior = interior;
		Inservice = inservice;
	}

	public String getShipName() {
		return shipName;
	}

	public void setShipName(String shipName) {
		this.shipName = shipName;
	}

	public int getBalcony() {
		return Balcony;
	}

	public void setBalcony(int balcony) {
		Balcony = balcony;
	}

	public int getOceanView() {
		return OceanView;
	}

	public void setOcean(int oceanView) {
		OceanView = oceanView;
	}

	public int getSuite() {
		return Suite;
	}

	public void setSuite(int suite) {
		Suite = suite;
	}

	public int getInterior() {
		return Interior;
	}

	public void setInterior(int interior) {
		Interior = interior;
	}	

	public String getInservice() {
		return Inservice;
	}

	public void setInservice(String inservice) {
		Inservice = inservice;
	}
	
	@Override
	public String toString() {
		return "Ship [shipName=" + shipName + ", Balcony=" + Balcony + ", OceanView=" + OceanView + ", Suite=" + Suite
				+ ", Interior=" + Interior + ", Inservice=" + Inservice + "]";
	}

	public String shipNames() {
		return "Ship [shipName=" + shipName + "]";
	}
	
	public String shipInservice() {
		return "Ship [shipName=" + shipName + ", Inservice=" + Inservice + "]";
	}
	
	public static void writeToFile(Ship S) throws IOException{
		ObjectOutputStream OOS = new ObjectOutputStream(new FileOutputStream("Ship.bin"));
		OOS.writeObject(S);
		OOS.close();
	}
	
	public static void readFile() throws IOException, ClassNotFoundException{
		ObjectInputStream OIS = new ObjectInputStream(new FileInputStream("Ship.bin"));
		Ship S = (Ship) OIS.readObject();
		System.out.println(S);
		OIS.close();		
	}
}

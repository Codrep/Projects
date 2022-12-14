import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Passenger implements Serializable {
	private String passengerName;
	private String phone;
	private String email;
	private String passengerCruise;
	private String passengerCabin;
		
	public Passenger() {		
	}

	public Passenger(String passengerName, String phone, String email, String passengerCruise, String passengerCabin) {	
		this.passengerName = passengerName;
		this.phone = phone;
		this.email = email;
		this.passengerCruise = passengerCruise;
		this.passengerCabin = passengerCabin;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassengerCruise() {
		return passengerCruise;
	}

	public void setPassengerCruise(String passengerCruise) {
		this.passengerCruise = passengerCruise;
	}

	public String getPassengerCabin() {
		return passengerCabin;
	}

	public void setPassengerRoom(String passengerCabin) {
		this.passengerCabin = passengerCabin;
	}

	@Override
	public String toString() {
		return "Passenger [passengerName=" + passengerName + ", phone=" + phone + ", email=" + email
				+ ", passengerCruise=" + passengerCruise + ", passengerCabin=" + passengerCabin + "]";
	}	
	
	public String passengerNames() {
		return "Passenger [passengerName=" + passengerName + "]";
	}
	
	
	public static void writeToFile(Passenger P) throws IOException{
		ObjectOutputStream OOS = new ObjectOutputStream(new FileOutputStream("Passenger.bin"));
		OOS.writeObject(P);
		OOS.close();
	}	

	public static void readFile() throws IOException, ClassNotFoundException{			
		ObjectInputStream OIS = new ObjectInputStream(new FileInputStream("Passenger.bin"));
		Passenger P = (Passenger) OIS.readObject();	
			System.out.println(P);
			OIS.close();	
	}
	

}	
		


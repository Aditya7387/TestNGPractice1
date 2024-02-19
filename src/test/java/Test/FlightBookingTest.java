package Test;
import org.testng.annotations.Test;

public class FlightBookingTest {
	
	@Test(priority=0)
	public void Signup() {
		System.out.println("Signup");
	}
	
	@Test(priority=-2)
	public void Login() {
		System.out.println("Login");
	}
	
	@Test(priority=3)
	public void SearchForFlight() {
		System.out.println("SearchForFlight");
	}
	
	@Test(priority=4)
	public void BookTheFlight() {
		System.out.println("BookTheFlight");
	}
	
	@Test(priority=5)
	public void SaveTheTicket() {
		System.out.println("SaveTheTicket");
	}
	
	@Test(priority=6)
	public void LogOut() {
		System.out.println("LogOut");
	}
}

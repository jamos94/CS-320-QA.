package AppointmentService;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;


	public class AppointmentServiceTest {
	 
		 public static List<Appointment> appointments = new ArrayList<>();

		   @Test public void validAppointmentData() {
			      Appointment appointment = new Appointment("0000000001", "yyy-MM-dd", "Read Novel Book");
			     // addAppointment(appointment);
			      System.out.println("New Task: " + appointment);
			      System.out.println("size: " + appointments.size());
		
		}
		   @Test public void deleteAppointment() {      
			      Appointment appointment = new Appointment("0000000002x", "yyy-MM-dd", "Playstation 5");
			    //  deleteAppointment(appointment);
			      System.out.println(appointment + "Deleted");
			   }
			   
}

package AppointmentService;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AppointmentTest {
		@Test public void createValidAppointmentData() {
			Appointment appointment = new Appointment("0000000001", "Reading", "Read Novel Book");
			System.out.println(appointment);
		 }
		 
		}

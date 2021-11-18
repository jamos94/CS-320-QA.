package AppointmentService;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Appointment {
        
        private String ID; //contact ID for appointment
        private String date; //date of appointment
        Date date1 = new Date(); //constructor represents moment in time
        private String description; //description of appointment
       
        //creating an appointment
        public Appointment(String ID, String date, String description) {
               
        	//ID cannot be longer than 10 characters nor null
                if(ID.length() <= 10 && ID != null) {
                        
                        this.ID = ID;
                        
                }       
 
                this.setDate(date);
                this.setDescription(description);
                
        }

        //set date for appointment
        //date cannot be in the past
        //date is formatted year, month, day
        protected void setDate(String date) {
                
                SimpleDateFormat format = new SimpleDateFormat("yyy-MM-dd");
                
                Date date2 = null;
                try {
                        date2 = format.parse(date);
                } catch (ParseException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                }
        
                //check if date is in the past
                boolean test = date2.before(date1);
                
                if ( test == false && date != null) {
                        
                        this.date = date;
                }else {
                        
                        this.date = "invalid date";
                        
                }
        }
        
        //create appointment description
        //description cannot be longer than 50 characters nor null
         protected void setDescription(String description) {
                
                if (description.length() <= 50 && description != null) {
                        
                        this.description = description;
                }
        }
        
         //get user input for ID, date, and description and return to store for output
         public String getID() {
                        
                        return ID;
                }
                
                public String getDate() {
                        
                        return date;
                }
                
                public String getDescription() {
                        
                        return description;
                }
                
                //output appointment information
                @Override
                public String toString() {
                        
                        return "\nAppointment: " + ID + "\nDate: " + date + "\nDescription: " +
                        description;
                }

}
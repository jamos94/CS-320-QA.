package TaskService;

import org.junit.Test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class TaskServiceTest {
	   
	   public static List<Task> tasks = new ArrayList<>();

	   @Test public void validTaskData() {
	      Task task = new Task("0000000001", "Reading", "Read Novel Book");
	      addTask(task);
	      System.out.println("New Task: " + tasks);
	      System.out.println("size: " + tasks.size());
	   }
	   
	   @Test public void invalidID() {      
	      Task task = new Task("0000000002x", "Playing", "Playstation 5");
	      addTask(task);
	      System.out.println("size: " + tasks.size());
	   }
	   
	   @Test public void invalidName() {      
	      Task task = new Task("0000000002", "Playing Playing Playing Playing Playing Playing Playing", "Playstation 5");
	      addTask(task);
	      System.out.println("size: " + tasks.size());
	   }
	   
	   @Test public void invalidDescription() {      
	      Task task = new Task("0000000002", "Playing", "Playstation 5 Playstation 5 Playstation 5 Playstation 5 Playstation 5 Playstation 5");
	      addTask(task);
	      System.out.println("size: " + tasks.size());
	   }
	   
	   @Test public void existingID() {      
	      Task task = new Task("0000000001", "Reading", "Read Novel Book");
	      addTask(task);
	      System.out.println("size: " + tasks.size());
	   }
	   
	   @Test public void updateTask() {      
	      Task task = new Task("0000000001", "Singing", "Wedding Engagement");
	      update(task);
	      System.out.println("Updated: " + tasks);
	      System.out.println("size: " + tasks.size());
	   }
	   
	   @Test public void deleteTask() {
	      deleteTask("0000000001");
	      System.out.println("size: " + tasks.size());
	   }   
	   
	   public boolean addTask(Task task) {
	        //use Collections binary search to check if the ID already exists
	        //if task ID is not found, return negative values
	        int index = getIndex(task);

	        //validate id if doesn't exist, name & description
	        if (index < 0 && validateID(task.getId()) && validateName(task.getName()) && validateDescription(task.getDescription())) {
	            tasks.add(task);
	            return true;
	        }
	        
	        return false;
	    }
	    
	    /**
	     *
	     * @param id
	     *
	     * delete Task object when Task ID exist
	     *
	     */
	    public void deleteTask(String id) {
	        //invoke getIndex(Task) method
	        //create new instance of Task object and pass the String ID in the constructor, set name and description as empty or null
	        //if ID found, return int value as List index (0...N)
	        int index = getIndex(new Task(id, "", ""));
	        
	        //check if index is greater than or equal to 0 to prevent ArrayIndexOutOfBoundsException
	        if (index >= 0)
	            tasks.remove(index);
	    }

	    /**
	     *
	     * @param task
	     * 
	     * update Task object if same ID and valid name and description
	     */
	    public void update(Task task) {
	        for (Task obj : tasks) {
	            if (obj.equals(task) && validateName(task.getName()) && validateDescription(task.getDescription())) {
	                obj.setName(task.getName());
	                obj.setDescription(task.getDescription());
	            }
	        }
	    }
	    
	    /**
	     *
	     * @param task
	     * @return integer data type
	     * 
	     * use Collections binary search by Task ID
	     * return positive integer from 0 to N if ID is found
	     * return negative integer if ID is not found
	     */
	    public int getIndex(Task task) {
	        int index = Collections.binarySearch(tasks, task, Task.compareById);
	        return index;
	    }

	    /**
	     * 
	     * @param id
	     * @return true or false
	     * 
	     * validate id parameter, if not null and length is less than or equal to 10
	     */
	    public boolean validateID(String id) {
	        if (id != null && id.length() <= 10)
	            return true;

	        return false;
	    }

	    /**
	     * 
	     * @param name
	     * @return true or false
	     * 
	     * validate name parameter, if not null and length is less than or equal to 20
	     */
	    public boolean validateName(String name) {
	        if (name != null && name.length() <= 20)
	            return true;

	        return false;
	    }

	    /**
	     * 
	     * @param description
	     * @return true or false
	     * 
	     * validate description parameter, if not null and length is less than or equal to 50
	     */
	    public boolean validateDescription(String description) {
	        if (description != null && description.length() <= 50)
	            return true;

	        return false;
	    }

	}

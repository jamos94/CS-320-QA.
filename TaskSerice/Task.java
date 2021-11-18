package TaskService;

import java.util.Comparator;

public class Task {

    //private access modifier for encapsulation
    private String id;
    private String name;
    private String description;

    //public constructor of Task object accepting 3 String parameters
    public Task(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    //public getters to get the value of private variable
    public String getId() {
        return id;
    }

    //public setters to set the value of private variable
    public void setId(String id) {
        this.id = id;
    }
    
    //get name returns name variable
    public String getName() {
        return name;
    }

    //name that is received is set to name 
    public void setName(String name) {
        this.name = name;
    }

    //description received is returned 
    public String getDescription() {
        return description;
    }

    //description is set to what is received 
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * 
     * @param obj
     * @return true | false
     * 
     * check the equality of two Task object
     * return true if both object are equal
     * return false if passed Object is null
     * return false if getClass() method is not equal
     * return true if id of both object are equal otherwise false
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null)
            return false;

        if (this.getClass() != obj.getClass())
            return false;

        Task t = (Task) obj;
        return getId().equals(t.getId());
    }

    /**
     * use Comparator interface
     * override the compare method comparing the id variable of two Task object
     */
    public static Comparator<Task> compareById = new Comparator<Task>() {
        @Override
        public int compare(Task t1, Task t2) {
            return t1.getId().compareTo(t2.getId());
        }
    };

    /**
     * @return String data type concatenated String value of Task object
     * displaying the id, name and description
     */
    @Override
    public String toString() {
        return "Task ID: " + getId() + "\nName: " + getName() + "\nDescription: " + getDescription() + "\n";
    }

}
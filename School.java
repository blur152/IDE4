abstract public class School
{// starts the class
    //initilizes a variable we will need later
   String Name= new String();


 public School(String n){// starts constructor

    Name=n;




 }//ends constructor

   public int enrollment;
 // creates setters and getters as well as a display method


// this left abstract because enrolment varries based on school level but not school
  public abstract void setEnrollment();

  // for the same reason this display method is left abstract because each school type will have a diffrent description
    public abstract void describeLevel();
    public void setName(String name){
        Name=name;

    }
   public int getEnrollment()
   {
      return enrollment;
   }
   public String getName(){
       return Name;

   }
   // and we set up this interface cause will need it in SchoolDemo
public interface SuperIntendent
{// opens the interface

public static final String NAME= "Dr. Bernard F. Bragen, Jr.";

// creates the Constant SSN which holds the School Systems Name
public static final String SSN ="Montgomery County Public Schools";
    // creates the Constant SSPN which holds the School Systems Phone Number
public static final String SSPN="540-382-5100";


}// closes the superintendent interface

}//closes the class
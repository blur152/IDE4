public class SchoolDemo implements School.SuperIntendent
{// opens the main class
   public static void main(String[] args)
   {// starts the main method

       // creates an array and fills
       School[] ref= new School[18];
       ref[0]= new ElementarySchool( " Auburn Elementary");
       ref[1]= new ElementarySchool( " Belview  Elementary");
       ref[2]= new ElementarySchool( " Eastern Montgomery Elementary");
       ref[3]= new ElementarySchool( " Christiansburg  Elementary");
       ref[4]= new ElementarySchool( " Falling Branch Elementary");
       ref[5]= new ElementarySchool( " Gilbert Linkous Elementary");
       ref[6]= new ElementarySchool( " Harding Avenue Elementary");
       ref[7]= new ElementarySchool( " Kipps  Elementary");
       ref[8]= new ElementarySchool( " Margaret Beeks Elementary");
       ref[9]= new ElementarySchool( " Price’s Fork Elementary");
       ref[10]= new MiddleSchool( " Auburn Middle");
       ref[11]= new MiddleSchool( " Blacksburg Middle");
       ref[12]= new MiddleSchool( " Christiansburg Middle");
       ref[13]= new MiddleSchool( " Shawsville Middle");
       ref[14]= new HighSchool( " Auburn High");
       ref[15]= new HighSchool( " Blacksburg High");
       ref[16]= new HighSchool( " Christiansburg High");
       ref[17]= new HighSchool( " Eastern Montgomery High");
int x;


System.out.println("This school system is called "+SSN+" it consists of 18 public schools");
// sets up for loop that gives the needed output
        for (x=0;x< ref.length;++x){
           System.out.print(ref[x].getName()  );
           ref[x].describeLevel();
           System.out.println(" that has "+ref[x].getEnrollment()+" students enrolled");

        }

// prints a line calling the variables from the interface
System.out.println("The SuperIntendent of "+ SSN+" is "+NAME+" he can be called on the phone at "+SSPN);








   }//ends the main method
}//sets up main class
public class HighSchool extends School
{// starts the Highschool class as a child class of school

   HighSchool(String n){ // starts the HighSchool constructor

      super(n);
      setEnrollment();

   }// ends the HighSchool constructor

   public void describeLevel()
   {
      System.out.print(" which is a high school " +
         "serving grades 9 through 12");
   }

   @Override
   //setsEnrollment for all HighSchools
   public void setEnrollment() {
      super.enrollment=1250;
   }



}


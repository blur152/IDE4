public class ElementarySchool extends School
{
    public ElementarySchool(String n) { // starts the Elementary Schools constructor
        super(n);
        setEnrollment();
    }// ends the Elementary Schools constructor

    public void describeLevel()
    {
        System.out.print(" which is an elementary school " +
                "serving grades 1 through 5");
    }

    @Override
    //setsEnrollment for all Elementary Schools
    public void setEnrollment() {
        super.enrollment=625;
    }

}
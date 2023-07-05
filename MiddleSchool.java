public class MiddleSchool extends School
{
    public MiddleSchool(String n) { // starts the Middle Schools constructor
        super(n);
        setEnrollment();
    }// ends the Middle Schools constructor

    public void describeLevel()
    {
        System.out.print(" which is a middle school " +
                "serving grades 6 through 8");
    }
    @Override
    //setsEnrollment for all Middle Schools
    public void setEnrollment() {
        super.enrollment=937;
    }

}

import java.util.*;
import java.time.LocalDate;

//  DONE
class StudyLog
{
    public LocalDate Date;
    public String Subject;
    public double Duration;
    public String Description;

    public StudyLog(LocalDate A,String B, double C, String D)
    {
        this.Date = A;
        this.Subject  = B;
        this.Duration  = C;
        this.Description  = D;

    }
    
    @Override
    public String toString()            
    {
        return Date + " | "+Subject+ " | "+Duration+ " | "+Description;
    }

    //Getter Methods
    public LocalDate getDate()
    {
        return Date;
    }

    public String getSubject()
    {
        return Subject;
    }

    public double getDuration()
    {   
        return Duration;
    }

    public String getDescription()
    {
        return Description;
    }
}

class StudyTracker
{
    //Data Structure used to hold the data
    private ArrayList <StudyLog> Database = new ArrayList <StudyLog> ();

    public void InsertLog()
    {
        Scanner Scannerobj = new Scanner(System.in);
        System.out.println("------------------------------------------------------------------------");
        System.out.println("------------ Please Enter the valid details of your study : ------------");
        System.out.println("------------------------------------------------------------------------");

        LocalDate DateObj = LocalDate.now();

        System.out.println("Please Provide the name of Subject like C/C++/Java/O.S./DS : ");
        String sub = Scannerobj.nextLine();

        System.out.println("Enter the time period of your study in hours : ");
        double dur = Scannerobj.nextDouble();
        Scannerobj.nextLine();          //for flushing enter

        System.out.println("Please provide the Description about the Study for future reference : ");
        String desc = Scannerobj.nextLine();

        StudyLog Studyobj = new StudyLog(DateObj,sub,dur,desc);

        Database.add(Studyobj);

        System.out.println("*********** Study Log gets Stored Successfully....! ***********");
        System.out.println("------------------------------------------------------------------------");
    }

    public void DisplayLog()
    {
        System.out.println("------------------------------------------------------------------------");
        
        if(Database.isEmpty())
        {
            System.out.println("Nothing to display as database is empty..");
            System.out.println("------------------------------------------------------------------------");
            return;
        }
        
        System.out.println("------------------------------------------------------------------------");
        System.out.println("------------------- Log Report from My Study Tracker -------------------");
        System.out.println("------------------------------------------------------------------------");

        for(StudyLog sobj : Database)
        {
            System.out.println(sobj);
        }

        System.out.println("------------------------------------------------------------------------");
    }
}

class program554        //StudyTrackerStarter   //View
{
    public static void main(String A[])
    {
        StudyTracker stobj = new StudyTracker();
        
        stobj.DisplayLog();

        stobj.InsertLog();
        stobj.InsertLog();
        stobj.InsertLog();

        stobj.DisplayLog();
    }
}
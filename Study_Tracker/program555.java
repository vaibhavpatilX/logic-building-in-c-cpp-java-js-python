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

class program555       //StudyTrackerStarter   //View
{
    public static void main(String A[])
    {
        StudyTracker stobj = new StudyTracker();

        Scanner sobj = new Scanner(System.in);

        int iChoice = 0;

        System.out.println("------------------------------------------------------------------------");
        System.out.println("---------------- Welcome to My Study Tracker Application ---------------");
        System.out.println("------------------------------------------------------------------------");

        do
        {
            System.out.println("Please select the appropriate option");

            System.out.println("1  : Insert new Study Log into Database");
            System.out.println("2  : View All Study Logs");
            System.out.println("3  : Summary of StudyLog by Date");
            System.out.println("4  : Summary of Study Log by Subject");
            System.out.println("5  : Export Study Log into CSV file");
            System.out.println("6  : Exit the Application");

            iChoice = sobj.nextInt();

            switch(iChoice)
            {
                case 1 :        //Insert new Study Log into Database
                    stobj.InsertLog();
                    break;
                
                case 2 :        //View All Study Logs
                    stobj.DisplayLog();
                    break;
                        
                case 3 :        //Summary of StudyLog by Date

                    break;


                case 4:         //Summary of Study Log by Subject
                
                    break;


                        
                case 5 :        //Export Study Log into CSV file
                
                    break;

                        
                case 6 :        //Exit the Application

                    System.out.println("------------------------------------------------------------------------");
                    System.out.println("------------- Thank you for using My Study Log Application -------------");
                    System.out.println("------------------------------------------------------------------------");

                    break;

                default:
                    System.out.println("Please Enter the valid option..!");
                    
            }
        }
        while(iChoice != 6);

    }
}
import java.util.*;
import java.time.LocalDate;
import java.io.*;

//  DONE
class StudyLog      //Model
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
}//End of class StudyLog

class StudyTracker          //Controller
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
    }//End of InsertLog function

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
    } //  End of DisplayLog Function
    
    public void ExportCSV()
    {
        if(Database.isEmpty())
        {
            System.out.println("------------------------------------------------------------------------");
            System.out.println("Nothing to Export as database is empty..");
            System.out.println("------------------------------------------------------------------------");
            return;
        }

        String FileName  = "MyStudy.csv";

        //Create CSV file
        try(FileWriter fwobj = new FileWriter(FileName))            //No need to close it deallocate after try block
        {
            //Write CSV Header
            fwobj.write("Date,Subject,Duration,Desciption\n");

            //Travel Database
            for(StudyLog sobj : Database)
            {
                //Write Each Record in CSV
                fwobj.write(sobj.getDate() + ","+
                            sobj.getSubject().replace(","," ") + ","+
                            sobj.getDuration() + ","+
                            sobj.getDescription().replace(","," ") + "\n"
                            );
            }
            System.out.println("******* Log Created Successfully...! *******");
            System.out.println("------------------------------------------------------------------------");
        }// End of try() block

        catch(Exception eobj)
        {
            System.out.println("Exception occured while creating the .CSV file");
            System.out.println("Report this to Developer");
        }//End of Catch() block

    }//end of ExportCSV() function

    public void SummaryByDate()
    {

        System.out.println("------------------------------------------------------------------------");
        
        if(Database.isEmpty())
        {
            System.out.println("Nothing to display as database is empty..");
            System.out.println("------------------------------------------------------------------------");
            return;
        }
        
        System.out.println("------------------------------------------------------------------------");
        System.out.println("---------------- Summary By Date from My Study Tracker -----------------");
        System.out.println("------------------------------------------------------------------------");

        LocalDate lobj = null;
        double d,old;

        //TreeMap   |  Key    |       Values    |
        //---------------------------------------------
        //          | Date    |       Duration  |
        //---------------------------------------------
        TreeMap <LocalDate,Double> tobj= new TreeMap <LocalDate,Double>();
        for(StudyLog sobj : Database)
        {
            lobj = sobj.getDate();

            d = sobj.getDuration();                 //new duration
            
            if(tobj.containsKey(lobj))
            {
                old = tobj.get(lobj);               //old duration
                tobj.put(lobj,d+old);               //addition of old duration+new duration
            }
            else 
            {
                tobj.put(lobj,d);
            }
        }//End of for loop

        //Display the details as per date
        for(LocalDate ldobj : tobj.keySet())
        {
            System.out.println("Date : "+ldobj+" Total study "+tobj.get(ldobj));
        }
        System.out.println("------------------------------------------------------------------------");

    }//End of SummaryByDate() function


    //Duration completed by Subject
    public void SummaryBySubject()
    {

        System.out.println("------------------------------------------------------------------------");
        
        if(Database.isEmpty())
        {
            System.out.println("Nothing to display as database is empty..");
            System.out.println("------------------------------------------------------------------------");
            return;
        }
        
        System.out.println("------------------------------------------------------------------------");
        System.out.println("--------------- Summary By Subject from My Study Tracker ---------------");
        System.out.println("------------------------------------------------------------------------");

        double d,old;
        String s;


        //TreeMap   |  Key    |       Values    |
        //---------------------------------------------
        //          | Date    |       Duration  |
        //---------------------------------------------
        TreeMap <String,Double> tobj= new TreeMap <String,Double>();

        for(StudyLog sobj : Database)
        {
            s = sobj.getSubject();
            d = sobj.getDuration();                 //new duration
            
            if(tobj.containsKey(s))
            {
                old = tobj.get(s);               //old duration
                tobj.put(s,d+old);               //addition of old duration+new duration
            }
            else 
            {
                tobj.put(s,d);
            }
        }//End of for loop

        //Display the details as per Subject
        for(String str : tobj.keySet())
        {
            System.out.println("Subject : "+str+" Total study "+tobj.get(str));
        }
        System.out.println("------------------------------------------------------------------------");

    }//End of SummaryBySubject() function

}//End of class StudyTracker

class program558       //StudyTrackerStarter   //View
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
                    stobj.SummaryByDate();
                    break;


                case 4:         //Summary of Study Log by Subject
                    stobj.SummaryBySubject();
                    break;

                        
                case 5 :        //Export Study Log into CSV file
                    stobj.ExportCSV();
                    break;

                        
                case 6 :        //Exit the Application

                    System.out.println("------------------------------------------------------------------------");
                    System.out.println("------------- Thank you for using My Study Log Application -------------");
                    System.out.println("------------------------------------------------------------------------");

                    break;

                default:
                    System.out.println("Please Enter the valid option..!");
      
            }//End of Switch case

        }//End of do block
        while(iChoice != 6);

    }//End of main function
    
}//End of main class
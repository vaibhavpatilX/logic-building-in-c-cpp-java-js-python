import java.util.*;
import java.time.LocalDate;

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
}

class program551
{
    public static void main(String A[])
    {
    
        StudyLog sobj1 = new StudyLog(LocalDate.now(),"C",2.5,"Pointer And Array");
        StudyLog sobj2 = new StudyLog(LocalDate.now(),"C++",2,"Polymorphism");
        StudyLog sobj3 = new StudyLog(LocalDate.now(),"Java",3.5,"Inheritance");
        StudyLog sobj4 = new StudyLog(LocalDate.now(),"C",1.5,"Pointer And Array");
        StudyLog sobj5 = new StudyLog(LocalDate.now(),"C",1.0,"Pointer And Array");

        ArrayList <StudyLog> aobj = new ArrayList <StudyLog> ();        

        aobj.add(sobj1);
        aobj.add(sobj2);
        aobj.add(sobj3);
        aobj.add(sobj4);
        aobj.add(sobj5);

        for(StudyLog sobj : aobj)
        {
            System.out.println(sobj);
        }
    }
}
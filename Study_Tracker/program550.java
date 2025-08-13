import java.util.*;
import java.time.LocalDate;

class StudyLog
{
    public String Subject;
    public double Duration;
    public String Description;

    public StudyLog(String A, double B, String C)
    {
        this.Subject  = A;
        this.Duration  = B;
        this.Description  = C;

    }

    
    @Override
    public String toString()            
    {
        return Subject+ " | "+Duration+ " | "+Description;
    }
}

class program550
{
    public static void main(String A[])
    {
        LocalDate lobj = LocalDate.now();

        System.out.println(lobj);
    }
}
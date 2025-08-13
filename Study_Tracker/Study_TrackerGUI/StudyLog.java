import java.time.LocalDate;

/////////////////////////////////////
//////////////**Model**//////////////
/////////////////////////////////////

public class StudyLog {
    private String subject;
    private String topic;
    private double hours;
    private LocalDate date;

    public StudyLog(String subject, String topic, double hours, LocalDate date) {
        this.subject = subject;
        this.topic = topic;
        this.hours = hours;
        this.date = date;
    }

    public String getSubject() {
        return subject;
    }

    public String getTopic() {
        return topic;
    }

    public double getHours() {
        return hours;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Subject: " + subject +
               ", Topic: " + topic +
               ", Hours: " + hours +
               ", Date: " + date;
    }
}

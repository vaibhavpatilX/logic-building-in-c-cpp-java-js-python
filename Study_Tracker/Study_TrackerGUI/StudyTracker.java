import java.util.*;
import java.time.LocalDate;
import java.io.*;
import java.nio.file.*;

//////////////////////////////////////////
//////////////**Controller**//////////////
//////////////////////////////////////////

public class StudyTracker {
    private List<StudyLog> logs;

    public StudyTracker() {
        logs = new ArrayList<>();
    }

    public void addLog(String subject, String topic, double hours) {
        StudyLog log = new StudyLog(subject, topic, hours, LocalDate.now());
        logs.add(log);
    }

    public List<StudyLog> getAllLogs() {
        return logs;
    }

    public String getSummaryByDate() {
        Map<LocalDate, Double> summary = new TreeMap<>();
        for (StudyLog log : logs) {
            summary.put(log.getDate(), summary.getOrDefault(log.getDate(), 0.0) + log.getHours());
        }
        StringBuilder sb = new StringBuilder("Summary by Date:\n");
        for (Map.Entry<LocalDate, Double> entry : summary.entrySet()) {
            sb.append(entry.getKey()).append(" - ").append(entry.getValue()).append(" hours\n");
        }
        return sb.toString();
    }

    public String getSummaryBySubject() {
        Map<String, Double> summary = new TreeMap<>();
        for (StudyLog log : logs) {
            summary.put(log.getSubject(), summary.getOrDefault(log.getSubject(), 0.0) + log.getHours());
        }
        StringBuilder sb = new StringBuilder("Summary by Subject:\n");
        for (Map.Entry<String, Double> entry : summary.entrySet()) {
            sb.append(entry.getKey()).append(" - ").append(entry.getValue()).append(" hours\n");
        }
        return sb.toString();
    }

    public void exportCSV(String filePath) throws IOException {
        List<String> lines = new ArrayList<>();
        lines.add("Subject,Topic,Hours,Date");
        for (StudyLog log : logs) {
            lines.add(log.getSubject() + "," + log.getTopic() + "," + log.getHours() + "," + log.getDate());
        }
        Files.write(Paths.get(filePath), lines);
    }
}

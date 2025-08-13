import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.LocalDate;
import java.util.List;
import java.io.IOException;

//////////////////////////////////////////
/////////////////**View**/////////////////
//////////////////////////////////////////

public class StudyTrackerGUI extends JFrame {
    private StudyTracker studyTracker;
    private JTextField subjectField, topicField, hoursField;
    private JTextArea textArea;

    public StudyTrackerGUI() {
        studyTracker = new StudyTracker();

        setTitle("Study Tracker");
        setSize(600, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel(new GridLayout(4, 2));
        inputPanel.add(new JLabel("Subject:"));
        subjectField = new JTextField();
        inputPanel.add(subjectField);

        inputPanel.add(new JLabel("Topic:"));
        topicField = new JTextField();
        inputPanel.add(topicField);

        inputPanel.add(new JLabel("Hours:"));
        hoursField = new JTextField();
        inputPanel.add(hoursField);

        JButton addButton = new JButton("Add Log");
        inputPanel.add(addButton);

        JButton viewButton = new JButton("View Logs");
        inputPanel.add(viewButton);

        add(inputPanel, BorderLayout.NORTH);

        textArea = new JTextArea();
        add(new JScrollPane(textArea), BorderLayout.CENTER);

        JPanel bottomPanel = new JPanel();
        JButton summaryByDate = new JButton("Summary by Date");
        JButton summaryBySubject = new JButton("Summary by Subject");
        JButton exportButton = new JButton("Export CSV");

        bottomPanel.add(summaryByDate);
        bottomPanel.add(summaryBySubject);
        bottomPanel.add(exportButton);

        add(bottomPanel, BorderLayout.SOUTH);

        // Action Listeners
        addButton.addActionListener(e -> {
            String subject = subjectField.getText();
            String topic = topicField.getText();
            double hours = Double.parseDouble(hoursField.getText());
            studyTracker.addLog(subject, topic, hours);
            JOptionPane.showMessageDialog(this, "Log added successfully!");
        });

        viewButton.addActionListener(e -> {
            List<StudyLog> logs = studyTracker.getAllLogs();
            StringBuilder sb = new StringBuilder();
            for (StudyLog log : logs) {
                sb.append(log).append("\n");
            }
            textArea.setText(sb.toString());
        });

        summaryByDate.addActionListener(e -> {
            textArea.setText(studyTracker.getSummaryByDate());
        });

        summaryBySubject.addActionListener(e -> {
            textArea.setText(studyTracker.getSummaryBySubject());
        });

        exportButton.addActionListener(e -> {
            String filePath = JOptionPane.showInputDialog(this, "Enter file path to save CSV:");
            try {
                studyTracker.exportCSV(filePath);
                JOptionPane.showMessageDialog(this, "Exported successfully!");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error exporting file: " + ex.getMessage());
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new StudyTrackerGUI();
    }
}

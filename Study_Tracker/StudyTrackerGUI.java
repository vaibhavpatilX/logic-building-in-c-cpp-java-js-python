import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class StudyTrackerGUI {
    private StudyTracker studyTracker;
    private JFrame frame;
    private JTextField subjectField, hoursField, dateField;
    private JTextArea textArea;

    public StudyTrackerGUI() {
        studyTracker = new StudyTracker();

        frame = new JFrame("Study Tracker 📚");
        frame.setSize(650, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Panel
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout(10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Top input panel
        JPanel inputPanel = new JPanel(new GridLayout(3, 2, 10, 10));
        subjectField = new JTextField();
        hoursField = new JTextField();
        dateField = new JTextField(LocalDate.now().toString());

        inputPanel.add(new JLabel("Subject:"));
        inputPanel.add(subjectField);
        inputPanel.add(new JLabel("Hours Spent:"));
        inputPanel.add(hoursField);
        inputPanel.add(new JLabel("Date (YYYY-MM-DD):"));
        inputPanel.add(dateField);

        panel.add(inputPanel, BorderLayout.NORTH);

        // Center output area
        textArea = new JTextArea(12, 40);
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        panel.add(scrollPane, BorderLayout.CENTER);

        // Bottom button panel
        JPanel buttonPanel = new JPanel(new GridLayout(2, 3, 10, 10));
        JButton addLogButton = new JButton("Add Log");
        JButton viewLogsButton = new JButton("View Logs");
        JButton summaryByDateButton = new JButton("Summary by Date");
        JButton summaryBySubjectButton = new JButton("Summary by Subject");
        JButton exportButton = new JButton("Export CSV");
        JButton clearButton = new JButton("Clear");

        buttonPanel.add(addLogButton);
        buttonPanel.add(viewLogsButton);
        buttonPanel.add(summaryByDateButton);
        buttonPanel.add(summaryBySubjectButton);
        buttonPanel.add(exportButton);
        buttonPanel.add(clearButton);

        panel.add(buttonPanel, BorderLayout.SOUTH);

        frame.getContentPane().add(panel);
        frame.setVisible(true);

        // Action Listeners
        addLogButton.addActionListener(e -> {
            String subject = subjectField.getText().trim();
            String hoursStr = hoursField.getText().trim();
            String dateStr = dateField.getText().trim();

            if (subject.isEmpty() || hoursStr.isEmpty() || dateStr.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Please fill all fields.");
                return;
            }

            try {
                double hours = Double.parseDouble(hoursStr);
                LocalDate date = LocalDate.parse(dateStr);

                studyTracker.addLog(subject, hours, date);
                JOptionPane.showMessageDialog(frame, "Study log added!");
                subjectField.setText("");
                hoursField.setText("");
                dateField.setText(LocalDate.now().toString());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Invalid hours format.");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(frame, "Invalid date format.");
            }
        });

        viewLogsButton.addActionListener(e -> {
            textArea.setText("");
            List<StudyLog> logs = studyTracker.getAllLogs();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

            if (logs.isEmpty()) {
                textArea.setText("No logs found.");
            } else {
                for (StudyLog log : logs) {
                    textArea.append("Subject: " + log.getSubject()
                            + ", Hours: " + log.getHours()
                            + ", Date: " + log.getDate().format(formatter) + "\n");
                }
            }
        });

        summaryByDateButton.addActionListener(e -> {
            textArea.setText("");
            textArea.setText(studyTracker.getSummaryByDate());
        });

        summaryBySubjectButton.addActionListener(e -> {
            textArea.setText("");
            textArea.setText(studyTracker.getSummaryBySubject());
        });

        exportButton.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            if (fileChooser.showSaveDialog(frame) == JFileChooser.APPROVE_OPTION) {
                String filePath = fileChooser.getSelectedFile().getAbsolutePath();
                studyTracker.exportCSV(filePath);
                JOptionPane.showMessageDialog(frame, "Exported successfully!");
            }
        });

        clearButton.addActionListener(e -> textArea.setText(""));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(StudyTrackerGUI::new);
    }
}

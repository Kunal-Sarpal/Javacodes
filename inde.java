import javax.swing.*;

public class inde {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Create a new JFrame
            JFrame frame = new JFrame("Simple Swing GUI");
            // Set the size of the frame
            frame.setSize(300, 200);
            // Set default close operation
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            // Create a JLabel
            JLabel label = new JLabel("Hello, Swing!", JLabel.CENTER);
            // Add the label to the frame
            frame.getContentPane().add(label);
            // Center the frame on the screen
            frame.setLocationRelativeTo(null);
            // Make the frame visible
            frame.setVisible(true);
        });
    }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Myrame extends JFrame implements ActionListener {
    JLabel label;
    JButton button;
    int count = 0;

    Myrame() {
        super("Swing Frame");
        setLayout(new FlowLayout());
        label = new JLabel("Clicked " + ++count + " Times");
        button = new JButton("Click");
        add(label);
        add(button);
        button.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        count++;
        label.setText("Clicked " + count + " Times");
    }
}

public class First2{
    public static void main(String[] args) {
        Myrame frame = new Myrame();
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

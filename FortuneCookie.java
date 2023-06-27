
package fortune.cookie;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FortuneCookie extends JFrame {
    private JButton button;

    public FortuneCookie() {
        // Set up the JFrame
        setTitle("Fortune Cookie ");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create a button
        button = new JButton("Open Fortune Cookie");

        // Add an ActionListener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Generate a random fortune message
                String fortune = generateFortune();

                // Display the fortune in a message dialog
                JOptionPane.showMessageDialog(FortuneCookie.this, fortune, "Fortune Cookie Message", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // Add the button to the JFrame
        setLayout(new FlowLayout());
        add(button);
    }

    // Generate a random fortune message
    private String generateFortune() {
        String[] fortunes = {
                "A beautiful, smart, and loving person will be coming into your life.",
                "Your future will be full of exciting adventures and opportunities.",
                "Good things come to those who wait.",
                "Today is your lucky day!",
                "You will achieve great success in your endeavors.",
                "Believe in yourself, and anything is possible."
        };

        int randomIndex = (int) (Math.random() * fortunes.length);
        return fortunes[randomIndex];
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                FortuneCookie app = new FortuneCookie();
                app.setVisible(true);
            }
        });
    }
}
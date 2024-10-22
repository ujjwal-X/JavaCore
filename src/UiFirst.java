import javax.swing.*;

public class UiFirst {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My First GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JButton button = new JButton("Click Me!");
        frame.getContentPane().add(button);

        frame.setVisible(true);
    }
}


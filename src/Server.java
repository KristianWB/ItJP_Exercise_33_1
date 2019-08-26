import javax.swing.*;
import java.awt.*;

public class Server extends JFrame   {

    private JTextArea jta = new JTextArea();

    public static void main(String args[])   {
        new Server();
        }

    public Server()  {
        setLayout(new BorderLayout());
        add(new JScrollPane(jta), BorderLayout.CENTER);

        setTitle("Server");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        
    }
}
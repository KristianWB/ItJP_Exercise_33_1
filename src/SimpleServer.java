/*
import java.io.DataInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {

    public static void main(String[] args) {


        try {
            // Server, der lytter på port 1
            ServerSocket server = new ServerSocket(1);

            System.out.println("Serveren kører fint!");

            // Fyrer op under op serveren
            Socket socket = server.accept();

            System.out.println("Serveren har modtaget en forbindelse fra " + socket.getRemoteSocketAddress().toString());

            while (true) {

                DataInputStream in = new DataInputStream
                        (socket.getInputStream());
                DataOutputStream out = new DataOutputStream
                        (socket.getOutputStream());

                double annualInterestRate = in.readDouble();
                System.out.println(annualInterestRate);
                double numberOfYears = in.readDouble();
                System.out.println(numberOfYears);
                double loanAmount = in.readDouble();
                System.out.println(loanAmount);

                double sum = annualInterestRate + numberOfYears + loanAmount;
                out.writeDouble(sum);

                if(sum == 0.0) { break; }
            }


        } catch (IOException e) {
            System.out.println("Paven er fucked!");


            e.printStackTrace();

        }


    }

}

 */
/**
 * Created by mdesousa on 22/10/2015.
 */

import java.io.IOException;
import java.net.ServerSocket;

public class ComunicaTCPServer {

    private ServerSocket server;

    //Constructor
    ComunicaTCPServer(int numPort)
    {
        try {
            this.server = new ServerSocket(numPort);
            this.server.accept();


        } catch (IOException e) {
            e.printStackTrace();
        }


    }





}

package jwol.example;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.ResourceHandler;

public class Blarg {
    public static void main(String[] args) {
        Server server = new Server(8080);

        ResourceHandler handler = new ResourceHandler();
        handler.setWelcomeFiles(new String[]{ "index.html" });
        handler.setResourceBase(".");
        server.setHandler(handler);

        try {
            server.start();
        } catch (Exception e) {
            e.printStackTrace();
        }

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try {
                server.stop();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }));

        System.out.println("CTRL-C to stop server");

        try {
            server.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

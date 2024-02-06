package ovh.jakubk.server;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ovh.jakubk.server.enumeration.Status;
import ovh.jakubk.server.model.Server;
import ovh.jakubk.server.repository.ServerRepository;

import java.io.File;

@SpringBootApplication
public class ServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class, args);
        System.out.println(System.getProperty("user.dir"));
        System.out.println(System.getProperty("user.dir")
                + File.separator
                + "server"
                + File.separator
                + "image");
    }

    @Bean
    CommandLineRunner run(ServerRepository serverRepository) {
        return args -> {
            serverRepository.save(new Server(
                    null,
                    "192.168.1.160",
                    "Ubuntu",
                    "16GB",
                    "PC",
                    "http://localhost:8080/server/image/server1.png",
                    Status.SERVER_UP));
            serverRepository.save(new Server(
                    null,
                    "192.168.1.58",
                    "Fedora",
                    "16GB",
                    "Tower",
                    "http://localhost:8080/server/image/server2.png",
                    Status.SERVER_DOWN));
            serverRepository.save(new Server(
                    null,
                    "192.168.1.10",
                    "MS 2008",
                    "32GB",
                    "Web Server",
                    "http://localhost:8080/server/image/server3.png",
                    Status.SERVER_DOWN));
            serverRepository.save(new Server(
                    null,
                    "192.168.1.14",
                    "Red Hat",
                    "64GB",
                    "Mail",
                    "http://localhost:8080/server/image/server4.png",
                    Status.SERVER_DOWN));
        };
    }


}

package ovh.jakubk.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ovh.jakubk.server.model.Server;

public interface ServerRepository extends JpaRepository<Server, Long> {
    Server findByIpAddress(String ipAddress);

}
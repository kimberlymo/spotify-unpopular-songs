package ch.bbw.modul151.spotifyunpopularsongs;

import org.springframework.boot.SpringApplication;
import org.h2.tools.Server;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.sql.SQLException;

@SpringBootApplication
public class SpotifyUnpopularSongsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpotifyUnpopularSongsApplication.class, args);
    }

    @Bean(initMethod = "start", destroyMethod = "stop")
    public Server inMemoryH2DatabaseServer() throws SQLException {
        return Server.createTcpServer("-tcp", "-tcpAllowOthers", "-tcpPort", "9090");
    }

}

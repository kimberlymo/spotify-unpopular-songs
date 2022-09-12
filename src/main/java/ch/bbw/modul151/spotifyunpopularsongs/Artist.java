package ch.bbw.modul151.spotifyunpopularsongs;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Artist {
    @Id
    private String artistId;
    private String artistName;
    private List<String> genre;
}

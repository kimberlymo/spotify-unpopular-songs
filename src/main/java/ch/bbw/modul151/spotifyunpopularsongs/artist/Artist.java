package ch.bbw.modul151.spotifyunpopularsongs.artist;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Artist {
    private String artistId;
    @Id
    private String artistName;
    private String genre;
}

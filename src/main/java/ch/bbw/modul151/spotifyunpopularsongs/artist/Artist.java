package ch.bbw.modul151.spotifyunpopularsongs.artist;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Artist {
    private String artistId;
    @Id
    private String artistName;
    private String genre;

    public String getArtistId() {
        return artistId;
    }

    public void setArtistId(String artistId) {
        this.artistId = artistId;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}

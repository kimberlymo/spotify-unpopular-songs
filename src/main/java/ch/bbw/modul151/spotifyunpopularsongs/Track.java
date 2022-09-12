package ch.bbw.modul151.spotifyunpopularsongs;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Track {

    @Id
    private String trackId;
    private Double danceability;
    private Double energy;
    private Double trackKey;
    private Double loudness;
    private Double mode;
    private Double speechiness;
    private Double acousticness;
    private Double instrumentalness;
    private Double liveness;
    private Double valence;
    private Double tempo;
    private Double durationMs;
    private Boolean explicit;
    private Double popularity;
    private String trackName;
    //foreign key
    private String trackArtist;


}//
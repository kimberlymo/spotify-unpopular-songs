package ch.bbw.modul151.spotifyunpopularsongs.track;

import ch.bbw.modul151.spotifyunpopularsongs.artist.Artist;

import javax.persistence.*;

@Entity
public class Track {

    @Id
    private String trackId;
    private Double danceability;
    private Double energy;
    private Integer trackKey;
    private Double loudness;
    private Integer mode;
    private Double speechiness;
    private Double acousticness;
    private Double instrumentalness;
    private Double liveness;
    private Double valence;
    private Double tempo;
    private Integer durationMs;
    private Boolean explicit;
    private Integer popularity;
    private String trackName;
    @ManyToOne
    @JoinColumn(name="TRACK_ARTIST")
    private Artist trackArtist;

}
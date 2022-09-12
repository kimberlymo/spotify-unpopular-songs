package ch.bbw.modul151.spotifyunpopularsongs.track;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrackRepository extends JpaRepository<Track, String> {

    void deleteTrackByTrackArtistIs(String artistToDelete);

    List<Track> findByTrackArtist(String artistName);
}

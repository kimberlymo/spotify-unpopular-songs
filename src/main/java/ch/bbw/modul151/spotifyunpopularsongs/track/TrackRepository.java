package ch.bbw.modul151.spotifyunpopularsongs.track;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface TrackRepository extends JpaRepository<Track, String> {

    @Transactional
    void deleteByTrackName(String trackToDelete);

    List<Track> findByTrackName(String trackName);

    List<Track> findByEnergyLessThanOrderByEnergy(Double energy, Pageable paging);

    //@Query("SELECT * FROM TRACK")
    //List<Track> getTrackOlderThanOneYear();
}

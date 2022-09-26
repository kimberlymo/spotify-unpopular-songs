package ch.bbw.modul151.spotifyunpopularsongs.track;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface TrackRepository extends JpaRepository<Track, String> {

    @Transactional
    void deleteByTrackName(String trackToDelete);

    List<Track> findByTrackName(String trackName);

    List<Track> findByEnergyLessThanOrderByEnergy(Double energy, Pageable paging);

    List<Track> findByAcousticnessIsGreaterThanAndDanceabilityIsGreaterThanAndExplicitTrue(Double acousticness, Double dancability);

    @Query(value = "SELECT * FROM TRACK WHERE UTF8TOSTRING(SECURE_RAND(2)) = ':)'", nativeQuery = true)
    List<Track> findByCPRNGBeingHappyAboutTheTrack();

}

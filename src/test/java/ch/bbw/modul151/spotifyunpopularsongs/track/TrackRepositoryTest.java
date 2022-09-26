package ch.bbw.modul151.spotifyunpopularsongs.track;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Pageable;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TrackRepositoryTest {

    @Autowired
    private TrackRepository repository;
    private static final String TRACK_NAME_DELETE_CORRECT = "Ride on It (Live)";
    private static final String TRACK_NAME_DELETE_INCORRECT = "bobby123455";

    @Test
    void deleteByTrackNameIsSuccessful() {
        assertEquals(1866, repository.count());
        repository.deleteByTrackName(TRACK_NAME_DELETE_CORRECT);
        assertEquals(1865, repository.count());
        assertEquals(0, repository.findByTrackName(TRACK_NAME_DELETE_CORRECT).size());
    }

    @Test
    void deleteTrackNameNotFound() {
        assertEquals(0, repository.findByTrackName(TRACK_NAME_DELETE_INCORRECT).size());
        assertEquals(1866, repository.count());
        repository.deleteByTrackName(TRACK_NAME_DELETE_INCORRECT);
        assertEquals(1866, repository.count());
    }

    @Test
    void findByEnergy() {
        Pageable paging = Pageable.ofSize(1);
        var tracks = repository.findByEnergyLessThanOrderByEnergy(0.5, paging);
        assertEquals(tracks.size(), 1);
    }

    @Test
    void getTrackWithArtist() {
        List<Track> tracks = repository.findAll();
        assertNotNull(tracks);
        for (Track curTrack : tracks) {
            assertNotNull(curTrack.getTrackArtist());
            assertNotNull(curTrack.getTrackArtist().getArtistId());
        }
    }

    @Test
    void happyCPRNG() {
        var happiness = repository.findByCPRNGBeingHappyAboutTheTrack();
        assertNotNull(happiness);
    }

    @Test
    public void testGetAcousticnessBiggerThanAndDanceabilityBiggerThanAndExplicitTrue() {
        List<Track> result = repository.findByAcousticnessIsGreaterThanAndDanceabilityIsGreaterThanAndExplicitTrue(0.3, 0.2);
        assertEquals(183, result.size());
        for (Track curTrack : result) {
            assertTrue(curTrack.getExplicit(), "explicit is false!!");
            assertTrue(curTrack.getAcousticness() > 0.3, "acousticness is smaller!!");
            assertTrue(curTrack.getDanceability() > 0.2, "danceability is smaller!!");
        }
    }
}
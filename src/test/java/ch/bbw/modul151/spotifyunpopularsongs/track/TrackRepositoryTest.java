package ch.bbw.modul151.spotifyunpopularsongs.track;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

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
}
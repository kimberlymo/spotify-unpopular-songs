package ch.bbw.modul151.spotifyunpopularsongs.track;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TrackRepositoryTest {

    @Autowired
    private TrackRepository repository;
    private String artistNameToDelete;

    @Test
    void deleteIsSuccessful() {
        artistNameToDelete = "James Reeder";

        assertEquals(10877, repository.count());
        repository.deleteByTrackArtist(artistNameToDelete);
        assertEquals(10852, repository.count());
        assertEquals(0, repository.findByTrackArtist(artistNameToDelete).size());
    }

    @Test
    void deleteTrackArtistNotFound() {
        artistNameToDelete = "bobby123455";

        assertEquals(0, repository.findByTrackArtist(artistNameToDelete).size());
    }

}
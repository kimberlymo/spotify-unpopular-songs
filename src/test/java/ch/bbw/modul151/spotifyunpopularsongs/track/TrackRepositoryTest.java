package ch.bbw.modul151.spotifyunpopularsongs.track;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TrackRepositoryTest {

    private TrackRepository repository;
    private String artistNameToDelete;

    @Test
    void deleteIsSuccessful() {
        artistNameToDelete = "James Reeder";

        assertEquals(1000, repository.count());
        repository.deleteTrackByTrackArtistIs(artistNameToDelete);
        assertEquals(975, repository.count());
        assertEquals(0, repository.findByTrackArtist(artistNameToDelete).size());
    }

    @Test
    void artistNotFound() {
        artistNameToDelete = "bobby123455";
    }

}
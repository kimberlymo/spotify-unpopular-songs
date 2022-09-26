package ch.bbw.modul151.spotifyunpopularsongs.track;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tracks")
public class TrackController {
    private final TrackRepository repository;
    private final Logger LOGGER = LoggerFactory.getLogger(TrackController.class);

    public TrackController(TrackRepository repository) {
        this.repository = repository;
    }

    @DeleteMapping("/by-name/{trackName}")
    public void deleteTrackByName(@PathVariable String trackName) {
        LOGGER.debug("Method DELETE with parameter " + trackName + " is being called");
        repository.deleteByTrackName(trackName);
        LOGGER.debug("Method DELETE has completed");
    }

    @GetMapping("/by-energy")
    public List<Track> getTrackByEnergyLessThan(@RequestParam Double energy, @RequestBody PageRequest paging) {
        LOGGER.debug("Method GET with parameter " + energy + " is being called");
        var tracks = repository.findByEnergyLessThanOrderByEnergy(energy, paging);
        LOGGER.debug("Method GET has completed");
        return tracks;
    }

    @GetMapping
    public List<Track> getAllTracks() {
        LOGGER.debug("Method GET for getting all track entities is being called");
        List<Track> tracks = repository.findAll();
        LOGGER.debug("Method GET has been completed");
        return tracks;
    }
}

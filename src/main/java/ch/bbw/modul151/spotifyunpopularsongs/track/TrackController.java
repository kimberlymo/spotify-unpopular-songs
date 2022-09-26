package ch.bbw.modul151.spotifyunpopularsongs.track;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tracks")
public class TrackController {
    private final TrackRepository repository;
    private final Logger LOGGER = LoggerFactory.getLogger(TrackController.class);

    public TrackController(TrackRepository repository) {
        this.repository = repository;
    }

    @DeleteMapping("/{trackName}")
    public void deleteTrackByName(@PathVariable String trackName) {
        LOGGER.debug("Method DELETE with parameter " + trackName + " is being called");
        repository.deleteByTrackName(trackName);
        LOGGER.debug("Method DELETE has completed");
    }
}

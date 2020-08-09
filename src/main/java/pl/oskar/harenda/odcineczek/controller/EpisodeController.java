package pl.oskar.harenda.odcineczek.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import pl.oskar.harenda.odcineczek.api.EpisodeApi;
import pl.oskar.harenda.odcineczek.entity.Episode;
import pl.oskar.harenda.odcineczek.service.EpisodeService;

import java.util.List;

@RestController
public class EpisodeController implements EpisodeApi {

    private final EpisodeService episodeService;

    public EpisodeController(EpisodeService episodeService) {
        this.episodeService = episodeService;
    }

    @Override
    public ResponseEntity<Episode> updateEpisode(Long id, Episode episode) {
        return ResponseEntity.ok(episodeService.updateEpisode(id, episode));
    }

    @Override
    public ResponseEntity<Episode> addEpisode(Episode episode) {
        return ResponseEntity.ok(episodeService.addEpisode(episode));
    }

    @Override
    public ResponseEntity<List<Episode>> getEpisodes() {
        return ResponseEntity.ok(episodeService.getAllEpisodes());
    }

    @Override
    public ResponseEntity<Episode> getEpisodeById(Long id) {
        return ResponseEntity.ok(episodeService.getEpisodeById(id));
    }

    @Override
    public ResponseEntity<?> deleteEpisodeById(Long id) {
        episodeService.deleteEpisode(id);
        return ResponseEntity.noContent().build();
    }
}

package pl.oskar.harenda.odcineczek.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.oskar.harenda.odcineczek.entity.Episode;

import java.util.List;

@RequestMapping("/api/episode")
public interface EpisodeApi {
    @PutMapping("/{id}")
    ResponseEntity<Episode> updateEpisode(@PathVariable Long id, @RequestBody Episode episode);

    @PostMapping
    ResponseEntity<Episode> addEpisode(@RequestBody Episode episode);

    @GetMapping
    ResponseEntity<List<Episode>> getEpisodes();

    @GetMapping("/{id}")
    ResponseEntity<Episode> getEpisodeById(@PathVariable Long id);

    @DeleteMapping("/{id}")
    ResponseEntity<?> deleteEpisodeById(@PathVariable Long id);
}

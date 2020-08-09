package pl.oskar.harenda.odcineczek.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.oskar.harenda.odcineczek.entity.Season;

import java.util.List;

@RequestMapping("/api/season")
public interface SeasonApi {
    @PutMapping("/{id}")
    ResponseEntity<Season> updateSeason(@PathVariable Long id, @RequestBody Season season);

    @PostMapping
    ResponseEntity<Season> addSeason(@RequestBody Season season);

    @GetMapping
    ResponseEntity<List<Season>> getSeasons();

    @GetMapping("/{id}")
    ResponseEntity<Season> getSeasonById(@PathVariable Long id);

    @DeleteMapping("/{id}")
    ResponseEntity<?> deleteSeasonById(@PathVariable Long id);
}

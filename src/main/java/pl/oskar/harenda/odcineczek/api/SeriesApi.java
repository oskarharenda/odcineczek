package pl.oskar.harenda.odcineczek.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.oskar.harenda.odcineczek.entity.Series;

import java.util.List;

@RequestMapping("/api/series")
public interface SeriesApi {
    @PutMapping("/{id}")
    ResponseEntity<Series> updateSeries(@PathVariable Long id, @RequestBody Series series);

    @PostMapping
    ResponseEntity<Series> addSeries(@RequestBody Series series);

    @GetMapping
    ResponseEntity<List<Series>> getSeries();

    @GetMapping("/{id}")
    ResponseEntity<Series> getSeriesById(@PathVariable Long id);

    @DeleteMapping("/{id}")
    ResponseEntity<?> deleteSeriesById(@PathVariable Long id);
}

package pl.oskar.harenda.odcineczek.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import pl.oskar.harenda.odcineczek.api.SeriesApi;
import pl.oskar.harenda.odcineczek.entity.Series;
import pl.oskar.harenda.odcineczek.service.SeriesService;

import java.util.List;

@RestController
public class SeriesController implements SeriesApi {
    private final SeriesService seriesService;

    public SeriesController(SeriesService seriesService) {
        this.seriesService = seriesService;
    }

    @Override
    public ResponseEntity<Series> updateSeries(Long id, Series series) {
        return ResponseEntity.ok(seriesService.updateSeries(series, id));
    }

    @Override
    public ResponseEntity<Series> addSeries(Series series) {
        return ResponseEntity.ok(seriesService.addSeries(series));
    }

    @Override
    public ResponseEntity<List<Series>> getSeries() {
        return ResponseEntity.ok(seriesService.getAllSeries());
    }

    @Override
    public ResponseEntity<Series> getSeriesById(Long id) {
        return ResponseEntity.ok(seriesService.getSeriesById(id));
    }

    @Override
    public ResponseEntity<?> deleteSeriesById(Long id) {
        seriesService.deleteSeries(id);
        return ResponseEntity.noContent().build();
    }
}

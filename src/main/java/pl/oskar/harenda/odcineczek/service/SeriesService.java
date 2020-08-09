package pl.oskar.harenda.odcineczek.service;

import org.springframework.stereotype.Service;
import pl.oskar.harenda.odcineczek.entity.Series;
import pl.oskar.harenda.odcineczek.repository.SeriesRepository;

import java.util.List;

@Service
public class SeriesService {

    private final SeriesRepository seriesRepository;

    public SeriesService(SeriesRepository seriesRepository) {
        this.seriesRepository = seriesRepository;
    }

    public Series getSeriesById(Long id) {
        return seriesRepository.findById(id).orElseGet(() -> null);
    }

    public List<Series> getAllSeries() {
        return seriesRepository.findAll();
    }

    public Series addSeries(Series series) {
        return seriesRepository.save(series);
    }

    public Series updateSeries(Series series, Long id) {
        seriesRepository.findById(id).orElseGet(() -> null);
        series.setId(id);
        return seriesRepository.save(series);
    }

    public void deleteSeries(Long id) {
        seriesRepository.deleteById(id);
    }
}

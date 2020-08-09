package pl.oskar.harenda.odcineczek.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import pl.oskar.harenda.odcineczek.api.SeasonApi;
import pl.oskar.harenda.odcineczek.entity.Season;
import pl.oskar.harenda.odcineczek.service.SeasonService;

import java.util.List;

@RestController
public class SeasonController implements SeasonApi {
    private final SeasonService seasonService;

    public SeasonController(SeasonService seasonService) {
        this.seasonService = seasonService;
    }

    @Override
    public ResponseEntity<Season> updateSeason(Long id, Season season) {
        return ResponseEntity.ok(seasonService.updateSeason(id, season));
    }

    @Override
    public ResponseEntity<Season> addSeason(Season season) {
        return ResponseEntity.ok(seasonService.addSeason(season));
    }

    @Override
    public ResponseEntity<List<Season>> getSeasons() {
        return ResponseEntity.ok(seasonService.getAllSeasons());
    }

    @Override
    public ResponseEntity<Season> getSeasonById(Long id) {
        return ResponseEntity.ok(seasonService.getSeasonById(id));
    }

    @Override
    public ResponseEntity<?> deleteSeasonById(Long id) {
        seasonService.deleteSeason(id);
        return ResponseEntity.noContent().build();
    }
}

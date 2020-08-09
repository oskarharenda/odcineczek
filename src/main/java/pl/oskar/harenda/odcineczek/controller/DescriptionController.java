package pl.oskar.harenda.odcineczek.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import pl.oskar.harenda.odcineczek.api.DescriptionApi;
import pl.oskar.harenda.odcineczek.entity.Description;
import pl.oskar.harenda.odcineczek.service.DescriptionService;

import java.util.List;

@RestController
public class DescriptionController implements DescriptionApi {

    public final DescriptionService descriptionService;

    public DescriptionController(DescriptionService descriptionService) {
        this.descriptionService = descriptionService;
    }

    @Override
    public ResponseEntity<Description> updateDescription(Long id, Description description) {
        return ResponseEntity.ok(descriptionService.updateDescription(id, description));
    }

    @Override
    public ResponseEntity<Description> addDescription(Description description) {
        return ResponseEntity.ok(descriptionService.addDescription(description));
    }

    @Override
    public ResponseEntity<List<Description>> getDescriptions() {
        return ResponseEntity.ok(descriptionService.getAllDescription());
    }

    @Override
    public ResponseEntity<Description> getDescriptionById(Long id) {
        return ResponseEntity.ok(descriptionService.getDescriptionById(id));
    }

    @Override
    public ResponseEntity<?> deleteDescriptionById(Long id) {
        descriptionService.deleteDescription(id);
        return ResponseEntity.noContent().build();
    }
}

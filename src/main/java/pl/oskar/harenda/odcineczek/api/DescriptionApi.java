package pl.oskar.harenda.odcineczek.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.oskar.harenda.odcineczek.entity.Description;

import java.util.List;

@RequestMapping("/api/description")
public interface DescriptionApi {

    @PutMapping("/{id}")
    ResponseEntity<Description> updateDescription(@PathVariable Long id, @RequestBody Description description);

    @PostMapping
    ResponseEntity<Description> addDescription(@RequestBody Description description);

    @GetMapping
    ResponseEntity<List<Description>> getDescriptions();

    @GetMapping("/{id}")
    ResponseEntity<Description> getDescriptionById(@PathVariable Long id);

    @DeleteMapping("/{id}")
    ResponseEntity<?> deleteDescriptionById(@PathVariable Long id);
}

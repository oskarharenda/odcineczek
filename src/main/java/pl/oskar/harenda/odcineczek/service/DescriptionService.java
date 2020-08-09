package pl.oskar.harenda.odcineczek.service;

import org.springframework.stereotype.Service;
import pl.oskar.harenda.odcineczek.entity.Description;
import pl.oskar.harenda.odcineczek.repository.DescriptionRepository;

import java.util.List;

@Service
public class DescriptionService {

    private final DescriptionRepository descriptionRepository;

    public DescriptionService(DescriptionRepository descriptionRepository) {
        this.descriptionRepository = descriptionRepository;
    }

    public Description getDescriptionById(Long id) {
        return descriptionRepository.findById(id).orElseGet(() -> null);
    }

    public List<Description> getAllDescription() {
        return descriptionRepository.findAll();
    }

    public Description addDescription(Description description) {
        return descriptionRepository.save(description);
    }

    public Description updateDescription(Long id, Description description) {
        descriptionRepository.findById(id).orElseGet(()->null);
        description.setId(id);
        return descriptionRepository.save(description);
    }

    public void deleteDescription(Long id){
        descriptionRepository.deleteById(id);
    }
}

package pl.oskar.harenda.odcineczek.service;

import org.springframework.stereotype.Service;
import pl.oskar.harenda.odcineczek.entity.Episode;
import pl.oskar.harenda.odcineczek.repository.EpisodeRepository;

@Service
public class EpisodeService {

    private final EpisodeRepository episodeRepository;

    public EpisodeService(EpisodeRepository episodeRepository) {
        this.episodeRepository = episodeRepository;
    }

    public Episode getEpisodeById(Long id){
        return episodeRepository.findById(id).orElseGet(() -> null);
    }

    public Iterable<Episode> getAllEpisodes(){
        return episodeRepository.findAll();
    }

    public  Episode addEpisode(Episode episode){
        return episodeRepository.save(episode);
    }

    public Episode updateEpisode(Long id, Episode episode){
        episodeRepository.findById(id).orElseGet(() -> null);
        episode.setId(id);
        return episodeRepository.save(episode);
    }

    public void deleteEpisode(Long id){
        episodeRepository.deleteById(id);
    }
}

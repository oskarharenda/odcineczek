package pl.oskar.harenda.odcineczek.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Season {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int SeasonNr;

    private int episodesNr;

    @OneToMany
    private List<Episode> episodeList = new ArrayList<>();
}

package pl.oskar.harenda.odcineczek.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Season {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int SeasonNr;

    private int episodesNr;

    @OneToMany
    private List<Episode> episodeList = new ArrayList<>();

    @ManyToOne
    private Series series;
}

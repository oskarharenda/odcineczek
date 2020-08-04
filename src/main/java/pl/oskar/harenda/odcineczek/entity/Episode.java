package pl.oskar.harenda.odcineczek.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Episode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String links;

    @OneToMany
    private List<Description> descriptionList = new ArrayList<>();

    @ManyToOne
    private Season season;
}

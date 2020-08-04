package pl.oskar.harenda.odcineczek.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Description {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private int note;

    private String comment;

    @ManyToOne
    private Episode episode;
}

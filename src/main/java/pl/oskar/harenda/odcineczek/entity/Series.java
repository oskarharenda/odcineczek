package pl.oskar.harenda.odcineczek.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@ToString(exclude = "id")
public class Series {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int seasonsNumber;

    private String description;

    @OneToMany
    private List<Season> seasonList = new ArrayList<>();
}

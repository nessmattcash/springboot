package tn.esprit.nessmattcash.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Foyer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long idFoyer;
    private String nomFoyer;
    private long capaciteFoyer;

    @ManyToOne
    @JoinColumn(name = "universite_id")
    private Universite universite ;
    @OneToMany(mappedBy = "foyer")
    private List<Bloc> blocs ;
}

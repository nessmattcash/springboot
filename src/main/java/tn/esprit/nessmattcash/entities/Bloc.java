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

public class Bloc implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long idBloc;
    private String nomBloc;

    private long capaciteBloc;
 @ManyToOne
 @JoinColumn(name = "foyer_id")
 private Foyer foyer;

 @OneToMany(mappedBy = "bloc")
 private List<Chambre> chambres;
}

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
public class Universite implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long idUniversite;
    private String nomUniversite;
    private String adresse;
    @OneToMany(mappedBy = "universite")
    private List<Foyer> foyers ;
}

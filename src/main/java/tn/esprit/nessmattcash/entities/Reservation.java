package tn.esprit.nessmattcash.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Reservation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private String idReservation;

    @Temporal(TemporalType.DATE)

    private Date anneUniversitaire;
    private boolean estValide;

    @ManyToOne
    @JoinColumn(name = "etudiant_id")
    private Etudiant etudiant ;
    @ManyToOne
    @JoinColumn(name = "chambre_id")  // Foreign key referencing the Chambre table
    private Chambre chambre;

}

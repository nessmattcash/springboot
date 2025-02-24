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
public class Chambre implements Serializable {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)

   private long idChambre;
    private long numeroChambre;

    @Enumerated(EnumType.STRING)
    private TypeChambre typeC;
    @ManyToOne
    @JoinColumn(name = "bloc_id")
    private Bloc bloc;
    @OneToMany(mappedBy = "chambre")
    private List<Reservation> reservations ;
}

package entity;

import java.util.UUID;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Table
@Entity
public class Postazione<Edificio> {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private UUID id;

	private String codice;
	private String descrizione;
	@Enumerated(EnumType.STRING)

	private int numeroMassimoOccupanti;

	@ManyToOne
	@JoinColumn(name = "edificio_id")
	private Edificio edificio;

	// Costruttori, getter e setter
}
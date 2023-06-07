package entity;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table
@Getter
@Setter
@NoArgsConstructor
@Entity
public class Prenotazione {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private LocalDate dataPrenotazione;

	@ManyToOne
	@JoinColumn(name = "postazione_id")
	private Postazione<?> postazione;

	@ManyToOne
	@JoinColumn(name = "utente_username")
	private Utente utente;

}
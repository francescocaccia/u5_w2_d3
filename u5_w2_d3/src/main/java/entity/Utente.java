package entity;

import java.util.List;
import java.util.UUID;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table
@Getter
@Setter
@Entity
@NoArgsConstructor
public class Utente {

	@Id
	private UUID id;
	private String username;

	private String nomeCompleto;
	private String email;

	@OneToMany(mappedBy = "utente")
	private List<Prenotazione> prenotazioni;

}
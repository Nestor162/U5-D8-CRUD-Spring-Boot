package nestorcicardini.D8.utenti;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
@Table(name = "utenti")
public class Utente {
	@Id
	@GeneratedValue
	private UUID id;
	private String username;
	private String email;
}

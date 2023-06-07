package nestorcicardini.D8.postazioni;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "postazioni")
public class Postazione {
	@Id
	@GeneratedValue
	private UUID id;
	private Tipo tipo;
	private String citta;

	public enum Tipo {
		PRIVATO, OPENSCALE, SALA_RIUNIONI
	}
}

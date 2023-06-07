package nestorcicardini.D8.postazioni;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "postazioni")
public class Postazione {
	@Id
	@GeneratedValue
	private UUID id;
	@Enumerated(EnumType.STRING)
	private Tipo tipo;
	private String citta;

	public enum Tipo {
		PRIVATO, OPENSCALE, SALA_RIUNIONI
	}

	public Postazione(Tipo tipo, String citta) {
		super();
		this.tipo = tipo;
		this.citta = citta;
	}

}

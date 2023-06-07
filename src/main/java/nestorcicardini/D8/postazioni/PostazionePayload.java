package nestorcicardini.D8.postazioni;

import lombok.Getter;
import nestorcicardini.D8.postazioni.Postazione.Tipo;

@Getter
public class PostazionePayload {
	private Tipo tipo;
	private String citta;
}

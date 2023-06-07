package nestorcicardini.D8.utenti.Payloads;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;

@Getter
public class UtentePayload {

	@NotNull(message = "L'attributo nome è obbligatorio")
	@Size(min = 3, max = 30)
	private String nome;

	@NotNull(message = "L'attributo cognome è obbligatorio")
	@Size(min = 3, max = 30)
	private String cognome;

	@Email(message = "Non hai inserito un email valido")
	private String email;
}

package nestorcicardini.D8.utenti;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nestorcicardini.D8.Exceptions.BadRequestException;
import nestorcicardini.D8.utenti.Payloads.UtentePayload;

@Service
public class UtenteService {

	@Autowired
	private UtenteRepository utenteRepo;

	public Utente create(UtentePayload u) {

		// Controlla se esiste gia un utente con l'email indicata
		utenteRepo.findByEmail(u.getEmail()).ifPresent(utente -> {
			throw new BadRequestException(
					"L'indirizzo email" + utente.getEmail() + " è già in uso");
		});

		Utente nuovoUtente = new Utente(u.getNome(), u.getCognome(),
				u.getEmail());
		return utenteRepo.save(nuovoUtente);
	}

	public Utente createRandom(Utente u) {
		return utenteRepo.save(u);
	}

	public List<Utente> findAll() {
		return utenteRepo.findAll();
	}
}

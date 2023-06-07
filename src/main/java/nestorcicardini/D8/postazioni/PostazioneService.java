package nestorcicardini.D8.postazioni;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostazioneService {

	@Autowired
	private postazioneRepositoty postazioneRepo;

	public List<Postazione> findAll() {
		return postazioneRepo.findAll();
	}

	public Optional<Postazione> findById(UUID id) {
		return postazioneRepo.findById(id);
	}

	public Postazione create(PostazionePayload pp) {
		Postazione nuovaPostazione = new Postazione(pp.getTipo(),
				pp.getCitta());
		return postazioneRepo.save(nuovaPostazione);

	}
}

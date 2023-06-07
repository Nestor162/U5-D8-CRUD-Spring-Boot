package nestorcicardini.D8.postazioni;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nestorcicardini.D8.postazioni.Postazione.Tipo;

@Service
public class PostazioneService {

	@Autowired
	private PostazioneRepository postazioneRepo;

	public List<Postazione> findAll() {
		return postazioneRepo.findAll();
	}

	public List<Postazione> findByTipo(Tipo tipoEnum) {
		return postazioneRepo.findByTipo(tipoEnum);
	}

	public List<Postazione> findByCitta(String citta) {
		return postazioneRepo.findByCitta(citta);
	}

	public List<Postazione> findByTipoAndCitta(Tipo tipo, String citta) {
		return postazioneRepo.findByTipoAndCitta(tipo, citta);
	}

	public Postazione create(PostazionePayload pp) {
		Postazione nuovaPostazione = new Postazione(pp.getTipo(),
				pp.getCitta());
		return postazioneRepo.save(nuovaPostazione);

	}
}
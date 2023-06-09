package nestorcicardini.D8.postazioni;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import nestorcicardini.D8.postazioni.Postazione.Tipo;

public interface PostazioneRepository extends JpaRepository<Postazione, UUID> {
	List<Postazione> findByTipo(Tipo tipoEnum);

	List<Postazione> findByCitta(String citta);

	List<Postazione> findByTipoAndCitta(Tipo tipo, String citta);

	Optional<Postazione> findById(UUID id);

}

package nestorcicardini.D8.postazioni;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import nestorcicardini.D8.postazioni.Postazione.Tipo;

public interface PostazioneRepository extends JpaRepository<Postazione, UUID> {
	List<Postazione> findByTipo(Tipo tipoEnum);

}

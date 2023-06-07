package nestorcicardini.D8.postazioni;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface postazioneRepositoty extends JpaRepository<Postazione, UUID> {

}

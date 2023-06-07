package nestorcicardini.D8.postazioni;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/postazioni")
public class PostazioneController {

	@Autowired
	PostazioneService postazioneService;

	@GetMapping("")
	public List<Postazione> getUtenti() {
		return postazioneService.findAll();
	}

	@GetMapping("{id}")
	public Optional<Postazione> getUtentiById(@PathVariable UUID id) {
		return postazioneService.findById(id);
	}

	@PostMapping("")
	public Postazione savePostazione(@RequestBody PostazionePayload payload) {
		return postazioneService.create(payload);
	}

}

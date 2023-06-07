package nestorcicardini.D8.postazioni;

import java.util.List;

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
	public List<Postazione> getPostazioni() {
		return postazioneService.findAll();
	}

	@GetMapping("/{tipo}")
	public List<Postazione> getPostazioniByType(@PathVariable String tipo) {
		Postazione.Tipo tipoEnum = Postazione.Tipo.valueOf(tipo);
		return postazioneService.findByTipo(tipoEnum);
	}

	@PostMapping("")
	public Postazione savePostazione(@RequestBody PostazionePayload payload) {
		return postazioneService.create(payload);
	}

//	@PutMapping("")
//	public Postazione editPostazione(@RequestBody PostazionePayload payload, ) {
//	}

}

package nestorcicardini.D8.postazioni;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/postazioni")
public class PostazioneController {

	@Autowired
	PostazioneService postazioneService;

//	@GetMapping("")
//	public List<Postazione> getPostazioni() {
//		return postazioneService.findAll();
//	}

//	@GetMapping("/tipo/{tipo}")
//	public List<Postazione> getPostazioniByType(@PathVariable String tipo) {
//		Postazione.Tipo tipoEnum = Postazione.Tipo.valueOf(tipo);
//		return postazioneService.findByTipo(tipoEnum);
//	}
//
//	@GetMapping("/citta/{citta}")
//	public List<Postazione> getPostazioniByCity(@PathVariable String citta) {
//		return postazioneService.findByCitta(citta);
//	}

	@GetMapping("")
	public List<Postazione> getPostazioni(
			@RequestParam(required = false) String tipo,
			@RequestParam(required = false) String citta) {
		if (tipo != null && citta != null) {

			Postazione.Tipo tipoEnum = Postazione.Tipo.valueOf(tipo);
			return postazioneService.findByTipoAndCitta(tipoEnum, citta);

		} else if (tipo != null) {

			Postazione.Tipo tipoEnum = Postazione.Tipo.valueOf(tipo);
			return postazioneService.findByTipo(tipoEnum);

		} else if (citta != null) {

			return postazioneService.findByCitta(citta);

		} else {

			return postazioneService.findAll();
		}
	}

	@PostMapping("")
	public Postazione savePostazione(@RequestBody PostazionePayload payload) {
		return postazioneService.create(payload);
	}

//	@PutMapping("")
//	public Postazione editPostazione(@RequestBody PostazionePayload payload, ) {
//	}

}

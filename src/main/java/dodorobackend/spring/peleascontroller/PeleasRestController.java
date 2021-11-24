package dodorobackend.spring.peleascontroller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import dodorobackend.spring.peleasservice.IPeleasService;
import dodorobackend.spring.modelentity.Peleas;

@RestController
@RequestMapping("/Peleas")
public class PeleasRestController {
	@Autowired
	private IPeleasService peleasservice;
	@GetMapping("/pelea")
	public List<Peleas> findAll(){
		return peleasservice.findAll();
	}
	@PostMapping("/pelea")
	@ResponseStatus(HttpStatus.CREATED)
	public Peleas guardar(@RequestBody Peleas d) {
		return peleasservice.save(d);
	}
	@DeleteMapping("/pelea/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void borrar (@PathVariable Integer id) {
		peleasservice.delete(id);
	}
	@GetMapping("/pelea/{id}")
	public Peleas encontrarporId(@PathVariable Integer id) {
		return peleasservice.searchById(id);
	}
	@PutMapping("/pelea/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public Peleas actualizar(@PathVariable Integer id, @RequestBody Peleas e) {
		Peleas actual = peleasservice.searchById(id);
		actual.setLugar_encuentro(e.getLugar_encuentro());
		actual.setNombre_demonio(e.getNombre_demonio());
		actual.setGanador_batalla(e.getGanador_batalla());
		return peleasservice.save(actual);
	}	
}
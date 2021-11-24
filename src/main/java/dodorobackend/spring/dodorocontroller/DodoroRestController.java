package dodorobackend.spring.dodorocontroller;

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
import dodorobackend.spring.dodoroservice.IDodoroService;
import dodorobackend.spring.modelentity.Dodoro;

@RestController
@RequestMapping("/Dodoro")
public class DodoroRestController {
	@Autowired
	private IDodoroService dodoroservice;
	@GetMapping("/dodoro")
	public List<Dodoro> findAll(){
		return dodoroservice.findAll();
	}
	@PostMapping("/dodoro")
	@ResponseStatus(HttpStatus.CREATED)
	public Dodoro guardar(@RequestBody Dodoro d) {
		return dodoroservice.save(d);
	}
	@DeleteMapping("/dodoro/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void borrar (@PathVariable Integer id) {
		dodoroservice.delete(id);
	}
	@GetMapping("/dodoro/{id}")
	public Dodoro encontrarporId(@PathVariable Integer id) {
		return dodoroservice.searchById(id);
	}
	@PutMapping("/dodoro/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public Dodoro actualizar(@PathVariable Integer id, @RequestBody Dodoro e) {
		Dodoro actual = dodoroservice.searchById(id);
		actual.setArticulo(e.getArticulo());
		actual.setCastigado(e.getCastigado());
		actual.setReaccion_de_dodoro(e.getReaccion_de_dodoro());
		return dodoroservice.save(actual);
	}	
}
package dodorobackend.spring.partesfaltantescontroller;

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
import dodorobackend.spring.partesfaltantesservice.IPartesFaltantesService;
import dodorobackend.spring.modelentity.PartesFaltantes;

@RestController
@RequestMapping("/Partesfaltantes")
public class PartesFaltantesRestController {
	@Autowired
	private IPartesFaltantesService partesfaltantesservice;
	@GetMapping("/partes")
	public List<PartesFaltantes> findAll(){
		return partesfaltantesservice.findAll();
	}
	@PostMapping("/partes")
	@ResponseStatus(HttpStatus.CREATED)
	public PartesFaltantes guardar(@RequestBody PartesFaltantes d) {
		return partesfaltantesservice.save(d);
	}
	@DeleteMapping("/partes/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void borrar (@PathVariable Integer id) {
		partesfaltantesservice.delete(id);
	}
	@GetMapping("/partes/{id}")
	public PartesFaltantes encontrarporId(@PathVariable Integer id) {
		return partesfaltantesservice.searchById(id);
	}
	@PutMapping("/partes/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public PartesFaltantes actualizar(@PathVariable Integer id, @RequestBody PartesFaltantes e) {
		PartesFaltantes actual = partesfaltantesservice.searchById(id);
		actual.setPartedelcuerpo(e.getPartedelcuerpo());
		actual.setRecuperda(e.getRecuperda());
		return partesfaltantesservice.save(actual);
	}	
}

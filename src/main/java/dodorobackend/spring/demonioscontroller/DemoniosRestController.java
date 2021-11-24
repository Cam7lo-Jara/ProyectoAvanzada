package dodorobackend.spring.demonioscontroller;

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
import dodorobackend.spring.demoniosservice.IDemoniosService;
import dodorobackend.spring.modelentity.Demonios;

@RestController
@RequestMapping("/Demonios")
public class DemoniosRestController {
	@Autowired
	private IDemoniosService demoniosservice;
	@GetMapping("/demonio")
	public List<Demonios> findAll(){
		return demoniosservice.findAll();
	}
	@PostMapping("/demonio")
	@ResponseStatus(HttpStatus.CREATED)
	public Demonios guardar(@RequestBody Demonios d) {
		return demoniosservice.save(d);
	}
	@DeleteMapping("/demonio/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void borrar (@PathVariable Integer id) {
		demoniosservice.delete(id);
	}
	@GetMapping("/demonio/{id}")
	public Demonios encontrarporId(@PathVariable Integer id) {
		return demoniosservice.searchById(id);
	}
	@PutMapping("/demonio/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public Demonios actualizar(@PathVariable Integer id, @RequestBody Demonios e) {
		Demonios actual = demoniosservice.searchById(id);
		actual.setPartescuerpo(e.getPartescuerpo());
		actual.setNombre_demonio(e.getNombre_demonio());
		actual.setLugar_demonio(e.getLugar_demonio());
		return demoniosservice.save(actual);
	}	
}
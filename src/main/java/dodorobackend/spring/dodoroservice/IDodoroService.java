package dodorobackend.spring.dodoroservice;

import java.util.List;
import dodorobackend.spring.modelentity.Dodoro;

public interface IDodoroService {

	public List<Dodoro> findAll();
	public Dodoro save(Dodoro e);
	public void delete(Integer id);
	public Dodoro searchById(Integer id);
}
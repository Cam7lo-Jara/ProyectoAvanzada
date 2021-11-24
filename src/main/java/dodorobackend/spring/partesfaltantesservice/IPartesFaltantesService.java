package dodorobackend.spring.partesfaltantesservice;

import java.util.List;
import dodorobackend.spring.modelentity.PartesFaltantes;

public interface IPartesFaltantesService {

	public List<PartesFaltantes> findAll();
	public PartesFaltantes save(PartesFaltantes e);
	public void delete(Integer id);
	public PartesFaltantes searchById(Integer id);
}
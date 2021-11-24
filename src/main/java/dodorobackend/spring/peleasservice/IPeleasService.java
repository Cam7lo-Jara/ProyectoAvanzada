package dodorobackend.spring.peleasservice;

import java.util.List;
import dodorobackend.spring.modelentity.Peleas;

public interface IPeleasService {
	public List<Peleas> findAll();
	public Peleas save(Peleas e);
	public void delete(Integer id);
	public Peleas searchById(Integer id);
}


package dodorobackend.spring.demoniosservice;

import java.util.List;
import dodorobackend.spring.modelentity.Demonios;

public interface IDemoniosService {

		public List<Demonios> findAll();
		public Demonios save(Demonios e);
		public void delete(Integer id);
		public Demonios searchById(Integer id);
	}

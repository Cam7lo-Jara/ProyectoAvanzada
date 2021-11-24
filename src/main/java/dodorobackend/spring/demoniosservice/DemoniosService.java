package dodorobackend.spring.demoniosservice;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dodorobackend.spring.modelentity.Demonios;
import dodorobackend.spring.modelsDAO.IDemoniosDAO;

@Service
public class DemoniosService implements IDemoniosService{
	@Autowired
	private IDemoniosDAO demoniosdao;
	@Override
	public List<Demonios> findAll() {
		// TODO Auto-generated method stub
		return demoniosdao.findAll();
	}

	@Override
	public Demonios save(Demonios e) {
		// TODO Auto-generated method stub
		return demoniosdao.save(e);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		demoniosdao.deleteById(id);
	}

	@Override
	public Demonios searchById(Integer id) {
		// TODO Auto-generated method stub
		return demoniosdao.findById(id).orElse(null);
	}

}
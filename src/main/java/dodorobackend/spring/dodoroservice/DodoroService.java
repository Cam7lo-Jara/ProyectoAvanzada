package dodorobackend.spring.dodoroservice;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dodorobackend.spring.modelentity.Dodoro;
import dodorobackend.spring.modelsDAO.IDodoroDAO;

@Service
public class DodoroService implements IDodoroService{
	@Autowired
	private IDodoroDAO dodorodao;
	@Override
	public List<Dodoro> findAll() {
		// TODO Auto-generated method stub
		return dodorodao.findAll();
	}

	@Override
	public Dodoro save(Dodoro e) {
		// TODO Auto-generated method stub
		return dodorodao.save(e);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		dodorodao.deleteById(id);
	}

	@Override
	public Dodoro searchById(Integer id) {
		// TODO Auto-generated method stub
		return dodorodao.findById(id).orElse(null);
	}

}
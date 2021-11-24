package dodorobackend.spring.peleasservice;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dodorobackend.spring.modelentity.Peleas;
import dodorobackend.spring.modelsDAO.IPeleasDAO;
@Service
public class PeleasService implements IPeleasService{
	@Autowired
	private IPeleasDAO peleasdao;
	@Override
	public List<Peleas> findAll() {
		// TODO Auto-generated method stub
		return peleasdao.findAll();
	}

	@Override
	public Peleas save(Peleas e) {
		// TODO Auto-generated method stub
		return peleasdao.save(e);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		peleasdao.deleteById(id);
	}

	@Override
	public Peleas searchById(Integer id) {
		// TODO Auto-generated method stub
		return peleasdao.findById(id).orElse(null);
	}

}

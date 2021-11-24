package dodorobackend.spring.partesfaltantesservice;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dodorobackend.spring.modelentity.PartesFaltantes;
import dodorobackend.spring.modelsDAO.IPartesFaltantesDAO;

@Service
public class PartesFaltantesService implements IPartesFaltantesService{
	@Autowired
	private IPartesFaltantesDAO partesdao;
	@Override
	public List<PartesFaltantes> findAll() {
		// TODO Auto-generated method stub
		return partesdao.findAll();
	}

	@Override
	public PartesFaltantes save(PartesFaltantes e) {
		// TODO Auto-generated method stub
		return partesdao.save(e);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		partesdao.deleteById(id);
	}

	@Override
	public PartesFaltantes searchById(Integer id) {
		// TODO Auto-generated method stub
		return partesdao.findById(id).orElse(null);
	}

}

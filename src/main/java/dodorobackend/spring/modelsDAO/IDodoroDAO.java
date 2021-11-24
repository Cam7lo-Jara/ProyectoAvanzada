package dodorobackend.spring.modelsDAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import dodorobackend.spring.modelentity.Dodoro;

@Repository
public interface IDodoroDAO extends JpaRepository <Dodoro, Integer >{
}

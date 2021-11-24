package dodorobackend.spring.modelsDAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import dodorobackend.spring.modelentity.Demonios;

@Repository
public interface IDemoniosDAO extends JpaRepository <Demonios, Integer >{
}
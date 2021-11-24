package dodorobackend.spring.modelsDAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import dodorobackend.spring.modelentity.PartesFaltantes;

@Repository
public interface IPartesFaltantesDAO extends JpaRepository <PartesFaltantes, Integer >{
}
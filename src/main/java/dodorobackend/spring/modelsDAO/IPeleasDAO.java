package dodorobackend.spring.modelsDAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import dodorobackend.spring.modelentity.Peleas;

@Repository
public interface IPeleasDAO extends JpaRepository<Peleas, Integer >{
}
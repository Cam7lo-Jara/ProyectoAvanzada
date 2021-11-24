package dodorobackend.spring.modelentity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="Peleas")
//@JsonIgnoreProperties({"hibernateLazyInitializer", "Handler"})
public class Peleas {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column
	private String lugar_encuentro;
	private String nombre_demonio;
	private String ganador_batalla;
	
	public Peleas() {
	}
	public String getGanador_batalla() {
		return ganador_batalla;
	}
	public void setGanador_batalla(String ganador_batalla) {
		this.ganador_batalla = ganador_batalla;
	}
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	public String getLugar_encuentro() {
		return lugar_encuentro;
	}
	public void setLugar_encuentro(String lugar_encuentro) {
		this.lugar_encuentro = lugar_encuentro;
	}
	public String getNombre_demonio() {
		return nombre_demonio;
	}
	public void setNombre_demonio(String nombre_demonio) {
		this.nombre_demonio = nombre_demonio;
	}
}


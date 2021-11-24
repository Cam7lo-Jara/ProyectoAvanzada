package dodorobackend.spring.modelentity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="Dodoro")
//@JsonIgnoreProperties({"hibernateLazyInitializer", "Handler"})
public class Dodoro {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column
	private String articulo;
	private String castigado;
	private String reaccion_de_dodoro;
	
	public Dodoro () {
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getArticulo() {
		return articulo;
	}
	public void setArticulo(String articulo) {
		this.articulo = articulo;
	}
	public String getCastigado() {
		return castigado;
	}
	public void setCastigado(String castigado) {
		this.castigado = castigado;
	}
	public String getReaccion_de_dodoro() {
		return reaccion_de_dodoro;
	}
	public void setReaccion_de_dodoro(String reaccion_de_dodoro) {
		this.reaccion_de_dodoro = reaccion_de_dodoro;
	}

}

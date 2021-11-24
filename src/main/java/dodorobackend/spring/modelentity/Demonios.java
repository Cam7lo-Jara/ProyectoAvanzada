package dodorobackend.spring.modelentity;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;
	import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

	@Entity
	@Table(name="Demonios")
	//@JsonIgnoreProperties({"hibernateLazyInitializer", "Handler"})
	public class Demonios {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer id;
		@Column
		private String partescuerpo;
		private String nombre_demonio;
		private String lugar_demonio;
		
		public Demonios () {
		}
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getPartescuerpo() {
			return partescuerpo;
		}
		public void setPartescuerpo(String partescuerpo) {
			this.partescuerpo = partescuerpo;
		}
		public String getNombre_demonio() {
			return nombre_demonio;
		}
		public void setNombre_demonio(String nombre_demonio) {
			this.nombre_demonio = nombre_demonio;
		}
		public String getLugar_demonio() {
			return lugar_demonio;
		}
		public void setLugar_demonio(String lugar_demonio) {
			this.lugar_demonio = lugar_demonio;
		}
		//@Override
		//public String toString() {
			//return "Lugar_encuentro [id=" + id + ", partescuerpo=" + partescuerpo + ", nombre_demonio=" + nombre_demonio + ", lugar_demonio="
				//	+ lugar_demonio + "]";
	//	}
}

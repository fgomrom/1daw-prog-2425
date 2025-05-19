package programacion.ut8.ejercicios.ejercicio1;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Embedded;

public class EventoMusical implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String nombre;
	private LocalDate fecha;
	private Date fecha2;
	private BigDecimal recaudacion;
	
	private Genero genero;
	
	@Embedded
	private List<Artista> artistasConfirmados;
	
	public EventoMusical() {
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public Date getFecha2() {
		return fecha2;
	}
	public void setFecha2(Date fecha2) {
		this.fecha2 = fecha2;
	}
	public BigDecimal getRecaudacion() {
		return recaudacion;
	}
	public void setRecaudacion(BigDecimal recaudacion) {
		this.recaudacion = recaudacion;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	
}

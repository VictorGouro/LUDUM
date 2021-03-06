package pe.edu.upc.entities;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Emparejamiento")
public class Emparejamiento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigoEmparejamiento;
	
	@ManyToOne
	@JoinColumn(name = "codigoUsuario", nullable = false)
	private Usuario usuario;
	
	@ManyToOne
	@JoinColumn(name = "codigoPartida", nullable = false)
	private Partida partida;

	public Emparejamiento() 
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public Emparejamiento(int codigoEmparejamiento, Usuario usuario, Partida partida) {
		super();
		this.codigoEmparejamiento = codigoEmparejamiento;
		this.usuario = usuario;
		this.partida = partida;
	}

	public int getCodigoEmparejamiento() {
		return codigoEmparejamiento;
	}

	public void setCodigoEmparejamiento(int codigoEmparejamiento) {
		this.codigoEmparejamiento = codigoEmparejamiento;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Partida getPartida() {
		return partida;
	}

	public void setPartida(Partida partida) {
		this.partida = partida;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigoEmparejamiento, partida, usuario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emparejamiento other = (Emparejamiento) obj;
		return codigoEmparejamiento == other.codigoEmparejamiento && Objects.equals(partida, other.partida)
				&& Objects.equals(usuario, other.usuario);
	}

}

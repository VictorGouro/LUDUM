package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entities.Subscripcion;

public interface ISubscripcionService {
	
	public void insert(Subscripcion s);
	public List<Subscripcion> list();
	
	public void Eliminar(int codigoSubscripcion);
	public List<Subscripcion> finBySubscripcion(Subscripcion subscrip);
	public void modificar (Subscripcion subscrip);

}

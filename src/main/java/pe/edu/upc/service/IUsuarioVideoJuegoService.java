package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entities.UsuarioVideoJuego;

public interface IUsuarioVideoJuegoService 
{
	public void insert (UsuarioVideoJuego uve);
	public List<UsuarioVideoJuego> list();
	public void eliminar (int codigoUsuarioVideojuego);
	public void modificar (UsuarioVideoJuego ec);
	
}

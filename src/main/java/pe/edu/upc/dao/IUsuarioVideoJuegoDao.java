package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entities.UsuarioVideoJuego;

public interface IUsuarioVideoJuegoDao
{
	public void insert(UsuarioVideoJuego uvj);
	public List<UsuarioVideoJuego> list();

}
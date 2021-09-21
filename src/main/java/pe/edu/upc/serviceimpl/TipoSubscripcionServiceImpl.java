package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.ITipoSubscripcionDao;
import pe.edu.upc.entities.TipoSubscripcion;
import pe.edu.upc.service.ITipoSubscripcionService;

@Named
@RequestScoped

public class TipoSubscripcionServiceImpl implements ITipoSubscripcionService
{
	@Inject
	private ITipoSubscripcionDao tsubDao;
	@Override
	public void insert(TipoSubscripcion tsub)
	{
		tsubDao.insert(tsub);
	}
	@Override
	public List<TipoSubscripcion> list()
	{
		return tsubDao.list();
	}
}

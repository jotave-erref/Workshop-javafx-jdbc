package model.entities;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;

public class DepartmentService {	
	
	private DepartmentDao dao = DaoFactory.createDepartmentDao();
	
	//Busca os departamentos no banco de dados
	public List<Department> finAll(){
		return dao.findAll();
	}
	
	public void SaveOrUpdate(Department obj) {
		if(obj.getId() == null) {
			dao.insert(obj);
		}else {
			dao.update(obj);
		}
	}
}


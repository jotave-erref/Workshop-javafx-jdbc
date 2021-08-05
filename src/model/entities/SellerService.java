package model.entities;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;

public class SellerService {	
	
	private SellerDao dao = DaoFactory.createSellerDao();
	
	//Busca os departamentos no banco de dados
	public List<Seller> finAll(){
		return dao.findAll();
	}
	
	public void SaveOrUpdate(Seller obj) {
		if(obj.getId() == null) {
			dao.insert(obj);
		}else {
			dao.update(obj);
		}
	}
	public void remove(Seller obj) {
		dao.deleteById(obj.getId());
	}
}


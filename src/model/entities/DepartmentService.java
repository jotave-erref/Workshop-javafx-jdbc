package model.entities;

import java.util.ArrayList;
import java.util.List;

public class DepartmentService {	
	public List<Department> finAll() {
		List<Department> list = new ArrayList<>();
		list.add(new Department(1, "Books"));
		list.add(new Department(2, "Computers"));
		list.add(new Department(3, "Sports"));
		
		return list;
	}
}

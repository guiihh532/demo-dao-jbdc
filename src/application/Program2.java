package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println(" ==== TEST 1: INSERT ");
		Department newDepartment = new Department(null, "Music");
		departmentDao.insert(newDepartment);
		System.out.println("INSERTED! NEW ID: " + newDepartment.getId());
		
		
		System.out.println("\n=== TEST 2: department findyById ======");
		Department deparment = departmentDao.findById(4);
		System.out.println(deparment);
		
		System.out.println("\n=== TEST 5: department UPDATE ======");
		Department department = deparmentDao

	}
	

	

}

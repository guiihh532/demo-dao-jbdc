package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println(" ==== TEST 1: INSERT ");
		Department newDepartment = new Department(null, "Music");
		departmentDao.insert(newDepartment);
		System.out.println("INSERTED! NEW ID: " + newDepartment.getId());
		
		System.out.println("\n=== TEST 2: department findyById ======");
		Department department = departmentDao.findById(4);
		System.out.println(department);
		
		System.out.println("\n=== TEST 3: department UPDATE ======");
		department = departmentDao.findById(7);
		department.setName("Cars");
		departmentDao.update(department);
		System.out.println("Update completed");

		System.out.println("\n=== TESTE 4: department findALL ======");
		List<Department> list = departmentDao.findAll();
		for (Department obj : list) {
			System.out.println(obj);
		}		
		
		System.out.println("\n=== TEST 5: department DELETE ======");

		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed");
		
		sc.close();
	}

}

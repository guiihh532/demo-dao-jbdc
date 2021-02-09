package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		
		
		SellerDao sellerDao = DaoFactory.createSellerDao();//injeção de dependencia sem explicitar a implementação
		System.out.println("=== TEST 1: seller findyById ======");
		
		Seller seller = sellerDao.findById(8);
		
		System.out.println(seller);
		System.out.println("\n=== TEST 2: seller findyByDepartment ======");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj);
		}
		System.out.println("\n=== TEST 3: seller findALL ======");
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}
	}
}

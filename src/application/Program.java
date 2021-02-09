package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		
		
		SellerDao sellerDao = DaoFactory.createSellerDao();//inje��o de dependencia sem explicitar a implementa��o
		System.out.println("=== TEST 1: seller findyById ======");
		
		Seller seller = sellerDao.findById(8);
		
		System.out.println(seller);
		System.out.println("\n=== TEST 1: seller findyByDepartment ======");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj);
		}
	}
}

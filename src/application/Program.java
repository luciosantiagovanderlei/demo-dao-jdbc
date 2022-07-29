package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.Daofactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
			
		SellerDao sellerDao = Daofactory.createSellerdao();
		
		System.out.println(" ===== TEST 1: SELLER FIND BY ID ======");
		
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);
		
		System.out.println("\n ===== TEST 2: SELLER FIND BY DEPARTMENT ======");
		Department department = new Department(2,null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj);
			
		}	
		System.out.println("\n ===== TEST 3: SELLER FIND ALL ======");
		
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n ===== TEST 4: SELLER insert ======");
		Seller newseller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(newseller);
		System.out.println("Inserted New id = " + newseller.getId());
		
		System.out.println("\n ===== TEST 5: SELLER Update ======");
		seller = sellerDao.findById(1);
		seller.setName("Marta Whayne");
		sellerDao.update(seller);
		System.out.println("Update completed!");
		
		System.out.println("\n ===== TEST 6: SELLER Delete ======");
		
		System.out.println(" Enter id for delete: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Delete complete");
		sc.close();
	}
	

}

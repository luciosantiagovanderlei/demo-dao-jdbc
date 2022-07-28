package application;

import model.dao.Daofactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
				
			
		SellerDao sellerDao = Daofactory.createSellerdao();
		
		System.out.println("===== TEST 1: SELLER FIND BY ID ======");
		
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);

	}

}

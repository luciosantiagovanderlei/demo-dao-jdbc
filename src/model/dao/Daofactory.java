package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class Daofactory {
	
	public static SellerDao createSellerdao() {
		return new SellerDaoJDBC();
	}
}

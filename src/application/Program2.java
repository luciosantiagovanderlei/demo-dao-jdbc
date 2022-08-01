package application;

import java.util.List;
import java.util.Scanner;

import model.dao.Daofactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = Daofactory.createDepartmantDao();
		
		System.out.println("======Teste 1 Insert=====");
		
		Department newdepartment = new Department(0, "Brinquedos");
		departmentDao.insert(newdepartment);
		System.out.println("Inserted New id = " + newdepartment.getId());
		
		System.out.println("\n ===== TEST 2: Department FIND BY ID ======");
		
		Department dep = departmentDao.findById(3);
		
		System.out.println(dep);
		
		System.out.println("\n ===== TEST 3: Department Update ======");
		dep = departmentDao.findById(1);
		dep.setName("Moda");
		departmentDao.update(dep);
		System.out.println("Update completed!");
		
		System.out.println("\n ===== TEST 4: Department FIND ALL ======");
		
		List<Department> list = departmentDao.findAll();
		for (Department obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n ===== TEST 5: Department Delete ======");
		
		System.out.println(" Enter id for delete: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete complete");
		
		
    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}

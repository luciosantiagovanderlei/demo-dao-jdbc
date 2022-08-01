package application;

import java.util.Scanner;

import model.dao.Daofactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = Daofactory.createDepartmantDao();
		
		System.out.println("======Teste 1 Insert=====");
		
		Department newdepartment = new Department(0, "Brinquedos");
		departmentDao.insert(newdepartment);
		System.out.println("Inserted New id = " + newdepartment.getId());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}

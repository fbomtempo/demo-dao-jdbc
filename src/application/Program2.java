package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
				
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		/*Department department = new Department(null, "Human Resources");
		/epartmentDao.insert(department);
		System.out.println("Department inserted! Id = " + department.getId());*/
		
		/*Department department = new Department(7, null);
		department.setName("Human Resources");
		departmentDao.update(department);
		System.out.println("Update completed!");*/
		
		/*System.out.print("Enter id: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed!");*/
		
		/*System.out.print("Enter id: ");
		int id = sc.nextInt();
		Department department = departmentDao.findById(id);
		System.out.println(department);*/
		
		List<Department> list = new ArrayList<>();
		list = departmentDao.findAll();
		for (Department obj : list) {
			System.out.println(obj);
		}
		
		sc.close();
	}

}

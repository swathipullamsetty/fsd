package com.pace.emp.crud.main;
import java.util.Scanner;
import com.pace.emp.crud.bean.Employee;
import com.pace.emp.crud.dao.EmployeeCrud;
public class MainEmpCrud {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Employee kumar=new Employee(1234,"Prasanna Kumar",63254.23f);
        Employee prerana=new Employee(1235,"Prerana",96547.26f);
        Employee anirudh=new Employee(1236,"Anirudh",563214.21f);
        EmployeeCrud empCrud=new EmployeeCrud();
        
        //send emp objects to add employee method
        empCrud.addEmployee(anirudh);
        empCrud.addEmployee(prerana);
        empCrud.addEmployee(kumar);
        
        //display employees details
        System.out.println("Original emp list");
        empCrud.showEmpList();
        empCrud.deleteEmployee(1234);
        System.out.println("EmpList after deletion");
        empCrud.showEmpList();
	}

}

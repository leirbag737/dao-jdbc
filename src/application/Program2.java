package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.List;

public class Program2 {
    public static void main(String[] args) {
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        /*System.out.println("Test 1: department insert");
        Department newDepartment = new Department(null, "Water");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted! New id = " + newDepartment.getId());*/

        System.out.println("Test 2: department findById");

        Department department = departmentDao.findById(7);
        System.out.println(department);

        System.out.println("Test 3: department findAll");
        List<Department> list = departmentDao.findAll();
        for(Department obj : list){
            System.out.println(obj);
        }
    }
}

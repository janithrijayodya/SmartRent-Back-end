package edu.icet.service.Impl;

import edu.icet.dao.EmployeeDao;
import edu.icet.entity.EmployeeEntity;
import edu.icet.model.Customer;
import edu.icet.model.Employee;
import edu.icet.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    final EmployeeDao employeeDao;
    final ModelMapper mapper;

    @Override
    public void addEmployee(Employee employee) {
        employeeDao.save(mapper.map(employee, EmployeeEntity.class));
    }

    @Override
    public void deleteEmployeeByID(Long employeeID) {
        employeeDao.deleteById(employeeID);
    }

    @Override
    public Employee searchEmployeeByID(Long employeeID) {
       return mapper.map(employeeDao.findById(employeeID) , Employee.class);
    }

    @Override
    public void updateEmployee(Employee employee) {
        employeeDao.save(mapper.map(employee,EmployeeEntity.class));
    }

    @Override
    public List<Employee> getAllEmployees() {
        List<Employee> employeeArrayList = new ArrayList<>();
        employeeDao.findAll().forEach(employeeEntity -> {
            employeeArrayList.add(mapper.map(employeeEntity, Employee.class));
        });
        return employeeArrayList;
    }

    @Override
    public Employee searchEmployeeByNIC(String nic) {
        return mapper.map(employeeDao.findBynic(nic) , Employee.class);
    }
}

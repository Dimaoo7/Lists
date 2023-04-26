package pro.sky.lists.employeeService;

import org.springframework.stereotype.Service;
import pro.sky.lists.Employee;
import pro.sky.lists.exeptions.EmployeeAlreadyAddedException;
import pro.sky.lists.exeptions.EmployeeNotFoundException;
import pro.sky.lists.exeptions.EmployeeStorageIsFullException;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    private final List<Employee> employeeList = new ArrayList<>();

    public void add(Employee employee) {
        if(employeeList.size() > 10){
            throw new EmployeeStorageIsFullException();
        }
        for (Employee em: employeeList) {
            if(em.equals(employee)){
                throw new EmployeeAlreadyAddedException();
            }
        }
        employeeList.add(employee);

    }

    public void delete(Employee employee) {

        for (Employee em: employeeList) {
            if(em.equals(employee)){
                employeeList.remove(employee);
                return;
            }else throw new IllegalArgumentException("Не могу удалить сотрудника который не существует");
        }
    }


    public Employee find(Employee employee) {
        for (Employee el : employeeList) {
            if (el.equals(employee)) {
                return el;
            }
        }
        throw new EmployeeNotFoundException();
    }


    public List<Employee> getEmployees() {
        return employeeList;
    }
}



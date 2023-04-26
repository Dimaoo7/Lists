package pro.sky.lists.exeptions;

public class EmployeeNotFoundException extends RuntimeException {

    public EmployeeNotFoundException() {
        super("Сотрудник не найден");
    }



}

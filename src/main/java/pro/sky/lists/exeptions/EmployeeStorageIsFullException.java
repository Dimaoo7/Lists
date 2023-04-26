package pro.sky.lists.exeptions;

public class EmployeeStorageIsFullException extends RuntimeException {

    public EmployeeStorageIsFullException() {
        super("Коллекция сотрудников переполнена");
    }
}

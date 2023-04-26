package pro.sky.lists.exeptions;

public class EmployeeAlreadyAddedException extends RuntimeException {

    public EmployeeAlreadyAddedException() {
        super("Сотрудник уже добавлен");
    }
}

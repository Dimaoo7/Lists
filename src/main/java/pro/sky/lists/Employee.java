package pro.sky.lists;

import java.util.List;

public class Employee {
    private final String surname;
    private final String name;

    public Employee(String surname, String name) {
        this.surname = surname;
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Сотрудник: \n" +
                "Фамилия: " + surname + "\n" +
                "Имя: " + name + "\n";
    }

}
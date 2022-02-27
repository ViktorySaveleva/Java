/**
 * Java 1. Homework 5
 * @author Viktoriia Saveleva
 * @version 27.2.2022
 */

public class Homework5 {
    public static void main(String[] args) {

        Person[] persArr = new Person[5];
        persArr[0] = new Person("Иванов Иван Иванович", "Директор", "email@email.com", "+79998889900", 45000, 45);
        persArr[1] = new Person("Петров Петр Петрович", "Заместитель директора", "email1@email.com", "+79998889901", 43000, 41);
        persArr[2] = new Person("Сергеев Сергей Сергеевич", "Менеджер", "email2@email.com", "+79998889902", 40000, 39);
        persArr[3] = new Person("Марьина Мария Викторовна", "Менеджер", "email3@email.com", "+79998889903", 39000, 35);
        persArr[4] = new Person("Соловьева Мария Викторовна", "Менеджер", "email4@email.com", "+79998889904", 39000, 42);

        for (int i = 0; i < persArr.length; i++) {
            if (persArr[i].getAge() > 40) {
                System.out.println(persArr[i]);
            }
        }
    }
}

class Person {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    Person(String fullName, String position, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "ФИО сотрудника: " + fullName + ", " + "Должность: " + position + ", " + "Email: " + email + ", " + "Телефон: " + phone + ", " + "Зарплата: " + salary + ", " + "Возраст: " + age;
    }
}

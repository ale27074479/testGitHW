package Lesson5;

public class Person {
    private static final int CURRENT_YEAR = 2021;

    private String surname;
    private String secondName;
    private String name;
    private String position;
    private String phone;
    private int salary;
    private int birthYear;

//2
public Person(String name,
            String secondName,
            String surname,
            String phone,
            String position,
            int salary,
            int birthYear) {
       this.birthYear = birthYear;
       this.name = name;
       this.surname = surname;
       this.secondName = secondName;
       this.position = position;
       this.phone = phone;
       this.salary = salary;
    }
    //3
    int getAge() {
        return CURRENT_YEAR - birthYear;
    }
    int getSalary() {
        return salary;
    }

    String getSecondName() {
        return secondName;
    }

    String getName() {
        return name;
    }

    String getSurname() {
        return surname;
    }

    String getPosition() {
        return position;
    }

    String getPhone() {
        return phone;
    }

    String getFullInfo() {
        return this.name + " " +
                this.secondName + " " +
                this.surname + ", " +
                this.position + ". Phone number: " +
                this.phone + ". Salary is " +
                this.getSalary() + " ru";
    }

}
package Lesson5;

public class Homework5 {
    public static void main(String[] args) {

        Person mainEmployee = new Person("Александра", "Дмитриевна",
                "Чернышова", "8(985)7241964",
                "software tester", 100000, 1994);

        Person[] office = {
                mainEmployee,
                new Person("Юлия", "Васильевнач",
                        "Потапова", "8(999)757-00-98",
                        "Chief Technology Officer", 100000, 1989),
                new Person("Савелий", "Игоревич",
                        "Тушкарев", "8(980)780-98-77",
                        "Senior Engineer", 30000, 1975),
                new Person("Вероника", "Вячеславовна",
                        "Лазарева", "8(777)693-97-00",
                        "infrastructure Architect", 120000, 1981),
                new Person("Надежда", "Быкова",
                        "Олеговна", "8(999)999-78-66",
                        "imposer", 45500, 1976),
                new Person("Семен", "Слепаков",
                        "Викторович", "8(999)999-78-66",
                        "Network Administrator", 125000, 1999)
        };

        getAllPersonsInOffice(office);
        System.out.println("@@@@@@@@@@@@@@@@@");
        getOldPerson(office, 40);

    }

    private static void getOldPerson(Person[] office, int year) {
        for (int i = 0; i < office.length; i++)
            if (office[i].getAge() > year) {
                System.out.println(office[i].getFullInfo());
            }
    }


    private static void getAllPersonsInOffice(Person[] office) {
        System.out.println("All person: ");
        for (int i = 0; i < office.length; i++)
            System.out.println((i + 1) + " " + office[i].getFullInfo());
    }
}



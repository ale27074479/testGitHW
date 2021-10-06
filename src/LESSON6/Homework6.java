package LESSON6;

public class Homework6 {
    public static void main(String[] args) {

    String tempWinEvent = " Все случилось";
    String tempLossEvent = " Не случилось";
    String eventName;
    String eventResult;

    Cat cat1 = new Cat("Тучка", 2, 200, 1);
    Cat cat2 = new Cat("Киара", 5, 400, 2);
    Dog dog1 = new Dog("Лола", 0.5f, 500, 10);
    Dog dog2 = new Dog("Лео", 1.5f, 350, 5);

    Animals[] animals = {cat1, cat2, dog1, dog2};

    float runLength = 250;
    float swimLength = 8;

    for (int i = 0; i < animals.length; i++) {
        String nameString = animals[i].getType() + " " + animals[i].getName() + " может ";


        eventName = "пробежать на " + animals[i].getMaxRun() + " метров пытается пробежать на ";
        eventResult = animals[i].run(runLength) ? tempWinEvent : tempLossEvent;
        result(nameString, eventName, runLength, eventResult);

        int swimResult = animals[i].swim(swimLength);
        eventName = "проплыть на " + Аnimals[i].getMaxSwim() + " метров попытка проплыть на ";
        eventResult = (swimResult == Animals.SWIM_OK) ? tempWinEvent : tempLossEvent;

        if (swimResult == Animals.SWIM_NONE)
            eventResult = " Не случилось, так как не умеет плавать";
        result(nameString, eventName, swimLength, eventResult);
    }

    System.out.println("All animals = " + Animals.countAnimal + " > cat count = " + Cat.countCat + " > dog count = " + Dog.countDog);
}

    private static void result(String nameAnimal, String event, float eventLength, String resultEvent) {
        System.out.println(nameAnimal + event + eventLength + " м и" + resultEvent);
    }
}
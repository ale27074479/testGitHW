package JavaLesson1HomeWork;

import JavaLeson1.Animal;

public class Track implements Let {
    private int length;

    public Track(int length) {
        this.length = length;
    }

    @Override
    public boolean doIt(Animal animal) {
        return animal.run(length);
    }

    public int getLength() {
        return length;
    }
}
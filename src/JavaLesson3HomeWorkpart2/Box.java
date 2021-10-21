package JavaLesson3HomeWorkpart2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Box<R extends Fruit> {

    private ArrayList<R> list;

    public Box() {
        this.list = new ArrayList<>();
    }

    @SafeVarargs
    public Box(R... fruits) {
        this.list = new ArrayList<>(Arrays.asList(fruits));
    }

    public float getWeight() {
        float weight = 0.0f;

        for (R o : list) {
            weight += o.getWeight();
        }

        return weight;
    }

    public void pour(Box<R> another) {
        another.list.addAll(list);
        list.clear();
    }

    public void add(R fruit) {
        list.add(fruit);
    }

    public void add(Collection<R> fruit) {
        list.addAll(fruit);
    }

    public boolean compare(Box<?> o) {

      return Math.abs(this.getWeight() - o.getWeight()) < 0.001;
    }
}
package x5all.x5.six.Sort;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private ArrayList<T> items;

    private List<T> fruitList;

    public float getWeight() {
        if (items.size() == 0) return 0;
        float weigth = 0;
        for (T items : items) weigth += items.getWeight();
        return weigth;
    }

    public boolean compare(Box box) {
        return this.getWeight() == box.getWeight();
    }

    public void transfer(Box<? super T> box) {
        box.items.addAll(this.items);

    }
}

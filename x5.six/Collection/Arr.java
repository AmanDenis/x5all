package x5all.x5.six.Collection;

import java.util.ArrayList;

public class Arr {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("55");
        arrayList.remove(1);
        arrayList.remove("2");
        System.out.println(arrayList.size());
        System.out.println(arrayList.get(1));
        arrayList.clear();

    }

}

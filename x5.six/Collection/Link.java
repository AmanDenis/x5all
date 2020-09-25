package x5all.x5.six.Collection;

import java.util.LinkedList;

public class Link {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("Adam");
        list.add("Eva");
        list.add("Carl");
        System.out.println(list.size());
        list.removeLast();
        System.out.println(list.get(1));
        list.clear();

    }

}


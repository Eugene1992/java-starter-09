package encapsulation;

import encapsulation.cat_pachage.Cat;

/**
 * Created by Student on 7/22/2016.
 */
public class OuterClass {
    public static void main(String[] args) {
        Cat cat = new Cat();

        System.out.println(cat.publicField);

    }
}

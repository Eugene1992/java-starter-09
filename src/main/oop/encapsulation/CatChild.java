package encapsulation;

import encapsulation.cat_pachage.Cat;

public class CatChild extends Cat {
    public static void main(String[] args) {
        Cat cat = new Cat();
        //CatChild catChild = new CatChild();
        //int privateField = cat.privateField;
        //int packageField = cat.packageField;
        //int protectedField = catChild.protectedField;
        //int publicField = cat.publicField;

        cat = null;

        // cat.nonStaticMakeVoice(); // 1

        // cat.staticMakeVoice(); // 2

    }
}

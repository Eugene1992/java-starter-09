import encapsulation.cat_pachage.Cat;
import encapsulation.cat_pachage.Human;

/**
 * Created by Student on 7/22/2016.
 */
public class RefValue {
    public static void main(String[] args) {
        Human human = new Human("Eugene", 23);
        int k = 10;

        byValue(k);
        byReference(human);

        System.out.println(k);
        System.out.println(human.getAge());

    }

    static void byValue(int k){
        k = 20;
    }

    static void byReference(Human human){
        human.setAge(45);
    }
}

package HomeWorkComparable;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Animal animal1=new Animal("Dasha");
        Animal animal2=new Animal("Misha");
        Animal animal3=new Animal("Alex");
        Animal animal4=new Animal("Tolik");

        TreeSet<Animal>set=new TreeSet<>();
        set.add(animal1);
        set.add(animal2);
        set.add(animal3);
        set.add(animal4);

        for (Animal a:set){
            System.out.println(a);
        }
    }
}

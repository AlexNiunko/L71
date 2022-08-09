package HomeWorkComparable;

public class Animal implements Comparable<Animal>{
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Animal animal) {
        return this.name.charAt(0)-animal.name.charAt(0) ;
    }



}

package pl.mpas.advanced_programming.abstract_class;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void eat() {

    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void play() {

    }
}

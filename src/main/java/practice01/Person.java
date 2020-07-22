package practice01;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name="Tom";
        this.age=21;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public String introduce() {
        return "My name is Tom. I am 21 years old.";
    }
}

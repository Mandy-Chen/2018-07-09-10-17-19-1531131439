package practice04;

public class Student extends Person{
    private int klass;
    private String name;
    private int age;

    public Student(String name, int age, int klass) {
        super();
        this.klass = klass;
        this.name = name;
        this.age = age;
    }

    public int getKlass() {
        return klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }

    public String introduce() {
        return "I am a Student. I am at Class 2.";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }
}

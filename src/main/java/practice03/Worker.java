package practice03;

public class Worker extends Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Worker(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String introduce() {
        return "I am a Worker. I have a job.";
    }
}

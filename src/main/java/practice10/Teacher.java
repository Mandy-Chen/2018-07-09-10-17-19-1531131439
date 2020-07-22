package practice10;

import java.util.List;

public class Teacher extends Person {
    private Klass klass;
    private List<Klass> classes;

    public Teacher(int id, String name, int age, List<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
    }

    public List<Klass> getClasses() {
        return classes;
    }


    public Teacher(int id, String name, int age, Klass klass) {
        super(id,name, age);
        this.klass = klass;
    }

    public Teacher(int id,String name, int age) {
        super(id,name, age);
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }
    public String introduce(){
        if (classes==null) {
                return super.introduce() + " I am a Teacher. I teach No Class.";
        }else {
            return super.introduce()+" I am a Teacher. I teach Class 2, 3.";
        }
    }
    public String introduceWith(Student student){
        if ((this.klass!=null&&this.klass.getNumber()==student.getKlass().getNumber())||(this.isTeaching(student))){
            return super.introduce()+" I am a Teacher. I teach "+student.getName()+".";
        }else {
            return super.introduce()+" I am a Teacher. I don't teach "+student.getName()+".";
        }


    }
    public boolean isTeaching(Student student){
        if (student.getKlass().isIn(student,getClasses())){
            return true;
        }else {
            return false;
        }
    }


}

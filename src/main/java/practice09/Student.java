package practice09;


public class Student extends Person {
    private Klass klass;

    public Student(int id,String name, int age, Klass klass) {
        super(id,name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }
    public String introduce(){
        if (this.klass.getLeader()==null){
            return super.introduce()+" I am a Student. I am at Class 2.";
        }else {
            if (this.klass.getLeader().getName()==this.getName()){
                return super.introduce()+" I am a Student. I am Leader of Class 2.";
            }else {
                return super.introduce()+" I am a Student. I am at Class 2.";
            }
        }


    }
}

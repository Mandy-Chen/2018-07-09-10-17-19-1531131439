package practice11;


import java.util.ArrayList;
import java.util.List;

public class Klass {
    private int number;
    private Student leader;
    private List<JoinListener> joinListeners;

    public Klass() {
        this.joinListeners = new ArrayList<>();
    }

    public Student getLeader() {
        return leader;
    }

    public void setLeader(Student leader) {
        this.leader = leader;
    }

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }


    public String getDisplayName() {
        return "Class "+this.number;
    }
    public void assignLeader(Student student){
        if(student.getKlass().getNumber()==this.getNumber()){
            if(student!=null){
                this.leader=student;
            }
        }
        else {
            System.out.println("It is not one of us.");
        }
    }
    public void appendMember(Student student){

        this.joinListeners.forEach(joinListener -> {
            joinListener.update(student);
        });
    }
    public boolean isIn(Student student, List<Klass> linkedList){
        Boolean flag=false;
        for (int i = 0; i < linkedList.size(); i++) {
            if (linkedList.get(i).getNumber() ==student.getKlass().getNumber()){
                flag=true;
            }
        }
        return flag;
    }
//    public void registerListener(JoinListener joinListener){
//        this.joinListeners.add(joinListener);
//    }
}

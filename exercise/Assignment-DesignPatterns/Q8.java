//Implement proxy design for accessing Record of a
// student and allow the access only to Admin. 

class Stud{
    private String name;
    private int rollno;
    private long phone;

    public Stud(String name, int rollno, long phone){
        this.name = name;
        this.rollno = rollno;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }
}

interface Learnable{
    void learn();
}

class Subject implements Learnable{
    protected Stud stud;

    public Subject(Stud stud){
        this.stud = stud;
    }

    @Override
    public void learn(){
        System.out.println("the subject");
    }
}

class SubjectProxy extends Subject{
    public SubjectProxy(Stud stud){
        super(stud);
    }

    @Override
    public void learn(){
        System.out.println("Student can learn");
        super.learn();
    }
}

public class Q8 {
    public static void main(String args[]){
        Stud abc = new Stud("abc", 1, 99999L);
        Learnable school = new SubjectProxy(abc);
        school.learn();
    }
}


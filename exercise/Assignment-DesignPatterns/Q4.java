//Implement Builder pattern to create a student object
// with more than 6 fields.

class Student{
    private String name;
    private String address;
    private int rollno;
    private long phone;
    private String dob;
    private String gender;

    public Student(StudentBuilder studentBuilder){
        name = studentBuilder.getName();
        address = studentBuilder.getAddress();
        rollno = studentBuilder.getRollno();
        phone = studentBuilder.getPhone();
        dob = studentBuilder.getDob();
        gender = studentBuilder.getGender();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString(){
        return "Student(name : " + name +
                ", roll number : " + rollno +
                ", address : " + address +
                ", phone : " + phone +
                ", date of birth : " + dob +
                ", gender : " + gender + ")";
    }
}

class StudentBuilder{
    private String name;
    private String address;
    private int rollno;
    private long phone;
    private String dob;
    private String gender;

    public StudentBuilder(String name, int rollno){
        this.name = name;
        this.rollno = rollno;
    }

    public String getName(){
        return name;
    }

    public StudentBuilder setName(String name){
        this.name = name;
        return this;
    }

    public String getAddress(){
        return address;

    }
    public StudentBuilder havingAddress(String address){
        this.address = address;
        return this;
    }

    public int getRollno(){
        return rollno;
    }

    public StudentBuilder setRollno(int rollno){
        this.rollno = rollno;
        return this;
    }

    public long getPhone(){
        return phone;
    }

    public StudentBuilder withPhone(long phone){
        this.phone = phone;
        return this;
    }

    public String getDob(){
        return dob;
    }

    public StudentBuilder withDob(String dob){
        this.dob = dob;
        return this;
    }

    public String getGender(){
        return gender;
    }

    public StudentBuilder havingGender(String gender){
        this.gender = gender;
        return this;
    }

    public Student build(){
        return new Student(this);
    }
}

public class Q4 {
    public static void main(String arhs[]){
        Student student = new StudentBuilder("Gurvinder", 10)
                .havingAddress("Delhi")
                .havingGender("male")
                .withDob("5 August 1995")
                .withPhone(9999999999L)
                .build();
        System.out.println(student);
    }
}


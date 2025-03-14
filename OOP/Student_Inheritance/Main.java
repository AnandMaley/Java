import java.util.ArrayList;

class Person{
    int age;
    String name;
    Person(int age,String name){
        this.age = age;
        this.name = name;
    }
    public void displayDetails(){
        System.out.println("Name: "+name+"\nAge: "+age);
    } 
}

class Student extends Person{
    int studentid;
    ArrayList<String> course = new ArrayList<>();
    Student(int age,String name,int studentid){
        super(age, name);
        this.studentid = studentid;
    }
    public void addSubject(String c){
        course.add(c);
    }
    public void displayDetails(){
        super.displayDetails();
        System.out.println("ID: "+studentid);
        for (String c : course) {
            System.out.println(c);
        }
    }
}

class Teacher extends Person{
    int teacherid;
    ArrayList<String> subject = new ArrayList<>();
    Teacher(int age,String name,int teacherid){
        super(age, name);
        this.teacherid = teacherid;
    }
    public void addSubject(String s){
        subject.add(s);
    }
    public void displayDetails(){
        super.displayDetails();
        System.out.println("ID: "+teacherid);
        for (String c : subject) {
            System.out.println(c);
        }
    }
}

public class Main{
    public static void main(String[] args) {
        Student s = new Student(21,"Maley",1);
        Teacher t = new Teacher(21,"Dhanvi",1);
        s.addSubject("DBMS");
        s.addSubject("Java");
        s.displayDetails();
        System.err.println("/*-/*-/*-/*-/*-/*-/*-/*-/*-/*-");
        t.addSubject("Python");
        t.addSubject("ML");
        t.displayDetails();
    }    
}

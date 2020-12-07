package ProblemSolve.OOP;

public class Teacher {
    String name;
    int phone;

    Teacher(String n, int ph){
        name = n;
        phone = ph;
    }

    void myMethod2(){
        System.out.println("Name: "+name+"\nPhone: "+phone);
    }
}

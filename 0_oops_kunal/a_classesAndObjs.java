public class a_classesAndObjs {
    public static void main(String[] args) {
        Student stu1 = new Student();
        System.out.println(stu1.name);
    }
}


class Student {
    String name;
    float marks;
    int age;

    Student() {
        this("Sagar", 55.6f, 15);
    }

    Student(String n, float m, int a) {
        this.name = n;
        this.marks = m;
        this.age = a;
    }
}
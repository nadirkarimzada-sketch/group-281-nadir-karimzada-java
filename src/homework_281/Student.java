package homework_281;

public class Student {

    String name;
    int age;
    double averageGrade;

    Student(String name, int age, double averageGrade) {
        this.name = name;
        this.age = age;
        this.averageGrade = averageGrade;
    }

    void printInfo() {
        System.out.println(
                "Имя: " + name +
                ", Возраст: " + age +
                ", Средний балл: " + averageGrade
        );
    }

    public static void main(String[] args) {

        Student s1 = new Student("Анна", 19, 4.8);
        Student s2 = new Student("Иван", 20, 4.3);

        s1.printInfo();
        s2.printInfo();
    }

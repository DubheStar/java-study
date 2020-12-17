package cn.j0hn.StudentSort;

public class Student implements Comparable<Student> {
    private String name;
    private int age;
    private double score;

    @Override
    public String toString() {
        return name+"-"+age+"-"+score;
    }



    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

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

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public int compareTo(Student o) {
        if (this.age == o.age) {
            return (int) (o.score - this.score);
        }
        return this.age - o.age;
    }
}

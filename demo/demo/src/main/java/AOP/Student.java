package AOP;

public class Student {
    private String nameSurname;
    private int course;
    private double averageGrage;

    public Student(String nameSurname, int course, double averageGrage) {
        this.nameSurname = nameSurname;
        this.course = course;
        this.averageGrage = averageGrage;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAverageGrage() {
        return averageGrage;
    }

    public void setAverageGrage(double averageGrage) {
        this.averageGrage = averageGrage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nameSurname='" + nameSurname + '\'' +
                ", course=" + course +
                ", averageGrage=" + averageGrage +
                '}';
    }
}

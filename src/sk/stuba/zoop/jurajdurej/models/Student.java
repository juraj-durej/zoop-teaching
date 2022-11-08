package sk.stuba.zoop.jurajdurej.models;

public class Student {
    public static int studentCount = 0;
    private String name;
    private Integer age;

    public Student(){
        studentCount++;
    }

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
        studentCount++;
    }

    @Override
    public String toString() {
        return this.name+" " +this.age;
    }

    public int calculateSum(int a){
        return 1;
    }

    public int calculateSum(int a, int b){
        return 2;
    }

    public int calculateSum(double a){
        return 3;
    }

    public static int getStudentCount(){
        for (int i = 0; i < 99999999; i++){
            int loop = i;
        }
        return studentCount;
    }

    public int getStudentCountForInstance(){
        return studentCount;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
}

package sk.stuba.zoop.jurajdurej.models;

public class Student {

    private String name;
    private Integer age;

    public Student(){
    }

    /**
     * Returns an Image object that can then be painted on the screen.
     *
     * @param  age  an absolute URL giving the base location of the image
     * @param  name the location of the image, relative to the url argument
     * @return      there is no return
     *
     */
    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Student(Integer age) {
        this.age = age;
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

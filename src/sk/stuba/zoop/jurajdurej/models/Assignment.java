package sk.stuba.zoop.jurajdurej.models;


public class Assignment {

    public static void main(String[] args) {
        Number n1 = new Number();
        Number n2 = new Number();
        n1.value = 47;
        n2.value = 47;

        System.out.println("1: n1.value: " + n1.value +
                ", n2.value: " + n2.value);

        n1 = n2;

        System.out.println("2: n1.value: " + n1.value +
                ", n2.value: " + n2.value);

        n1.value = 27;

        System.out.println("3: n1.value: " + n1.value +
                ", n2.value: " + n2.value);

    }
}

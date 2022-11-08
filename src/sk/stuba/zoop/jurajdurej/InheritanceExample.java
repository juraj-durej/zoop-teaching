package sk.stuba.zoop.jurajdurej;

import java.util.ArrayList;
import java.util.List;

public class InheritanceExample {

    //https://www.edureka.co/blog/upcasting-and-downcasting-in-java/

    public abstract class Fruit {
        public float getTotalCalories(){
            return 0.69f;
        }
        public String getType(){
         return "fruit";
        }
    }

    public class Apple extends Fruit {
        public float getTotalCalories() {
            return 0.420f;
        }
        public String getType() {
            return "apple";
        }
    }

    public class TastyApple extends Apple {
        public float getTotalCalories() {
            return 0.69f;
        }
        public String getType() {
            return "tasty apple";
        }
    }

    public class Orange extends Fruit {
        public float getTotalCalories() {
            return 0.69f;
        }
        public String getType() {
            return "orange";
        }
    }






    public Fruit getFruit(String type){
        switch (type){
            case "apple":
                return new TastyApple();
            case "orange":
                return new Orange();
            default:
                return null;

        }
    }

    public void showExample(){
        Fruit fruit = new Apple();
        Apple apple = new Apple();



//        Apple castedApple = (Apple) fruit;





//
//        // we can have any kind of fruit in our fruitList
        ArrayList<Fruit> fruitList = new ArrayList<>(List.of(
                new Apple(),
                new Orange(),
                new TastyApple()
        ));




        for (Fruit anyFruit : fruitList){
            System.out.println(anyFruit.getType());
            System.out.println(anyFruit.getClass());
        }






//          doesnt work, because Fruit cannot be instantiated
//        Fruit fruit2 = new Fruit();
//        Apple notApple = (Apple) new Fruit();


//          Cannot cast, because those are 2 different spieces (in java world)
//        Apples like Oranges ?
//        Apple isItApple = new Orange();




        //        Upcasting = Child to Parent

        Apple parent = (Apple) new TastyApple();

//        Downcasting = Parent to Child

        TastyApple child = (TastyApple) new Apple();




        Fruit unknownFruit = getFruit("apple");

        if (unknownFruit instanceof Apple) {
            // the object can be casted and the code won't fail
            Apple tastyAppleCastedToApple = (Apple) unknownFruit;
            System.out.println(tastyAppleCastedToApple.getClass());
        }


        Fruit unknownFruit2 = getFruit("orange");
        if (unknownFruit2 instanceof Apple) {
            // the object cannot be casted to apple
            Apple tastyAppleCastedToApple = (Apple) unknownFruit2;
            System.out.println(tastyAppleCastedToApple.getClass());
        }
    }








}

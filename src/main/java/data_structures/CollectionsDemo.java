package data_structures;

import java.util.*;

public class CollectionsDemo {

    public static void main(String[] args) {
//        setDemo();
//        listDemo();
//        queueDemo();
        mapDemo();

    }

    public static void setDemo(){
        Set fruits = new HashSet();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("lemon");
        fruits.add("apple");

        var i = fruits.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

        System.out.println("contains lemon?" + fruits.contains("lemon"));


        Set moreFruit = Set.of("pear", "raisin", "cherry");

    }

    public static void listDemo(){
        List<String> fruits = new ArrayList();
        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("orange");

//        for(String fruit : fruits){
//            System.out.println(fruit);
//        }
        fruits.forEach(f -> System.out.println(f));
        fruits.forEach(System.out::println);


        fruits.forEach(f ->{
            f = "fruit: " + f;
            System.out.println(f);
        });

//        fruits.set(2, "toyota");
//        fruits.add("jaguar");
//        fruits.remove("toyota")  ;
//
//        System.out.println(fruits.indexOf("toyota"));
    }

    public static void queueDemo(){
        Queue fruits = new LinkedList();
        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("orange");
        fruits.add("mommy");
        fruits.add("kwame");
        fruits.add("lexus");

        var removed = fruits.remove();

        System.out.println(removed);
        System.out.println("head of queue" + fruits.peek());


    }

    public static void mapDemo(){
        Map<String, Integer> fruitCalories = new HashMap();

        fruitCalories.put("apple", 95);
        fruitCalories.put("lemon", 20);
        fruitCalories.put("banana", 105);
        fruitCalories.put("orange", 45);

        fruitCalories.remove("banana");

        fruitCalories.forEach((k, v) ->System.out.println(k + " : " + v));

//        for(Map.Entry calorieInfo : fruitCalories.entrySet()){
//            System.out.println(calorieInfo.getKey() + ": " + calorieInfo.getValue());
//        }


//        System.out.println(fruitCalories);
//        System.out.println(fruitCalories.containsKey("orange"));

    }



}

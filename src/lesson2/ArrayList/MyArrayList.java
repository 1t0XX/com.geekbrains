package lesson2.ArrayList;


import java.util.ArrayList;

public class MyArrayList{


    public static void main(String[] args) {
        ArrayList<Integer> myArrayList = new ArrayList<>();


        myArrayList.add(1);
        myArrayList.add(4);
        myArrayList.add(6);
        myArrayList.add(8);
        myArrayList.add(10);
        myArrayList.add(3);
        myArrayList.add(7);


        System.out.println(myArrayList);
        System.out.println(myArrayList.get(4));
        System.out.println(myArrayList.size());
        myArrayList.add(3,500);
        System.out.println(myArrayList.indexOf(10));
        myArrayList.set(1,600);
        myArrayList.remove(2);
        System.out.println(myArrayList);


    }

}

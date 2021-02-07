package lesson2.ArrayList;

import java.util.LinkedList;

public class MyLinkedList {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Odin");
        linkedList.add("Dva");
        linkedList.add("Tri");
        linkedList.add("Chetire");
        linkedList.add("Pyt");

        System.out.println(linkedList);
        linkedList.addFirst("Six");

        linkedList.addLast("Sem'");
        linkedList.remove("Tri");
        System.out.println(linkedList.indexOf("Chetire"));
        System.out.println(linkedList);
        linkedList.contains("Odin");
        System.out.println(linkedList.size());




    }
}

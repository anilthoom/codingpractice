package com.anilt.ds.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CreateLinkedListExample 
{
	public static void main(String[] args) 
	{
        // Creating a LinkedListTest
        LinkedList<String> friends = new LinkedList<String>();

        // Adding new elements to the end of the LinkedListTest using add() method.
        friends.add("Rajeev");
        friends.add("John");
        friends.add("David");
        friends.add("Chris");
        System.out.println(friends.getFirst());

        System.out.println("Initial LinkedListTest : " + friends);

        // Adding an element at the specified position in the LinkedListTest
        friends.add(3, "Lisa");
        System.out.println("After add(3, \"Lisa\") : " + friends);

        // Adding an element at the beginning of the LinkedListTest
        friends.addFirst("Steve");
        System.out.println("After addFirst(\"Steve\") : " + friends);

        // Adding an element at the end of the LinkedListTest (This method is equivalent to the add() method)
        friends.addLast("Jennifer");
        System.out.println("After addLast(\"Jennifer\") : " + friends);

        // Adding all the elements from an existing collection to the end of the LinkedListTest
        List<String> familyFriends = new ArrayList<>();
        familyFriends.add("Jesse");
        familyFriends.add("Walt");

        friends.addAll(familyFriends);
        System.out.println("After addAll(familyFriends) : " + friends);
    }
}

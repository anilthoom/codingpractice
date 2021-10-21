package com.anilt.ds.arrays;

public class ArrayTest 
{
	public static void main(String[] args) 
	{
		int intArr[] = new int[5];
		for(int i=0; i<5; i++)
		{
			intArr[i] = 1+(i*10);
		}
		for (int i : intArr) 
		{
			System.out.println(i);
		}
		int a[] = new int[]{2,3,4,5,6};
		for (int i : a) 
		{
			System.out.println(i);
		}
		
		Student[] studentArr = new Student[4];
		studentArr[0]= new Student(1, "Anil");
		studentArr[1]= new Student(2, "Kumar");
		studentArr[2]= new Student(3, "Thoom");
		studentArr[3]= new Student(4, "Rao");
		for (Student student : studentArr) 
		{
			System.out.println(student.roll_no + " - " + student.name );
		}
		
		int intArray[] = {1,2,3}; 
        
        int cloneArray[] = intArray.clone(); 
          
        // will print false as deep copy is created 
        // for one-dimensional array 
   /*     System.out.println(intArray);
        System.out.println(cloneArray);
        System.out.println(intArray == cloneArray); 
          */
        for (int i = 0; i < cloneArray.length; i++) { 
//            System.out.print(cloneArray[i]+" "); 
        } 
	}
}
class Student
{
	public int roll_no;
	public String name;
	Student(int roll_no, String name)
	{
		this.roll_no = roll_no;
		this.name = name;
	}
}
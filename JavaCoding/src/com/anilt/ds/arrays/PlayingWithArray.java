package com.anilt.ds.arrays;

public class PlayingWithArray {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Cars carArray[] = new Cars[4];
		carArray[0]= new Cars("Xcent");
		carArray[1]= new Cars("Polo");
		carArray[2]= new Cars("Jeep");
		for (Cars cars : carArray) {
			if(cars != null)
				System.out.println(cars.car);
		}
	}

}
class Cars
{
	public String car;
	Cars(String car)
	{
		this.car = car;
	}
}

package com.anilt.designpatterns;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonDPMain {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException 
	{
		System.out.println(SingletonDP.getInstance().hashCode());
		System.out.println(SingletonDP.getInstance().hashCode());
		SingletonDP sdp1 = SingletonDP.getInstance();
		SingletonDP sdp2 = null;
		Constructor[] cs = SingletonDP.class.getDeclaredConstructors();
		for (Constructor constructor : cs) {
			constructor.setAccessible(true);
			sdp2 = (SingletonDP) constructor.newInstance();
		}
		
		System.out.println(sdp1.hashCode());
		System.out.println(sdp2.hashCode());
	}

}

class SingletonDP
{
	private SingletonDP(){}
	private static SingletonDP sdpInstance;
	
	public static SingletonDP getInstance()
	{
		if(sdpInstance == null)
		{
			synchronized (SingletonDP.class) 
			{
				if(sdpInstance == null)
					sdpInstance = new SingletonDP();	
			}
		}
		return sdpInstance;
	}
}

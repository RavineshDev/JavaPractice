package logical;

import java.io.ObjectStreamException;

//Singleton design pattern can be broken by using multi-threading, Reflection, clone() method for a given instance 
//and de-serialization

public class MySingleton{
	
	private static MySingleton instance = null;
	
	// IllegalStateException is protecting from creating new instance in case of Reflection
	private MySingleton() throws IllegalStateException{
		throw new IllegalStateException("We can not create object through Reflection");
	}
	
	public static MySingleton getInstance() {
		if(instance == null) {
			//to protect multi-threaded case
			synchronized(MySingleton.class) {
				if(instance == null)
					instance = new MySingleton();
			}
		}
		return instance;
	}
	
	//clone() method is used to protect from Cloning of object/instance, here it will throw below exception in case of cloning.
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		throw new CloneNotSupportedException();
	}
	
	//readResolve() method to protect from creating new instance in case of de-serialization
	protected Object readResolve() throws ObjectStreamException{
		// TODO Auto-generated method stub
		return instance;
	}

}

//import java.Student;

/**
 * 
 */

/**
 * @author lanlan
 *
 */
public class Undergraduate extends Student {

	/**
	 * @param args
	 */
	String specially;
	public Undergraduate(String name,int age,String education,String specially){
	super(specially, age, specially);
	this.specially=specially;
	}
	public void show() 
	{
		super.show();
		System.out.println ("×¨Òµ£º"+specially);
	}
}

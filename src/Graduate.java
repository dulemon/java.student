//import java.Student;

/**
 * 
 */

/**
 * @author lanlan
 *
 */
public class Graduate extends Student {

	/**
	 * @param args
	
	 */
	String direction;
	public Graduate(String name,int age,String education,String direction){
	super(direction, age, direction);
	this.direction=direction;
	}
	public void show()
	{
		super.show();
		System.out.println ("研究方向："+direction);
	}
	
}

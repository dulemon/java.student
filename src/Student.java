/**
 * 
 */

/**
 * @author lanlan
 *
 */
public class Student {

	/**
	 * @param args
	 */
	String name;
	int age;
	String education;
	public Student(String name,int age,String education)
	{
		this.name=name;
		this.age=age;
		this.education=education;
	}
	public void show()
	{
		System.out.print("姓名："+name+"  年龄： "+age+" 学历："+education);
	}
}



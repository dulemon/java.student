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
		System.out.print("������"+name+"  ���䣺 "+age+" ѧ����"+education);
	}
}



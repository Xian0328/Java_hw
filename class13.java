class Circle
{
	double pi1=3.14;
	float pi2=3.14f;
	void area(double r)      //(a)
	{
		double area1=r*r*pi1;
		System.out.println(area1);
	}
	void area(float r)       //(b)
	{
		float area2=r*r*pi2;
		System.out.println(area2);
	}
	void area(int r)         //(c)
	{
		double area3=r*r*pi1;
		System.out.println(area3);
	}
}
public class class13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle radius=new Circle();       //(d)
		radius.area(2.2);
		radius.area(2.2f);
		radius.area(2);
		
	}

}

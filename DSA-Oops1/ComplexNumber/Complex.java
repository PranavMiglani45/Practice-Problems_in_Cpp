package ClassesAndObjects;

public class Complex {
	private int a;
	private int b;
 public Complex(int a,int b)
 {
	 this.a=a;
	 this.b=b;
 }
 public void plus(Complex c)
 {
	 this.a=this.a+c.a;
	 this.b=this.b+c.b;
 }
 public void multiply(Complex c)
 {
	 int x=this.a;
	 this.a=(this.a*c.a)-(this.b*c.b);
	 this.b=this.b*c.a+x*c.b;
 }
 public void print()
 {
	 System.out.println(a+"+"+b+"i");
 }
}

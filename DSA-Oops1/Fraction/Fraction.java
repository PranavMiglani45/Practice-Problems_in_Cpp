package classes_and_objects;

public class Fraction {
	private  int num;
    private  int den;
public Fraction(int num,int den){
    this.num=num;
    this.den=den;
    simply();
}
public  void setNumerator(int num)
{
    this.num=num;
    simply();
}
public  void setDenomenator(int den)
{
    this.den=den;
    simply();
}
public  int getNumerator()
{
    return num;
}
public  int getDenomenator()
{
    return den;
}
private void simply()
{
    int gcd=1;
    int smaller=Math.min(num,den);
    for(int i=1;i<=smaller;i++)
    {
        if(num%i==0&&den%i==0)
        {
            gcd=i;
        }
    }
    num=num/gcd;
    den=den/gcd;
}
public void print()
{
    if(den==1)
    {
        System.out.println(num);
    }
    else
    {
        System.out.println(num+"/"+den);
    }
}
public static Fraction add(Fraction f,Fraction f1)
{
	int newnum,newden;
	newnum=f.num*f1.den+f.den*f1.num;
	newden=f.den*f1.den;
	Fraction f2=new Fraction(newnum,newden);
	return f2;
}
public void add(Fraction f)
{
	this.num=this.num*f.den+this.den*f.num;
	this.den=this.den*f.den;
	simply();
}
}

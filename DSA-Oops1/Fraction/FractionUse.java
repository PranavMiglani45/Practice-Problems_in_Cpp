package classes_and_objects;

public class FractionUse {

	public static void main(String[] args) {
		 Fraction f1 = new Fraction(2,1);
         Fraction f2=  new Fraction (20,40);
		    f1.print();
		    f2.print();
		    f1.add(f2);
		    f1.print();
		    f2.add(f1);
		    f2.print();
    Fraction f3=  Fraction.add (f1,f2);
    f3.print();
	}

}

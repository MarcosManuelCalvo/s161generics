import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class S1613 {
/*Exercici 3. Modifica el punt anterior de manera que un dels arguments
 * de f() no sigui parametritzat.*/
	public static void main(String[] args) {
		GenericMethods ints = new GenericMethods(1,2,3);
		GenericMethods strings = new GenericMethods("hola","qTal","adew");
		Month mesc = new Month("gener");
		Month mesa = new Month("febrer");
		Month mesb = new Month("març");
		GenericMethods meses = new GenericMethods(mesc,mesb,mesa);
		System.out.println(ints.getA());
		System.out.println(ints.getB());
		System.out.println(ints.getC());
		System.out.println(strings.getA());
		System.out.println(strings.getB());
		System.out.println(strings.getC());
		
		meses.f("hola", "adios");
		
	}

}





public class S1614 {
/*Exercici 4. Modifica l'anterior apartat de manera que els arguments que rep f() sigui una llista d'arguments
 * de variable indefinida.*/
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
		
		meses.f("hola");/////////////////

		GenericMethods strings2 = new GenericMethods("hola","qTal","adew","lol");
		System.out.println(strings2.getA());
		System.out.println(strings2.getB());
		System.out.println(strings2.getC());
	}

}



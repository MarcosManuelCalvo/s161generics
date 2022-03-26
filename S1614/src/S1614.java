
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
		
	}

}

class GenericMethods<T>{
    private T a;
    private T b;
    private T c;
    
    
    
    GenericMethods(T a, T b, T c){;
    	this.a = a;
    	this.b = b;
    	this.c = c;
    }
    
    public void f(T... args){

		System.out.println("Holi");
    }
    
    public T getA(){
    	return this.a;
    }
    
    public T getB(){
    	return this.b;
    }
    
    public T getC(){
    	return this.c;
    }
}

class Month{
	private String name;
	
	Month(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}

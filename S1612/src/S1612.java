
public class S1612 {
/*Exercici 2. Crea una classe anomenada GenericMethods amb un mètode genèric anomenat f()
 * que accepti tres arguments de tipus genèric. Realitza al main() diferents crides  d'aquest
 * mètode amb diferents tipus de parametres. Comprova que es poden posar qualsevol tipus de variable.*/
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
    
    public void f(T a, T b, T c){
    	this.a = a;
    	this.b = b;
    	this.c = c;
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
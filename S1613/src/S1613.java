import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class S1613 {
/*Exercici 3. Modifica el punt anterior de manera que un dels arguments de f() no sigui parametritzat.*/
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
    
    public void f(T a, T b){
    	this.a = a;
    	this.b = b;
    	T otroObjetoJava = null;
		try	{   
			FileInputStream file = new FileInputStream("direccionDeUn.ser");
			ObjectInputStream in = new ObjectInputStream(file);
			otroObjetoJava = (T)in.readObject();
			in.close();
			file.close();
		}catch(IOException ex){
			System.out.println("IOException is caught");
		}
		catch(ClassNotFoundException ex){
			System.out.println("ClassNotFoundException is caught");
		}
    	this.c = otroObjetoJava;
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
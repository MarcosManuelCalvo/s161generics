import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

class GenericMethods<T>{
	private T a;
	private T b;
	private T c;



	GenericMethods(T a, T b, T c){;
	this.a = a;
	this.b = b;
	this.c = c;
	}

	public void f(T a, T b, T...t ){
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
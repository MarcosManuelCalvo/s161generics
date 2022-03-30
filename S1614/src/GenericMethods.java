


class GenericMethods<T>{
    private T a;
    private T b;
    private T c;
    
    
    
    GenericMethods(T a, T b, T c){;
    	this.a = a;
    	this.b = b;
    	this.c = c;
    }
 //   --------------------------------------------------------------------------------------------
    GenericMethods(T a, T b, T...args ){;
	this.a = a;
	this.b = b;
	this.c = args[0];
	T d = args[1];
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
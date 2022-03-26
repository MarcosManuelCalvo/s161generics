
public class S1611 {
/*Exercici 1. Crea una classe anomenada NoGenericMethods que emmagatzemi tres objectes del mateix tipus,
 * juntament amb els mètodes per a emmagatzemar i extreure aquests objectes i un constructor per a inicialitzar els tres.
 * Comprova que els arguments es poden posar en qualsevol posició en la crida al constructor.*/
	public static void main(String[] args) {
		
	}

}

class NoGenericMethods{
    private String myArray[];
    
    
    NoGenericMethods(){
    	myArray = new String[3];
    	for(int i = 0; i<3;i++)
    		myArray[i] = "";
    }
    
    NoGenericMethods(String i, String s, String c){
    	myArray = new String[3];
    	myArray[0] = i;
    	myArray[1] = s;
    	myArray[2] = c;
    }
    
    public void setNoGenericMethods(String i, String s, String c){
    	myArray[0] = i;
    	myArray[1] = s;
    	myArray[2] = c;
    }
    
    public String getNoGenericMethods1(){
    	return myArray[0];
    }
    
    public String getNoGenericMethods2(){
    	return myArray[1];
    }
    
    public String getNoGenericMethods3(){
    	return myArray[2];
    }
}

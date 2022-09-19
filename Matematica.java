
public abstract class Matematica {
	//Crie uma Classe Abstrata que disponha de um método para representar uma operação matemática
	
	//esse método deve ser denominado como calcula. 
	//Implemente uma classe para adição, subtração, multiplicação e divisão.
	
	//o. Suas classes devem implementar o 
	//método calcula e o mesmo deve poder trabalhar com dados tanto inteiros quanto reais
	
	
	private int numA;
	
	private int numB;
	
	//private int varSoma;
	
	

	public int getNumA() {
		return numA;
	}

	public void setNumA(int numA) {
		this.numA = numA;
	}

	public int getNumB() {
		return numB;
	}

	public void setNumB(int numB) {
		this.numB = numB;
	} 
	
	public abstract void calcula();

	//public int getVarSoma() {
		//return varSoma;
	//}

	//public void setVarSoma(int varSoma) {
		//this.varSoma = varSoma;
	//}
		
			
	
	
    
	
	
}

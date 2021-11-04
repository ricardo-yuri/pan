package junit.model;

public class Calculadora {

    private int resultado = 0;

    public double aumentar(int n1, int n2) {
        resultado = n1 + n2;
        return resultado;
    }

    public double diminuir(int n1, int n2){
        resultado = n1 - n2;
        return resultado;
    }

    public double multiplicar(int n1, int n2){
        resultado = n1 * n2;
        return resultado;
    }

    public double dividir(int n1, int n2){
        resultado = n1 / n2;
        return resultado;
    }

	public int getResultado() {
		return resultado;
	}

	public void setResultado(int resultado) {
		this.resultado = resultado;
	}
    
    
}

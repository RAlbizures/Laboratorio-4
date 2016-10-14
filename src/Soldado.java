
public class Soldado extends Militar{
	public double getSalario(){
		return super.getSalario()-10000;
	}
	public int getDiasVacaciones(){
		return super.getDiasVacaciones()-5;
	}
	public void recibeOrden(){
		System.out.println("Ordene mi General");
	}
}

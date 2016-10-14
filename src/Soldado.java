
public class Soldado extends Militar{
	public double getSalario(){
		return super.getSalario()-10000;
	}
	public int getDiasVacaciones(){
		return super.getDiasVacaciones()/2;
	}
	public void recibeOrden(){
		System.out.println("Ordene mi General");
	}
	public int getHoras(){
		return super.getHoras()*2;
	}
}

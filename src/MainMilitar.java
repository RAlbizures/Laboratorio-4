
public class MainMilitar {
	public static void main(String[] args){
		Militar mil = new Militar();
		Teniente ten = new Teniente();
		General gen = new General();
		Coronel cor = new Coronel();
		Soldado sol = new Soldado();
		System.out.println("Datos de soldado");
		System.out.println("Dias de vacaciones: "+sol.getDiasVacaciones());
		System.out.println("Horas de trabajo: "+sol.getHoras());
		System.out.println("Salario: "+sol.getSalario());
		sol.recibeOrden();
		System.out.println();
		
		System.out.println("Datos de coronel");
		cor.ejecutaOrdenManiobra();
		System.out.println("Salario:"+cor.getSalario());
		System.out.println();
		
		System.out.println("Datos de general");
		System.out.println("Dias de vacaciones:"+gen.getDiasVacaciones());
		System.out.println("Formulario de vacaciones:"+gen.getFormularioVacaciones());
		gen.planificaEstrategia();
		System.out.println();
		
		System.out.println("Datos de teniente");
		ten.tomaOrdenCoronel("Trotar");
		System.out.println();
		
		System.out.println("Datos de militar");
		System.out.println("Horas:"+mil.getHoras());
		System.out.println("Salario:"+mil.getSalario());
		System.out.println("Vacaciones"+mil.getDiasVacaciones());
		System.out.println("Formulario de vacaciones:"+mil.getFormularioVacaciones());
	}
	
	
	
	
}


public class EmpleadoBR {
	float salario;
	int tipoVendedor;
	/*El salario base sera 1000 euros si el empleado es de tipo vendedor, y 
	 * de 1500 euros si es de tipo encargado. A esta cantidad se le sumara una 
	 * prima de 100 euros si ventasMes es mayor o igual que 1000 euros, y de 200 euros si 
	 * fuese al menos de 1500 euros. Por ultimo, cada hora extra se pagara a 20 euros. 
	 * Si tipo es null, o ventasMes o horasExtra toman valores negativos el metodo lanzara 
	 * una excepcion de tipo BRException.*/
	public EmpleadoBR(int tipoVendedor){
		this.tipoVendedor=tipoVendedor;
		if(tipoVendedor==0) this.salario=1000; //vendedor
		else if(tipoVendedor==1) this.salario=1500; //encargado
	}
	public EmpleadoBR() {
		// TODO Auto-generated constructor stub
	}
	float calculaSalarioBruto(int tipo, double d,float horasExtra){
		float salarioBruto=0;
		if(tipoVendedor==0) salarioBruto=1000;
		else if(tipoVendedor==1) salarioBruto=1500;
		if(d> 1000 && d<1500) salarioBruto=salarioBruto+100;
		else if(d >1500) salarioBruto=salarioBruto+100;
		salarioBruto=salarioBruto+20*horasExtra;
		this.salario=salarioBruto;
		return salarioBruto;
		
	}
	/*Si el salario bruto es menor de 1000 euros, no se aplicara ninguna retencion. Para salarios 
	 * a partir de 1000 euros, y menores de 1500 euros se les aplicara un 16%, y a los salarios 
	 * a partir de 1500 euros se les aplicara un 18%. El m�todo nos devolvera 
	 * salarioBruto * (1-retencion), o BRExcepcion si el salario es menor que cero.*/
	double calculaSalarioNeto(double d){
		double salarioNeto=0;
		if(d>1000 && d<1500){
			salarioNeto=d*0.84f;
		}
		else if(d>1500){
			salarioNeto=d*0.82f;
		}
			return salarioNeto;
		}


	}
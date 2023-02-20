
public class TestFuncionario 
{
	public static void main(String[] args) 
	{
		Funcionario diego = new Funcionario();
		diego.setDocumento("Diego");
		diego.setDocumento("444556565");
		diego.setSalario(4000);
		
		
		System.out.println(diego.getSalario());
		System.out.println(diego.getBonificacion());
	}

}

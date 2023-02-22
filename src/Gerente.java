import javax.print.DocPrintJob;

public class Gerente 
{
    private String nombre;
    private String dococumento;
    private double salario;
    
    public void setDococumento(String dococumento) 
    {
        this.dococumento = dococumento;
    }
    
    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }
    
    public void setSalario(double salario) 
    {
        this.salario = salario;
    }

    public String getDococumento() 
    {
        return dococumento;
    }

    public String getNombre() 
    {
        return nombre;
    }
    public double getSalario() 
    {
        return salario;
    }

}

/**
 * @author Arturo De La Torre Lara
 * @version Examen 1
 */
public class Vehiculo
{
    private String placa;
    private int hora;
    
    public Vehiculo(String placas)
    {
        placa = placas;
    }
    
    public String dimePlacas()
    {
        return placa;
    }
    
    public void tuHoraEntrada(int entradaH)
    {
        hora = entradaH;
    }
    
    public int dimeHora()
    {
        return hora;
    }
}

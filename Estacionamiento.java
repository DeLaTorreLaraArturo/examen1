
public class Estacionamiento
{
    private Vehiculo[] carro;
    
    public Estacionamiento()
    {
        carro = new Vehiculo[150];
    }
    
    public int salidaDeCarro(String placasCarro, int horaSalida)
    {
      int cajon = this.buscaCarro(placasCarro);
      
      if(cajon == -1)
      {
          return 0;
      }
      int pago = 0;
     /*if(horaSalida > cajon[i].dimeHora)
      {
          
      }*/
      
      return pago;
    }
    
    public int buscaCarro(String placasCarro)
    {
        for(int i = 0; i < 150; i++)
        {
            if(carro[i].dimePlacas() == placasCarro)
            {
                return i;
            }
        }
        return -1;
    }
    
    public int buscaLugar()
    {
        for(int i = 0; i < 150; i++)
        {
            if(carro[i] == null)
            {
                return i;
            }
        }
        
        return -1;
    }
    
    public boolean estacionar(Vehiculo unVehiculo, int HoraEntrada)
    {
        int espacio = this.buscaLugar();
        
        
        if(espacio == -1)
        {
            return false;
        }
        
        carro[espacio] = unVehiculo;
       // carro[espacio].tuHoraEntrada(Horaentrada);
        return true;
    }
    
}

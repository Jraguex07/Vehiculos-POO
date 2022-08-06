
/***********************************************
* <Automovil>
* <Jeronimo raguex>
*
* <Programacion POO>
***********************************************/

package USPG;


public class Automovil 
{
    //atributo que define marca del autmovil
    String marca = null;
    //atributo que define el modelo de un carro
    int modelo =0;
    //atributo que define el tipo de combustible con un valor enumearado
    enum tipo_combustible {gasolina, diésel, gasnatural}
    tipo_combustible combustible;
    //atributo que define el motor autmovil
    double motor =0;
    //atributo que define tipo de carro con un valor enumerado
    enum tipoautomovil {cuidad,subcompacto, compacto, familiar,ejecutivo,SUV}   
    tipoautomovil tipo; 
    //atributo que define numero de puertas
    int numeropuertas=0;
    //atrbutoi que define el numero de asientos
    int numeroasientos=0;
    //atrbuto que define la velocidad maxima
    float velocidadmaxima = 0;
    //atributo que define color de carro con un valor enumerado
    enum Colorcarro{blanco, negro, rojo, naranja, amarillo, verde, azul, violeta}
    Colorcarro Color;
     //atributo que define la velocidad        
    float velocidadactual=0;

    public Automovil(String marca, int modelo, tipo_combustible combustible,double motor, tipoautomovil tipo, int numeropuertas, int numeroasientos , float velocidadmaxima, Colorcarro Color, float velocidadactual) 
    {     
        this.marca = marca;
        this.modelo = modelo;
        this.combustible = combustible;
        this.motor = motor;
        this.tipo = tipo;
        this.numeropuertas = numeropuertas;
        this.numeroasientos = numeroasientos;
        this.velocidadmaxima = velocidadmaxima;
        this.Color = Color;
        this.velocidadactual = velocidadactual;       
    }
    
    //*************************************************************************
   
    
    
    //getter and setter del constructor Automovil
    public String getMarca() 
    {
        return marca;
    }

    public void setMarca(String marca) 
    {
        this.marca = marca;
    }

    public int getModelo()
    {
        return modelo;
    }

    public void setModelo(int modelo)
    {
        this.modelo = modelo;
    }

    public tipo_combustible getCombustible()
    {
        return combustible;
    }

    public void setCombustible(tipo_combustible combustible)
    {
        this.combustible = combustible;
    }

    public double getMotor() 
    {
        return motor;
    }

    public void setMotor(double motor)
    {
        this.motor = motor;
    }

    public tipoautomovil getTipo() 
    {
        return tipo;
    }

    public void setTipo(tipoautomovil tipo) 
    {
        this.tipo = tipo;
    }

    public int getNumeropuertas()
    {
        return numeropuertas;
    }

    public void setNumeropuertas(int numeropuertas)
    {
        this.numeropuertas = numeropuertas;
    }

    public int getNumeroasientos() 
    {
        return numeroasientos;
    }

    public void setNumeroasientos(int numeroasientos)
    {
        this.numeroasientos = numeroasientos;
    }

    public float getVelocidadmaxima() 
    {
        return velocidadmaxima;
    }

    public void setVelocidadmaxima(float velocidadmaxima) 
    {
        this.velocidadmaxima = velocidadmaxima;
    }

    public Colorcarro getColor() 
    {
        return Color;
    }

    public void setColor(Colorcarro Color) 
    {
        this.Color = Color;
    }

    public float getVelocidadactual()
    {
        return velocidadactual;
    }

    public void setVelocidadactual(float velocidadactual)
    {
        this.velocidadactual = velocidadactual;
    }
    
    //*************************************************************************
    
    public  void acelerar(int incremento_velocidad)
    {
        
        if (velocidadactual+incremento_velocidad > this.velocidadmaxima ) 
        {
            System.out.println("Disminuya la velocidad");
        } else 
        {
            System.out.println(velocidadactual + "velocidad adecuada");
            velocidadactual=velocidadactual+incremento_velocidad;
        }

    }
    //*************************************************************************
    
    public void desacelerar(int decremento_velocidad)
    {
        
        if (velocidadactual-decremento_velocidad < 0)
        {
            System.out.println("No es posible desacelerar a una velocidad negativa");
            
        } else
        {
            velocidadactual=velocidadactual-decremento_velocidad;
        }    
    
    }
    
    public void frenar()
    {
        velocidadactual = 0;
    }
    //**********************************************************************
    
    public void tiempo_Estimado_Llegada(float distancia_recorrer)
    {
       
        float tiempo = (float) (distancia_recorrer/velocidadactual );
    
    }
    //*************************************************************************
    
    //Método que imprime en pantalla los datos del automovil
    
    public void imprimir() 
	{
		System.out.println("Nombre automovil = " + marca);
		System.out.println("Modelo automovil = " + modelo);
		System.out.println("Tipo combustible = " + combustible);
                System.out.println("EL motor es:" + motor);
                System.out.println("Tipo de automovil  = " + tipo);
		System.out.println("Numero puertas = " + numeropuertas);
		System.out.println("Numero de asientos = " + numeroasientos);
		System.out.println("velocidad maxima = " + velocidadmaxima);		
		System.out.println("Color automovil = " + Color);
                System.out.println("Velocidad actual = " + velocidadactual);
	}
    //*************************************************************************
  
    //Metodo main 
    
    public static void main(String[] args) 
    {       
        Automovil auto1 = new Automovil("toyota",2005,tipo_combustible.gasnatural,2.5,tipoautomovil.cuidad,4,5,120,Colorcarro.blanco,100);
	auto1.imprimir();
        System.out.println("---------------------------------------------");
        
        auto1.setVelocidadactual(100);
        System.out.println("Velocidad Actual = " + auto1.velocidadactual);
        auto1.acelerar(20);
        
        System.out.println("Velocidad Actual = " + auto1.velocidadactual);
        auto1.desacelerar(50);
        
        System.out.println("Velocidad Actual = " + auto1.velocidadactual);
        auto1.frenar();      
    }  
    
    //**************************************************************************
    
}

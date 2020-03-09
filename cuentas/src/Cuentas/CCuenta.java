package Cuentas;




public class CCuenta {


  
   private String nombre;
   private String cuenta;
   private double saldo;
   private double tipoInteres;

    
    public CCuenta ()
    {
    }
    
    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getTipoInteres() {
		return tipoInteres;
	}

	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}

	public CCuenta (String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        tipoInteres=tipo;
    }
   
    public void asignarNombre(String nom)
    {
        nombre=nom;
    }
    
    

    
     public double estado ()
    {
        return saldo;
    }

    /**
     * Recibe un parametro y te ingresa el dinero siempre que no sea una cantidad negativa
     * @param cantidad
     * @throws Exception
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0){
            throw new Exception("No se puede ingresar una cantidad negativa");}
        setSaldo(saldo + cantidad);
    }



    /**
     * Recibe un parametro y retira siempre que no sea una cantidad negativa
     * @param cantidad
     * @throws Exception
     */
    public void retirar (double cantidad) throws Exception
    {
        if (cantidad < 0){
            throw new Exception ("No se puede retirar una cantidad negativa");}
        if (estado()< cantidad){
            throw new Exception ("No se hay suficiente saldo");}
        setSaldo(saldo - cantidad);
    }
    
  /**
   * Recibe tres parametros y realiza operaciones de retirar e ingresar
   * @param miCuenta
   * @param cantidad
   * @param opcion
   * @exception Tiene dos excepciones, por si da error al ingresar o retirar
   * @throws Devuelve por pantalla el error
   */
    public static void operativa_cuenta(CCuenta miCuenta,float cantidad, int opcion){
        if(opcion==2){
            try 
            {
                miCuenta.retirar(cantidad);
            } catch (Exception e)
            {
                System.out.print("Fallo al retirar");
            }
        }else if(opcion==1){
            try
            {
                System.out.println("Ingreso en cuenta");
                miCuenta.ingresar(cantidad);
            } catch (Exception e)
            {
                System.out.print("Fallo al ingresar");
            }
        }
    }

  
  
}

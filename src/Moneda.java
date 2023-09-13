public class Moneda {
    private int valor; //0 si es cara 1 si es escudo
    private int contadorCara;
    private int contadorEscudo;
    public Moneda(){
       contadorCara= 0;
       contadorEscudo= 0;
    }

    public void hallarProbabilidad(int nroLanzamientos, int lado){ //lado = lado de la moneda
        System.out.println("\tNro Lanzamiento \t Resultado \t Frecuencia acumulada \t Probabilidad");
        System.out.println();
        for(int i = 0;i<nroLanzamientos;i++){
            double resultado = Math.random();
            
            if(resultado<0.5){
               valor = 0;
               contadorCara++;
            }else{
               valor = 1;
               contadorEscudo++;
            }
            if(lado==0){
        
                mostrar(i+1, contadorCara,valor);
            }else if(lado==1){
            
                mostrar(i+1, contadorEscudo,valor);
            }else{
                System.out.println("ESCOJA CORRECTAMENTE EL LADO DE LA MONEDA, RECUERDE QUE 0 ES PARA CARA Y 1 PARA ESCUDO");
                break;
            }
        }
           contadorEscudo = 0;
           contadorCara = 0;
    
    }
    
    private void mostrar(int nroLanzamiento, int contador, int valor){
    double porcentaje = ((double)contador/nroLanzamiento)*100;
    porcentaje= (double)Math.round(porcentaje*100.0)/100;
    System.out.println("\t\t"+ nroLanzamiento + "\t\t   "+ valor +"\t\t\t"+ contador +"\t\t      "+porcentaje+"%");
    System.out.println();
   }
   
   public static void main(String args[]){
       Moneda mon = new Moneda();
       mon.hallarProbabilidad(10,0);//probabilidad de hallar cara en 10 lanzamientos
       mon.hallarProbabilidad(30,0);//probabilidad de hallar cara en 30 lanzamientos
       mon.hallarProbabilidad(15,1);//probabilidad de hallar escudo en 15 lanzamientos
   }
}

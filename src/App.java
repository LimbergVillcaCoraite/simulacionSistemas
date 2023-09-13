public class App {
     private int[] contador;
    public App(){
        contador = new int[6];
    }

    public void hallarProbabilidad(int nroLanzamientos, int nro){
       System.out.println("\tNro Lanzamiento \t Resultado \t Frecuencia acumulada \t Probabilidad");
       System.out.println();
        for(int i = 0;i<nroLanzamientos;i++){
            int resultado = (int)(Math.random()*6+1);
            
            if(resultado==1){
               contador[0]++;
               mostrar(i+1,  contador[nro-1] ,resultado);
            }else if(resultado==2){
               contador[1]++;
               mostrar(i+1,  contador[nro-1] ,resultado);
            }else if(resultado==3){
               contador[2]++;
               mostrar(i+1,  contador[nro-1] ,resultado);
            }else if(resultado==4){
               contador[3]++;
               mostrar(i+1,  contador[nro-1] ,resultado);
            }else if(resultado==5){
               contador[4]++;
               mostrar(i+1,  contador[nro-1] ,resultado);
            }else if(resultado==6){
               contador[5]++;
               mostrar(i+1,  contador[nro-1] ,resultado); 
            }else{
                System.out.println("ESCOJA CORRECTAMENTE EL NRO DEL DADO, RECUERDE QUE ES UN DADO DE 6 CARAS");
                break;
            }
         }
         contador = new int[6];
        
    }
    
    private void mostrar(int nroLanzamiento, int contador, int valor){
    double porcentaje = ((double)contador/nroLanzamiento)*100;
    porcentaje= (double)Math.round(porcentaje*100.0)/100;
    System.out.println("\t\t"+ nroLanzamiento + "\t\t   "+ valor +"\t\t\t"+ contador +"\t\t      "+porcentaje+"%");
    System.out.println();
   }
   
   public static void main(String args[]){
       App dad = new App();
       /*dad.hallarProbabilidad(12,1);//probabilidad de hallar 1 en 12 lanzamientos
        dad.hallarProbabilidad(6,2);//probabilidad de hallar 2 en 6 lanzamientos
        dad.hallarProbabilidad(10,3);//probabilidad de hallar 3 en 10 lanzamientos
       */
       dad.hallarProbabilidad(20,4);//probabilidad de hallar 4 en 20 lanzamientos
       dad.hallarProbabilidad(30,5);//probabilidad de hallar 5 en 30 lanzamientos
       dad.hallarProbabilidad(15,6);//probabilidad de hallar 6 en 15 lanzamientos

    
    }
}

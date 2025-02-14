package mates;
public class Matematicas{

    public static double generarNumeroPiIterativo(long pasos){
        long puntos = 0;

        for(long i = 0; i< pasos; i ++){
            double x = Math.random(); //Genera una coordenada x aleatoria entre 0 y 1
            double y = Math.random(); //Genera una coordenada y aleatoria entre 0 y 1

            if(x*x + y*y <=1){ //Comprobamos que este dentro del círculo, si esta dentro aumenta el contador
                puntos++;
            }

        }


        return 4.0 * puntos / pasos; 
    }
}
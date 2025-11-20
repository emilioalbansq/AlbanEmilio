package aeBIOTECH2K25.aePKMutacion;

import java.util.Random;

import aeBIOTECH2K25.aePKArbolFilogenetico.aePKProterozoico.aeReptiles;

public class aeTanqueMutacion implements aeIIA {

    private boolean aeIA;

    public aeTanqueMutacion(){
        setAeIA(true);
    }


    @Override
    public boolean aeValidarMutacion(aeReptiles reptil) {
        return getAeIA();
    }

    @Override
    public void aeMutar(aeReptiles reptil) throws InterruptedException {
        if (aeValidarMutacion(reptil)){

            simularMituacionEnProceso();

            aeTortugasAlban tortugaAlban = new aeTortugasAlban(reptil.getAeNombre() + " T.Alban", reptil.getAeEdad(), reptil.getAePeso());
            tortugaAlban.aeDecirNombre();
            tortugaAlban.aeSaludar();

        } else {
            System.out.println("Mutación fallida");
        }
    }

    public void simularMituacionEnProceso() throws InterruptedException{

        Random random = new Random(); //Crea un objeto perteneciente al paquete estándar de Java

        int longitudBarra = 20;
        
        //Usando for:
        char[] barra = new char[longitudBarra];
        //Relleno de ' ' en el arreglo de Barra
        for(int i = 0; i < barra.length; i++){
            barra[i] = ' ';
        }

        double tamanio = random.nextInt(901) + 100;
        double proporcionDescarga = tamanio/ (double)longitudBarra;
        System.out.println("Mutacion en proceso: (" + tamanio + " mSv)");
        String barraString = new String(barra);
        //Sin aun descargar nada
        System.out.print("\r " + "\u001B[33m" + barraString + " \u001B[0m " + String.format("%.1f", 0.0) + " / " +  tamanio + " mSv");
        //Descarga de archivo
        
        for (int pos = 0; pos < longitudBarra; pos++){
            
            double descargando = (pos + 1) * proporcionDescarga;
            barra[pos] = '-';
            
            //Para mostrar el arreglo completo de barra, se lo convierte en string
        	barraString = new String(barra);
        	System.out.print("\r " + "\u001B[33m" + barraString + " \u001B[0m " + String.format("%.1f", descargando) + " / " +  tamanio + " mSv");
        	//El \u001B[33m cambia el texto a magenta hasta \u001B[0m, que es obligatorio para que el color no se propague al resto del texto, es decir, restablece el color al normal
        	//El String.format("%.1f", descargando) redondea el numero a una cifra decimal al mostrarse
        	Thread.sleep(150);
        }
        System.out.println(" ");
    }


    public boolean getAeIA() {
        return aeIA;
    }

    public void setAeIA(boolean aeIA) {
        this.aeIA = aeIA;
    }

    
}

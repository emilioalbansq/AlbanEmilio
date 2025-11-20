package aeBIOTECH2K25.aePKArbolFilogenetico.aePKProterozoico;

import aeBIOTECH2K25.aePKUsuario.aeBiologo;

public class aeTortugas extends aeReptiles implements aeIComportamientoTortuga{
    
    

    public aeTortugas(String aeNombre, int aeEdad, float aePeso) throws InterruptedException{
        super(aeNombre, aeEdad, aeEdad);

        char[] rotacion = {'|', '/', '-', '\\'};
        int pos = 0;

        for(int i = 0; i <= 100; i++){
            System.out.print("\r " + rotacion[pos] + i + " % " + "--------------------- Tortugas");
            Thread.sleep(50);
            
            if (pos == 3) pos = 0;
            else pos++;
        }
        System.out.println(" ");
    }

    @Override
    public void aeDecirNombre(){
        System.out.println(" !HOLA!, Soy un tortuga, me llamo : " + getAeNombre());
    }

    @Override
    public void aeSaludar() {
        System.out.println(getAeNombre() + " saluda a todos!");
    }

    @Override
    public void aeSaludar(aeBiologo biologo) {
        System.out.println(getAeNombre() + " saludando a " + biologo.getAeNombre());
    }

}

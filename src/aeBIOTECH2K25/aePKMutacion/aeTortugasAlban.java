package aeBIOTECH2K25.aePKMutacion;

import aeBIOTECH2K25.aePKArbolFilogenetico.aePKProterozoico.aeTortugas;

public class aeTortugasAlban extends aeTortugas{ 

    public aeTortugasAlban(String aeNombre, int aeEdad, float aePeso) throws InterruptedException{

        super(aeNombre, aeEdad, aePeso);

        char[] rotacion = {'|', '/', '-', '\\'};
        int pos = 0;

        for(int i = 0; i <= 100; i++){
            System.out.print("\r " + rotacion[pos] + i + " % " + "------------------------ TortugasAlban" );
            Thread.sleep(50);
            
            if (pos == 3) pos = 0;
            else pos++;
        }
        System.out.println(" ");

    }

}

package aeBIOTECH2K25.aePKArbolFilogenetico.aePKProterozoico;

import aeBIOTECH2K25.aePKArbolFilogenetico.aePKFanerozoico.aeAmniota;

public abstract class aeReptiles extends aeAmniota{

    private String aeNombre;
    private int aeEdad;
    private float aePeso;
    private boolean esMutable; //REFACTORIZACION
    

    public aeReptiles(String aeNombre, int aeEdad, float aePeso) throws InterruptedException{
        super();
        setAeNombre(aeNombre);
        setAeEdad(aeEdad);
        setAePeso(aePeso);
        setEsMutable(true);

        char[] rotacion = {'|', '/', '-', '\\'};
        int pos = 0;

        for(int i = 0; i <= 100; i++){
            System.out.print("\r " + rotacion[pos] + i + " % " +  "------------------ Reptiles");
            Thread.sleep(50);
            
            if (pos == 3) pos = 0;
            else pos++;
        }
        System.out.println(" ");
    }

    public void aeDecirNombre(){
        System.out.println(" !HOLA!, Soy un reptil, me llamo : " + getAeNombre());
    }


    public String getAeNombre() {
        return aeNombre;
    }

    public void setAeNombre(String aeNombre) {
        this.aeNombre = aeNombre;
    }

    public int getAeEdad() {
        return aeEdad;
    }

    public void setAeEdad(int aeEdad) {
        this.aeEdad = aeEdad;
    }

    public float getAePeso() {
        return aePeso;
    }

    public void setAePeso(float aePeso) {
        this.aePeso = aePeso;
    }

    public boolean getEsMutable() {
        return esMutable;
    }

    public void setEsMutable(boolean esMutable) {
        this.esMutable = esMutable;
    }
}

package aeBIOTECH2K25.aePKMutacion;

import aeBIOTECH2K25.aePKArbolFilogenetico.aePKProterozoico.aeReptiles;

public interface aeIIA {

    public boolean aeValidarMutacion(aeReptiles reptil); //REFACTORIZACION: Parametro al validar mutacion
    public void aeMutar(aeReptiles reptil) throws InterruptedException;

}

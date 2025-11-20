package aeBIOTECH2K25.aePKArbolFilogenetico.aePKFanerozoico;

public abstract class aeTetrapoda extends aeSarcopterygii{

    public aeTetrapoda() throws InterruptedException{
        super();

        char[] rotacion = {'|', '/', '-', '\\'};
        int pos = 0;

        for(int i = 0; i <= 100; i++){
            System.out.print("\r " + rotacion[pos] + i + " % " + "------------ Tetrapoda" );
            Thread.sleep(50);
            
            if (pos == 3) pos = 0;
            else pos++;
        }
        System.out.println(" ");
    }

}

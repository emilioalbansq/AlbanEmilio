package aeBIOTECH2K25;

import java.util.Scanner;

import aeBIOTECH2K25.aePKArbolFilogenetico.aePKProterozoico.aeTortugas;
import aeBIOTECH2K25.aePKMutacion.aeTanqueMutacion;
import aeBIOTECH2K25.aePKUsuario.aeBiologo;

public class aeController {

    public void inicializar() throws InterruptedException{
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println(" ----- BIOTECH-2K25 SYSTEM ----- ");
        System.out.println(" Ingrese su nombre  : ");
        String nombre = sc.nextLine();
        System.out.println(" Ingrese su apellido: ");
        String apellido = sc.nextLine();
        System.out.println(" Ingrese su edad    : ");
        int edad = Integer.parseInt(sc.nextLine());

        aeBiologo biologo1 = new aeBiologo (nombre, apellido, edad);

        System.out.println(" ------------------------------------------------ "); //Presentacion Arbol Filogenetico
        System.out.println(" ÁRBOL FILOGENÉTICO: ");

        aeTortugas tortuga1 = new aeTortugas("Edgar", 15,300.5f);
        
        System.out.println(" ------------------------------------------------ "); //Presentacion Tortuga
        System.out.println(" TORTUGA: ");
        tortuga1.aeDecirNombre();

        System.out.println(" ------------------------------------------------ "); //Saludo de la tortuga
        tortuga1.aeSaludar();
        tortuga1.aeSaludar(biologo1);

        System.out.println(" ------------------------------------------------ "); //Mutacion
        System.out.println(" MUTACION: ");
        aeTanqueMutacion tanqueMutacion = new aeTanqueMutacion();

        tanqueMutacion.aeValidarMutacion(tortuga1);
        tanqueMutacion.aeMutar(tortuga1);

        System.out.println(" ------------------------------------------------ "); 
        System.out.println(" -----------------------FIN---------------------- "); 
    }



}

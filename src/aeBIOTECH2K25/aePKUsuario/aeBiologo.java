package aeBIOTECH2K25.aePKUsuario;

public class aeBiologo {
    
    private String aeNombre;
    private String aeApellido;
    private int aeEdad;

    

    public aeBiologo(String aeNombre, String aeApellido, int aeEdad){

        setAeNombre(aeNombre);
        setAeApellido(aeApellido);
        setAeEdad(aeEdad);

    }
    

    public String getAeNombre() {
        return aeNombre;
    }

    public void setAeNombre(String aeNombre) {
        this.aeNombre = aeNombre;
    }

    public String getAeApellido() {
        return aeApellido;
    }

    public void setAeApellido(String aeApellido) {
        this.aeApellido = aeApellido;
    }

    public int getAeEdad() {
        return aeEdad;
    }

    public void setAeEdad(int aeEdad) {
        this.aeEdad = aeEdad;
    }
}

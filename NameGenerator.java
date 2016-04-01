/**
 * Write a description of class NameGenerator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NameGenerator
{
    private static final int LETRAS_INICIAL = 0;
    private static final int LETRAS_1 = 2;
    private static final int LETRAS_2 = 3;
    private String nombreCortado;
    private String primerApellidoCortado;
    private String segundoApellidoCortado;
    private String ciudadNacimientoCortada;

    /**
     * Método que genera un nombre a partir de los datos pasados por parámetro
     */
    public void generateStarWarsName(String primerApellido, String nombre, String segundoApellido, String ciudadNacimiento){
        primerApellidoCortado = primerApellido.substring(LETRAS_INICIAL,LETRAS_2);
        nombreCortado = nombre.substring(LETRAS_INICIAL,LETRAS_2);
        segundoApellidoCortado = segundoApellido.substring(LETRAS_INICIAL,LETRAS_1);
        ciudadNacimientoCortada = ciudadNacimiento.substring(LETRAS_INICIAL,LETRAS_2);
        System.out.println(primerApellidoCortado + nombreCortado + " " + segundoApellidoCortado + ciudadNacimientoCortada);
    }
}

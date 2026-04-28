/*
 * Generador de códigos consecutivos con prefijo.
 */
package objetosservicio;

//** @author Julian Daniel Ramirez Garcia

public class GeneradorCodigosConsecutivos extends GeneradorCodigos {
    
    /**
     * Valor actual del consecutivo utilizado para generar los códigos.
     */
    private int consecutivo = 0;
    
    /**
     * Constructor que inicializa el generador con un prefijo específico.
     *
     * @param prefijo Prefijo que tendrán los códigos generados.
     */
    public GeneradorCodigosConsecutivos(String prefijo) {
        super(prefijo);
    }
    
    /**
     * Verifica si un código cumple con el formato válido esperado:
     *     PREFIJO-N
     *     donde N es un número entero positivo.
     *
     * @param codigo Código a validar.
     * @return true si el código cumple con el formato; false en caso contrario.
     */
    @Override
    public boolean tieneFormatoValido(String codigo) {
        return codigo.matches(getPrefijo() + "-\\d+");
    }
    
    /**
     * Genera un nuevo código consecutivo.
     *
     * @return Código generado con el formato PREFIJO-N.
     */
    @Override
    public String generarCodigo() {
        return this.getPrefijo() + "-" + this.incrementarConsecutivo();
    }
    
    /**
     * Incrementa el valor del consecutivo y devuelve el nuevo valor.
     *
     * @return Valor consecutivo después del incremento.
     */
    private int incrementarConsecutivo() {
         return ++this.consecutivo;
    }
}

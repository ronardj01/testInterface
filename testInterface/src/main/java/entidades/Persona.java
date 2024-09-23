package entidades;

/**
 *
 * @author ronar
 */
public class Persona {

    //atributos
    private String nombre;
    private String DNI;
    private char sexo;
    private int edad;
    private float peso;
    private float altura;

    //Sexo por defecto
    public static char SEXO = 'H';

    //constructores
    public Persona() {
        this.nombre = "";
        this.sexo = Persona.SEXO;
        this.edad = 0;
        this.peso = 0;
        this.altura = 0;
    }

    public Persona(String nombre, char sexo, int edad) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.peso = 0;
        this.altura = 0;
    }

    public Persona(String nombre, String DNI, char sexo, int edad, float peso, float altura) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.sexo = sexo;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }

    //getters
    public String getNombre() {
        return this.nombre;
    }

    public String getDNI() {
        return this.DNI;
    }

    public char getSexo() {
        return this.sexo;
    }

    public int getEdad() {
        return this.edad;
    }

    public float getPeso() {
        return this.peso;
    }

    public float getAltura() {
        return this.altura;
    }

    //setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    //métodos
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", DNI=" + DNI + ", sexo=" + sexo + ", edad=" + edad + ", peso=" + peso + ", altura=" + altura + '}';
    }

    public int calcularIMC() {
        int resultado;
        double imc = this.peso / Math.sqrt(this.altura);

        if (imc < 18.5) {
            resultado = -1;
        } else if (imc > 24.9) {
            resultado = 1;
        } else {
            resultado = 0;
        }
        return resultado;
    }

    public boolean esMayorDeEdad() {
        boolean resultado = false;

        if (this.edad > 17) {
            resultado = true;
        }

        return resultado;
    }
}

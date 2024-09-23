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
        this.DNI = this.generaDNI();
    }

    public Persona(String nombre, char sexo, int edad) {
        this.nombre = nombre;
        this.sexo = this.comprobarSexo(sexo);
        this.edad = edad;
        this.peso = 0;
        this.altura = 0;
        this.DNI = this.generaDNI();
    }

    public Persona(String nombre, String DNI, char sexo, int edad, float peso, float altura) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.sexo = this.comprobarSexo(sexo);
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
        double imc = this.peso / Math.pow(this.altura, 2);

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

    private char comprobarSexo(char sexo) {
        char resultado = Persona.SEXO;
        if (sexo == 'H' || sexo == 'M') {
            resultado = sexo;
        }
        return resultado;
    }

    private String generaDNI() {
        String stringDNI = "";

        // Generar numeros aleatorios de 8 digitos en un String (cada digito 0-9)
        for (int i = 0; i < 8; i++) {
            stringDNI += (int) ((Math.random() * 10) + 1) - 1;
        }

        // Calcular la letra del DNI con el modulo 23
        int modulo = Integer.parseInt(stringDNI) % 23;

        char letra = ' ';
        switch (modulo) {
            case 0 ->
                letra = 'T';
            case 1 ->
                letra = 'R';
            case 2 ->
                letra = 'W';
            case 3 ->
                letra = 'A';
            case 4 ->
                letra = 'G';
            case 5 ->
                letra = 'M';
            case 6 ->
                letra = 'Y';
            case 7 ->
                letra = 'F';
            case 8 ->
                letra = 'P';
            case 9 ->
                letra = 'D';
            case 10 ->
                letra = 'X';
            case 11 ->
                letra = 'B';
            case 12 ->
                letra = 'N';
            case 13 ->
                letra = 'J';
            case 14 ->
                letra = 'Z';
            case 15 ->
                letra = 'S';
            case 16 ->
                letra = 'Q';
            case 17 ->
                letra = 'V';
            case 18 ->
                letra = 'H';
            case 19 ->
                letra = 'L';
            case 20 ->
                letra = 'C';
            case 21 ->
                letra = 'K';
            case 22 ->
                letra = 'E';
            default ->
                System.out.println("Error: Resto fuera de rango.");
        }

        //concatenar StringDNI con letra valida
        stringDNI += letra;

        return stringDNI;
    }
}

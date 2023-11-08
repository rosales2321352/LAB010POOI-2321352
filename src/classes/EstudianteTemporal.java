package classes;

import java.util.List;

public class EstudianteTemporal {

    private String name;
    private int edad;
    private Direccion direccion;
    private List<NumeroCelular> numeros;

    public EstudianteTemporal(){}

    public EstudianteTemporal(String name, int edad, Direccion direccion, List<NumeroCelular> numeros) {
        this.name = name;
        this.edad = edad;
        this.direccion = direccion;
        this.numeros = numeros;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public List<NumeroCelular> getNumeros() {
        return numeros;
    }

    public void setNumeros(List<NumeroCelular> numeros) {
        this.numeros = numeros;
    }
}

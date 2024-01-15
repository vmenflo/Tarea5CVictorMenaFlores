/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.Objects;

/**
 *
 * @author victor
 */
public class Aviones {
    //Atributos
    private String modelo;
    private String origenFabricacion;
    private int longitud;
    
    //Constructor

    public Aviones() {
    }

    public Aviones(String modelo, String origenFabricacion, int longitud) {
        this.modelo = modelo;
        this.origenFabricacion = origenFabricacion;
        this.longitud = longitud;
    }
    
    //Metodo copia
    public Aviones(Aviones origen) {
        this.modelo = origen.modelo;
        this.origenFabricacion = origen.origenFabricacion;
        this.longitud = origen.longitud;
    }
    
    //GETTER and SETTER
    //Estos son los getter and setter de mi proyecto

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getOrigenFabricacion() {
        return origenFabricacion;
    }

    public void setOrigenFabricacion(String origenFabricacion) {
        this.origenFabricacion = origenFabricacion;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    
    //To String

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Aviones{");
        sb.append("modelo=").append(modelo);
        sb.append(", origenFabricacion=").append(origenFabricacion);
        sb.append(", longitud=").append(longitud);
        sb.append('}');
        return sb.toString();
    }
    
    //Equals y Hash

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 73 * hash + Objects.hashCode(this.modelo);
        hash = 73 * hash + Objects.hashCode(this.origenFabricacion);
        hash = 73 * hash + this.longitud;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Aviones other = (Aviones) obj;
        if (this.longitud != other.longitud) {
            return false;
        }
        if (!Objects.equals(this.modelo, other.modelo)) {
            return false;
        }
        return Objects.equals(this.origenFabricacion, other.origenFabricacion);
    }
}

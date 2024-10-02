package org.example.Modelos;

import java.time.LocalDate;

public class Beneficiario {

    private Long id;

    private String nombre;

    private String apellido;

    private Double numeroIdentificacion;

    private String direccion;

    private Integer telefono;

    private String correo;

    private LocalDate fechaNacimiento;

    private String estadoCivil;

    private String personasCargo;


    public Beneficiario(String juan, String pérez, double v, String s, int i, String mail, LocalDate localDate, String soltero, String number) {
    }

    public Beneficiario() {
    }

    public Beneficiario(Long id, String nombre, String apellido, Double numeroIdentificacion, String direccion, Integer telefono, String correo, LocalDate fechaNacimiento, String estadoCivil, String personasCargo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroIdentificacion = numeroIdentificacion;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.fechaNacimiento = fechaNacimiento;
        this.estadoCivil = estadoCivil;
        this.personasCargo = personasCargo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Double getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(Double numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getPersonasCargo() {
        return personasCargo;
    }

    public void setPersonasCargo(String personasCargo) {
        this.personasCargo = personasCargo;
    }

    @Override
    public String toString() {
        return "Beneficiario{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", numeroIdentificacion=" + numeroIdentificacion +
                ", direccion='" + direccion + '\'' +
                ", telefono=" + telefono +
                ", correo='" + correo + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", estadoCivil='" + estadoCivil + '\'' +
                ", personasCargo='" + personasCargo + '\'' +
                '}';
    }
}

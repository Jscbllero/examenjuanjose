package org.example.Modelos;

import java.time.LocalDate;

public class Empleado {

    private Long id;

    private String nombre;

    private String direccion;

    private String correo;

    private LocalDate fechaNacimiento;

    private LocalDate numeroIdentificacion;

    private String estadoCivil;

    private String nivelEstudio;

    private String experienciaLaboral;

    private String habilidades;

    private String referenciaLaboral;

    private String disponibilidad;

    private String certificados;

    private Double expectativaSalarial;

    public Empleado() {
    }

    public Empleado(Long id, String nombre, String direccion, String correo, LocalDate fechaNacimiento, LocalDate numeroIdentificacion, String estadoCivil, String nivelEstudio, String experienciaLaboral, String habilidades, String referenciaLaboral, String disponibilidad, String certificados, Double expectativaSalarial) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.correo = correo;
        this.fechaNacimiento = fechaNacimiento;
        this.numeroIdentificacion = numeroIdentificacion;
        this.estadoCivil = estadoCivil;
        this.nivelEstudio = nivelEstudio;
        this.experienciaLaboral = experienciaLaboral;
        this.habilidades = habilidades;
        this.referenciaLaboral = referenciaLaboral;
        this.disponibilidad = disponibilidad;
        this.certificados = certificados;
        this.expectativaSalarial = expectativaSalarial;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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

    public LocalDate getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(LocalDate numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getNivelEstudio() {
        return nivelEstudio;
    }

    public void setNivelEstudio(String nivelEstudio) {
        this.nivelEstudio = nivelEstudio;
    }

    public String getExperienciaLaboral() {
        return experienciaLaboral;
    }

    public void setExperienciaLaboral(String experienciaLaboral) {
        this.experienciaLaboral = experienciaLaboral;
    }

    public String getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(String habilidades) {
        this.habilidades = habilidades;
    }

    public String getReferenciaLaboral() {
        return referenciaLaboral;
    }

    public void setReferenciaLaboral(String referenciaLaboral) {
        this.referenciaLaboral = referenciaLaboral;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getCertificados() {
        return certificados;
    }

    public void setCertificados(String certificados) {
        this.certificados = certificados;
    }

    public Double getExpectativaSalarial() {
        return expectativaSalarial;
    }

    public void setExpectativaSalarial(Double expectativaSalarial) {
        this.expectativaSalarial = expectativaSalarial;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", correo='" + correo + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", numeroIdentificacion=" + numeroIdentificacion +
                ", estadoCivil='" + estadoCivil + '\'' +
                ", nivelEstudio='" + nivelEstudio + '\'' +
                ", experienciaLaboral='" + experienciaLaboral + '\'' +
                ", habilidades='" + habilidades + '\'' +
                ", referenciaLaboral='" + referenciaLaboral + '\'' +
                ", disponibilidad='" + disponibilidad + '\'' +
                ", certificados='" + certificados + '\'' +
                ", expectativaSalarial=" + expectativaSalarial +
                '}';
    }
}

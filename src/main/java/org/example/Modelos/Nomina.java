package org.example.Modelos;

import java.time.LocalDate;

public class Nomina {

private Long id;

private String nombre;

private String apellido;

private String numeroIdentificacion;

private String seguridadSocial;

private String cargoEmpleado;

private LocalDate fechaIngreso;

private Double salario;

private String ciudad;

private Double salarioNeto;

    public Nomina() {
    }

    public Nomina(Long id, String nombre, String apellido, String numeroIdentificacion, String seguridadSocial, String cargoEmpleado, LocalDate fechaIngreso, Double salario, String ciudad, Double salarioNeto) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroIdentificacion = numeroIdentificacion;
        this.seguridadSocial = seguridadSocial;
        this.cargoEmpleado = cargoEmpleado;
        this.fechaIngreso = fechaIngreso;
        this.salario = salario;
        this.ciudad = ciudad;
        this.salarioNeto = salarioNeto;
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

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getSeguridadSocial() {
        return seguridadSocial;
    }

    public void setSeguridadSocial(String seguridadSocial) {
        this.seguridadSocial = seguridadSocial;
    }

    public String getCargoEmpleado() {
        return cargoEmpleado;
    }

    public void setCargoEmpleado(String cargoEmpleado) {
        this.cargoEmpleado = cargoEmpleado;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Double getSalarioNeto() {
        return salarioNeto;
    }

    public void setSalarioNeto(Double salarioNeto) {
        this.salarioNeto = salarioNeto;
    }

    @Override
    public String toString() {
        return "Nomina{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", numeroIdentificacion='" + numeroIdentificacion + '\'' +
                ", seguridadSocial='" + seguridadSocial + '\'' +
                ", cargoEmpleado='" + cargoEmpleado + '\'' +
                ", fechaIngreso=" + fechaIngreso +
                ", salario=" + salario +
                ", ciudad='" + ciudad + '\'' +
                ", salarioNeto=" + salarioNeto +
                '}';
    }
}

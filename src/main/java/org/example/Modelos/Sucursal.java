package org.example.Modelos;

public class Sucursal {

    private Long id;

    private String nombreSucursal;

    private String direccion;

    private Integer telefono;

    private String correo;

    private String servicios;

    private Double numeroRegistro;

    private String nombreResponsable;

    private String numeroEmpleados;

    private Integer horario;

    public Sucursal(String sucursalCentro, String s, int i, String mail, String string, double v, String carlosMartínez, String number, int i1) {
    }

    public Sucursal() {
    }

    public Sucursal(Long id, String nombreSucursal, String direccion, Integer telefono, String correo, String servicios, Double numeroRegistro, String nombreResponsable, String numeroEmpleados, Integer horario) {
        this.id = id;
        this.nombreSucursal = nombreSucursal;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.servicios = servicios;
        this.numeroRegistro = numeroRegistro;
        this.nombreResponsable = nombreResponsable;
        this.numeroEmpleados = numeroEmpleados;
        this.horario = horario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreSucursal() {
        return nombreSucursal;
    }

    public void setNombreSucursal(String nombreSucursal) {
        this.nombreSucursal = nombreSucursal;
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

    public String getServicios() {
        return servicios;
    }

    public void setServicios(String servicios) {
        this.servicios = servicios;
    }

    public Double getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(Double numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public String getNombreResponsable() {
        return nombreResponsable;
    }

    public void setNombreResponsable(String nombreResponsable) {
        this.nombreResponsable = nombreResponsable;
    }

    public String getNumeroEmpleados() {
        return numeroEmpleados;
    }

    public void setNumeroEmpleados(String numeroEmpleados) {
        this.numeroEmpleados = numeroEmpleados;
    }

    public Integer getHorario() {
        return horario;
    }

    public void setHorario(Integer horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "Sucursal{" +
                "id=" + id +
                ", nombreSucursal='" + nombreSucursal + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono=" + telefono +
                ", correo='" + correo + '\'' +
                ", servicios='" + servicios + '\'' +
                ", numeroRegistro=" + numeroRegistro +
                ", nombreResponsable='" + nombreResponsable + '\'' +
                ", numeroEmpleados='" + numeroEmpleados + '\'' +
                ", horario=" + horario +
                '}';
    }
}

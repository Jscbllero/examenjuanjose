package org.example.Modelos;

public class Area {

    private Long id;

    private String nombreArea;

    private String puestoCargo;

    private String tipoEmpleo;

    private String experienciaSector;

    private String disponibilidadLaboral;

    private String flexibilidadHorario;

    private Double numeroOficinas;

    private String jefeCargo;

    private String tipoSucursal;


    public Area() {
    }

    public Area(String nombreArea, String puestoCargo, String tipoEmpleo, String experienciaSector, String disponibilidadLaboral, String flexibilidadHorario, Double numeroOficinas, String jefeCargo, String tipoSucursal) {
        this.id = id;
        this.nombreArea = nombreArea;
        this.puestoCargo = puestoCargo;
        this.tipoEmpleo = tipoEmpleo;
        this.experienciaSector = experienciaSector;
        this.disponibilidadLaboral = disponibilidadLaboral;
        this.flexibilidadHorario = flexibilidadHorario;
        this.numeroOficinas = numeroOficinas;
        this.jefeCargo = jefeCargo;
        this.tipoSucursal = tipoSucursal;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreArea() {
        return nombreArea;
    }

    public void setNombreArea(String nombreArea) {
        this.nombreArea = nombreArea;
    }

    public String getPuestoCargo() {
        return puestoCargo;
    }

    public void setPuestoCargo(String puestoCargo) {
        this.puestoCargo = puestoCargo;
    }

    public String getTipoEmpleo() {
        return tipoEmpleo;
    }

    public void setTipoEmpleo(String tipoEmpleo) {
        this.tipoEmpleo = tipoEmpleo;
    }

    public String getExperienciaSector() {
        return experienciaSector;
    }

    public void setExperienciaSector(String experienciaSector) {
        this.experienciaSector = experienciaSector;
    }

    public String getDisponibilidadLaboral() {
        return disponibilidadLaboral;
    }

    public void setDisponibilidadLaboral(String disponibilidadLaboral) {
        this.disponibilidadLaboral = disponibilidadLaboral;
    }

    public String getFlexibilidadHorario() {
        return flexibilidadHorario;
    }

    public void setFlexibilidadHorario(String flexibilidadHorario) {
        this.flexibilidadHorario = flexibilidadHorario;
    }

    public Double getNumeroOficinas() {
        return numeroOficinas;
    }

    public void setNumeroOficinas(Double numeroOficinas) {
        this.numeroOficinas = numeroOficinas;
    }

    public String getJefeCargo() {
        return jefeCargo;
    }

    public void setJefeCargo(String jefeCargo) {
        this.jefeCargo = jefeCargo;
    }

    public String getTipoSucursal() {
        return tipoSucursal;
    }

    public void setTipoSucursal(String tipoSucursal) {
        this.tipoSucursal = tipoSucursal;
    }

    @Override
    public String toString() {
        return "Area{" +
                "id=" + id +
                ", nombreArea='" + nombreArea + '\'' +
                ", puestoCargo='" + puestoCargo + '\'' +
                ", tipoEmpleo='" + tipoEmpleo + '\'' +
                ", experienciaSector='" + experienciaSector + '\'' +
                ", disponibilidadLaboral='" + disponibilidadLaboral + '\'' +
                ", flexibilidadHorario='" + flexibilidadHorario + '\'' +
                ", numeroOficinas=" + numeroOficinas +
                ", jefeCargo='" + jefeCargo + '\'' +
                ", tipoSucursal='" + tipoSucursal + '\'' +
                '}';
    }
}

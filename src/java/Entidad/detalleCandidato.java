package Entidad;

public class detalleCandidato {
    private int idDetalle;
    private String simboloPPolitico;
    private String nomPPolitico;
    private String nombreRegion;
    private String nombreProvincia;
    private String nombreDistrito;
    private String idCandidato;

    public detalleCandidato() {
    }

    public detalleCandidato(String simboloPPolitico, String nomPPolitico, String nombreRegion, String nombreProvincia, String nombreDistrito, String idCandidato) {
        this.simboloPPolitico = simboloPPolitico;
        this.nomPPolitico = nomPPolitico;
        this.nombreRegion = nombreRegion;
        this.nombreProvincia = nombreProvincia;
        this.nombreDistrito = nombreDistrito;
        this.idCandidato = idCandidato;
    }

    public detalleCandidato(int idDetalle, String simboloPPolitico, String nomPPolitico, String nombreRegion, String nombreProvincia, String nombreDistrito, String idCandidato) {
        this.idDetalle = idDetalle;
        this.simboloPPolitico = simboloPPolitico;
        this.nomPPolitico = nomPPolitico;
        this.nombreRegion = nombreRegion;
        this.nombreProvincia = nombreProvincia;
        this.nombreDistrito = nombreDistrito;
        this.idCandidato = idCandidato;
    }

    public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }

    public String getSimboloPPolitico() {
        return simboloPPolitico;
    }

    public void setSimboloPPolitico(String simboloPPolitico) {
        this.simboloPPolitico = simboloPPolitico;
    }

    public String getNomPPolitico() {
        return nomPPolitico;
    }

    public void setNomPPolitico(String nomPPolitico) {
        this.nomPPolitico = nomPPolitico;
    }

    public String getNombreRegion() {
        return nombreRegion;
    }

    public void setNombreRegion(String nombreRegion) {
        this.nombreRegion = nombreRegion;
    }

    public String getNombreProvincia() {
        return nombreProvincia;
    }

    public void setNombreProvincia(String nombreProvincia) {
        this.nombreProvincia = nombreProvincia;
    }

    public String getNombreDistrito() {
        return nombreDistrito;
    }

    public void setNombreDistrito(String nombreDistrito) {
        this.nombreDistrito = nombreDistrito;
    }

    public String getIdCandidato() {
        return idCandidato;
    }

    public void setIdCandidato(String idCandidato) {
        this.idCandidato = idCandidato;
    }

        
}

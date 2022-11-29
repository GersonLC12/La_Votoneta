package Entidad;

public class Candidato {
    private int idCandidato;
    private String nomCandidato;
    private String edadCandidato;
    private String estudiosCandidato;
    private String laboralCandidato;
    private String publicoCandidato;
    private String sentenciaCandidato;
    private String ingresoCandidato;
    private String regionCandidato;
    private String provinciaCandidato;
    private String distritoCandidato;
    private String urlCandidato;
    private String fotoCandidato;

    public Candidato() {
    }

    public Candidato(String nomCandidato, String edadCandidato, String estudiosCandidato, String laboralCandidato, String publicoCandidato, String sentenciaCandidato, String ingresoCandidato, String regionCandidato, String provinciaCandidato, String distritoCandidato, String urlCandidato, String fotoCandidato) {
        this.nomCandidato = nomCandidato;
        this.edadCandidato = edadCandidato;
        this.estudiosCandidato = estudiosCandidato;
        this.laboralCandidato = laboralCandidato;
        this.publicoCandidato = publicoCandidato;
        this.sentenciaCandidato = sentenciaCandidato;
        this.ingresoCandidato = ingresoCandidato;
        this.regionCandidato = regionCandidato;
        this.provinciaCandidato = provinciaCandidato;
        this.distritoCandidato = distritoCandidato;
        this.urlCandidato = urlCandidato;
        this.fotoCandidato = fotoCandidato;
    }

    public Candidato(int idCandidato, String nomCandidato, String edadCandidato, String estudiosCandidato, String laboralCandidato, String publicoCandidato, String sentenciaCandidato, String ingresoCandidato, String regionCandidato, String provinciaCandidato, String distritoCandidato, String urlCandidato, String fotoCandidato) {
        this.idCandidato = idCandidato;
        this.nomCandidato = nomCandidato;
        this.edadCandidato = edadCandidato;
        this.estudiosCandidato = estudiosCandidato;
        this.laboralCandidato = laboralCandidato;
        this.publicoCandidato = publicoCandidato;
        this.sentenciaCandidato = sentenciaCandidato;
        this.ingresoCandidato = ingresoCandidato;
        this.regionCandidato = regionCandidato;
        this.provinciaCandidato = provinciaCandidato;
        this.distritoCandidato = distritoCandidato;
        this.urlCandidato = urlCandidato;
        this.fotoCandidato = fotoCandidato;
    }

    public int getIdCandidato() {
        return idCandidato;
    }

    public void setIdCandidato(int idCandidato) {
        this.idCandidato = idCandidato;
    }

    public String getNomCandidato() {
        return nomCandidato;
    }

    public void setNomCandidato(String nomCandidato) {
        this.nomCandidato = nomCandidato;
    }

    public String getEdadCandidato() {
        return edadCandidato;
    }

    public void setEdadCandidato(String edadCandidato) {
        this.edadCandidato = edadCandidato;
    }

    public String getEstudiosCandidato() {
        return estudiosCandidato;
    }

    public void setEstudiosCandidato(String estudiosCandidato) {
        this.estudiosCandidato = estudiosCandidato;
    }

    public String getLaboralCandidato() {
        return laboralCandidato;
    }

    public void setLaboralCandidato(String laboralCandidato) {
        this.laboralCandidato = laboralCandidato;
    }

    public String getPublicoCandidato() {
        return publicoCandidato;
    }

    public void setPublicoCandidato(String publicoCandidato) {
        this.publicoCandidato = publicoCandidato;
    }

    public String getSentenciaCandidato() {
        return sentenciaCandidato;
    }

    public void setSentenciaCandidato(String sentenciaCandidato) {
        this.sentenciaCandidato = sentenciaCandidato;
    }

    public String getIngresoCandidato() {
        return ingresoCandidato;
    }

    public void setIngresoCandidato(String ingresoCandidato) {
        this.ingresoCandidato = ingresoCandidato;
    }

    public String getRegionCandidato() {
        return regionCandidato;
    }

    public void setRegionCandidato(String regionCandidato) {
        this.regionCandidato = regionCandidato;
    }

    public String getProvinciaCandidato() {
        return provinciaCandidato;
    }

    public void setProvinciaCandidato(String provinciaCandidato) {
        this.provinciaCandidato = provinciaCandidato;
    }

    public String getDistritoCandidato() {
        return distritoCandidato;
    }

    public void setDistritoCandidato(String distritoCandidato) {
        this.distritoCandidato = distritoCandidato;
    }

    public String getUrlCandidato() {
        return urlCandidato;
    }

    public void setUrlCandidato(String urlCandidato) {
        this.urlCandidato = urlCandidato;
    }

    public String getFotoCandidato() {
        return fotoCandidato;
    }

    public void setFotoCandidato(String fotoCandidato) {
        this.fotoCandidato = fotoCandidato;
    }

    
}

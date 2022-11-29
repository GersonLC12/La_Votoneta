package Interface;

import Entidad.Candidato;
import java.util.List;

public interface CRUDCandidato {
    public List listarRegion(String region);
    public List listarProvincia(String provincia);
    public List listarDistrito(String distrito);
    public List listar();
    public Candidato list(int id);
    public boolean add(Candidato nomCandidato);
    public boolean edit(Candidato nomCandidato);
    public boolean eliminar(int id);
}

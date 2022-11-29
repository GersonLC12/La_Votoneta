package Modelo;

import Configuracion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import Interface.CRUDCandidato;
import Entidad.Candidato;
import Entidad.detalleCandidato;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.sql.Blob;
import java.util.Set;
import javax.imageio.ImageIO;

public class CandidatoDAO implements CRUDCandidato{
    
    Conexion cn=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    Candidato candidato = new Candidato();

    @Override
    public List listarRegion(String region) {
        ArrayList<detalleCandidato>list=new ArrayList<>();
        String sql="SELECT simboloPPolitico, nomPPolitico, idCandidato, nombreRegion FROM `detcandidato` "
                + "INNER JOIN `ppolitico` ON detcandidato.idPPolitico=ppolitico.idPpolitico "
                + "INNER JOIN `region` ON detcandidato.idRegion=region.idRegion "
                + "WHERE nombreRegion='"+region+"' AND idProvincia='2'";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                detalleCandidato detalle = new detalleCandidato();
                detalle.setSimboloPPolitico(rs.getString("simboloPPolitico"));
                detalle.setNomPPolitico(rs.getString("nomPPolitico"));
                detalle.setNombreRegion(rs.getString("nombreRegion"));
                detalle.setIdCandidato(rs.getString("idCandidato"));
                detalle.setNombreProvincia("NO APLICA");
                detalle.setNombreDistrito("NO APLICA");
                           
                list.add(detalle);
            }
        } catch (Exception e) {
        }
        return list;
    }

    @Override
    public List listarProvincia(String provincia) {
        ArrayList<detalleCandidato>list=new ArrayList<>();
        String sql="SELECT simboloPPolitico, nomPPolitico, idCandidato, nombreProvincia FROM `detcandidato` "
                + "INNER JOIN `ppolitico` ON detcandidato.idPPolitico=ppolitico.idPpolitico "
                + "INNER JOIN `provincia` ON detcandidato.idProvincia=provincia.idProvincia "
                + "WHERE nombreProvincia='"+provincia+"' AND detcandidato.idDistrito='30'";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                detalleCandidato detalleP = new detalleCandidato();
                detalleP.setSimboloPPolitico(rs.getString("simboloPPolitico"));
                detalleP.setNomPPolitico(rs.getString("nomPPolitico"));
                detalleP.setNombreRegion("AREQUIPA");
                detalleP.setIdCandidato(rs.getString("idCandidato"));
                detalleP.setNombreProvincia(rs.getString("nombreProvincia"));
                detalleP.setNombreDistrito("NO APLICA");
                           
                list.add(detalleP);
            }
        } catch (Exception e) {
        }
        return list;
    }

    @Override
    public List listarDistrito(String distrito) {
        ArrayList<detalleCandidato>list=new ArrayList<>();
        String sql="SELECT simboloPPolitico, nomPPolitico, idCandidato, nombreDistrito FROM `detcandidato` "
                + "INNER JOIN `ppolitico` ON detcandidato.idPPolitico=ppolitico.idPpolitico "
                + "INNER JOIN `distrito` ON detcandidato.idDistrito=distrito.idDistrito "
                + "WHERE nombreDistrito='"+distrito+"'";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                detalleCandidato detalle = new detalleCandidato();
                detalle.setSimboloPPolitico(rs.getString("simboloPPolitico"));
                detalle.setNomPPolitico(rs.getString("nomPPolitico"));
                detalle.setNombreRegion("AREQUIPA");
                detalle.setIdCandidato(rs.getString("idCandidato"));
                detalle.setNombreProvincia("AREQUIPA");
                detalle.setNombreDistrito(rs.getString("nombreDistrito"));
                           
                list.add(detalle);
            }
        } catch (Exception e) {
        }
        return list;
    }
    
    @Override
    public List listar() {
        ArrayList<Candidato>list=new ArrayList<>();
        String sql="SELECT idCandidato, nomCandidato, regionCandidato, provinciaCandidato, distritoCandidato FROM candidatos";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Candidato candidat= new Candidato();
                candidat.setIdCandidato(rs.getInt("idCandidato"));
                candidat.setNomCandidato(rs.getString("nomCandidato"));
                candidat.setRegionCandidato(rs.getString("regionCandidato"));
                candidat.setProvinciaCandidato(rs.getString("provinciaCandidato"));
                candidat.setDistritoCandidato(rs.getString("distritoCandidato"));
                           
                list.add(candidat);
            }
        } catch (Exception e) {
        }
        return list;
    }

    @Override
    public Candidato list(int id) {
        ArrayList<Candidato>list=new ArrayList<>();
        String sql="SELECT idCandidato, nombreCandidato, edadCandidato, estudiosCandidato, experienciaCandidato, "
                + "cargoPubCandidato, sentenciasCandidato, ingresosCandidato,descAnalisis, fotoCandidato FROM `candidato` WHERE idCandidato="+id;
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                candidato.setIdCandidato(rs.getInt("idCandidato"));
                candidato.setNomCandidato(rs.getString("nombreCandidato"));
                candidato.setEdadCandidato(rs.getString("edadCandidato"));
                candidato.setEstudiosCandidato(rs.getString("estudiosCandidato"));
                candidato.setLaboralCandidato(rs.getString("experienciaCandidato"));
                candidato.setPublicoCandidato(rs.getString("cargoPubCandidato"));
                candidato.setSentenciaCandidato(rs.getString("sentenciasCandidato"));
                candidato.setIngresoCandidato(rs.getString("ingresosCandidato"));
                candidato.setUrlCandidato(rs.getString("descAnalisis"));
                
                candidato.setFotoCandidato(rs.getString("fotoCandidato"));
            }
        }catch (Exception e){
            
        }
        return candidato;
    }

    @Override
    public boolean add(Candidato nomCandidato) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean edit(Candidato nomCandidato) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminar(int id) {
        String sql="delete from candidatos where idSolicitud="+id;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }
    
}

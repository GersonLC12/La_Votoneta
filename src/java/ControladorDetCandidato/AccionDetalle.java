package ControladorDetCandidato;

import ControladorDetCandidato.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import javax.servlet.ServletException;

public abstract class AccionDetalle {
    public abstract String Comando(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException;
    
    public static AccionDetalle getAccion(String valor){
        AccionDetalle accion = null;
        
        if(valor.equals("R-Buscar")){
            accion = new listarAccion();
        }
        else{
            if(valor.equals("P-Buscar")){
                accion = new listarAccionProv();
            }
            else{
                if(valor.equals("D-Buscar")){
                    accion = new listarAccionDist();
                }
            }
        }
        return accion;
    }
}
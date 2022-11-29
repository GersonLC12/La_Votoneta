package ControladorDetCandidato;

import ControladorDetCandidato.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class listarAccionProv extends AccionDetalle {

    public String Comando(HttpServletRequest request, HttpServletResponse
                response) throws ServletException, IOException 
    {
        request.getRequestDispatcher("/listarCandidatosProvincia.jsp").forward(request, response);
        
        return "";
        
        
    }
}
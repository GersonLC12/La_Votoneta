package ControladorDetCandidato;

import ControladorDetCandidato.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class listarAccionDist extends AccionDetalle {

    public String Comando(HttpServletRequest request, HttpServletResponse
                response) throws ServletException, IOException 
    {
        request.getRequestDispatcher("/listarCandidatosDistrito.jsp").forward(request, response);
        
        return "";
        
        
    }
}

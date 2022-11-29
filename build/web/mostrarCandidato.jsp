<%@page import="Entidad.Candidato"%>
<%@page import="Modelo.CandidatoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="/header.jsp"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <title>Candidato</title>
    </head>
    <body>
        <div class="container">
            <h1>Candidato</h1>
            <br>
            <br>
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th class="text-center">CRITERIO</th>
                        <th class="text-center">DETALLE</th>
                        <th class="text-center">CANDIDATO</th>
                    </tr>
                </thead>
                <%
                    Candidato c = new Candidato();
                    CandidatoDAO dao=new CandidatoDAO();
                    int id = Integer.parseInt(request.getParameter("idCandidato"));
                    c = dao.list(id);
                    
                %>
                    <tr>
                        
                        <th class="text-center"><br>NOMBRE</th>
                        <td class="text-center"><br><%= c.getNomCandidato() %></td>
                        <td class="text-center" width="300" height="300" rowspan="8"><img src="<%= c.getFotoCandidato() %>"></td>
                    </tr>
                
                
                    <tr>
                        <th class="text-center"><br>ESTUDIOS UNIVERSITARIOS</th>
                        <td class="text-center"><br><%= c.getEstudiosCandidato() %></td>
                    </tr>
                    
                    <tr>
                        <th class="text-center"><br>EXPERIENCIA LABORAL</th>
                        <td class="text-center"><br><%= c.getLaboralCandidato() %></td>
                    </tr>
                    
                    <tr>
                        <th class="text-center"><br>CARGOS PARTIDARIOS</th>
                        <td class="text-center"><br><%= c.getPublicoCandidato() %></td>
                    </tr>
                    
                    <tr>
                        <th class="text-center"><br>SENTENCIAS</th>
                        <td class="text-center"><br><%= c.getSentenciaCandidato() %></td>
                    </tr>
                    
                    <tr>
                        <th class="text-center"><br>INGRESOS ANUALES</th>
                        <td class="text-center"><br><%= c.getIngresoCandidato() %></td>
                    </tr>
                    
                    <tr>
                        <th class="text-center"><br>ANÁLISIS*</th>
                        <td class="text-center"><br><%= c.getUrlCandidato() %></td>
                    </tr>
                
            </table>
            * El resultado del análisis se obtuvo mediante minería de datos, cotejando si los criterios más comúnes para el éxito de 
            un candidato son compatibles con los mostrados en este perfil.
        </div>
    </body>
    <%@include file="/footer.jsp"%>
</html>
<%@page import="java.util.Iterator"%>
<%@page import="Entidad.detalleCandidato"%>
<%@page import="java.util.List"%>
<%@page import="Modelo.CandidatoDAO"%>
<%@page import="ControladorDetCandidato.ControladorDetCandidato"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="/header.jsp"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <title>Lista de Candidatos</title>
    </head>
    <body>
        <div class="container">
            <h1>Lista de Candidatos - Provincia</h1>
            <br>
            <br>
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th class="text-center">SIMBOLO</th>
                        <th class="text-center">PARTIDO POLITICO</th>
                        <th class="text-center">REGION</th>
                        <th class="text-center">PROVINCIA</th>
                        <th class="text-center">DISTRITO</th>
                        <th class="text-center">ACCION</th>
                    </tr>
                </thead>
                <%
                    
                    CandidatoDAO dao=new CandidatoDAO();
                    List<detalleCandidato>list=dao.listarProvincia(request.getParameter("provincia"));
                    Iterator<detalleCandidato>iter=list.iterator();
                    detalleCandidato detalleP = null;
                    while(iter.hasNext()){
                        detalleP=iter.next();
                    
                %>
                <tbody>
                    <tr>
                        <td class="text-center" width="90" height="90"><img src="<%= detalleP.getSimboloPPolitico() %>"></td>
                        <td class="text-center"><br><%= detalleP.getNomPPolitico() %></td>
                        <td class="text-center"><br><%= detalleP.getNombreRegion() %></td>
                        <td class="text-center"><br><%= detalleP.getNombreProvincia() %></td>
                        <td class="text-center"><br><%= detalleP.getNombreDistrito() %></td>
                        <td class="text-center"><br>
                            <a class="btn btn-warning" href="mostrarCandidato.jsp?idCandidato=<%= detalleP.getIdCandidato() %>">VER</a>
                        </td>
                    </tr>
                    <%}%>
                </tbody>
            </table>

        </div>
    </body>
    <%@include file="/footer.jsp"%>
</html>
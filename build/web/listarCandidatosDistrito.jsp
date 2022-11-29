<%@page import="java.util.Iterator"%>
<%@page import="Entidad.detalleCandidato"%>
<%@page import="java.util.List"%>
<%@page import="Modelo.CandidatoDAO"%>
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
            <h1>Lista de Candidatos</h1>
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
                    List<detalleCandidato>list=dao.listarDistrito(request.getParameter("distrito"));
                    Iterator<detalleCandidato>iter=list.iterator();
                    detalleCandidato detalle = null;
                    while(iter.hasNext()){
                        detalle=iter.next();
                    
                %>
                <tbody>
                    <tr>
                        <td class="text-center" width="90" height="90"><img src="<%= detalle.getSimboloPPolitico() %>"></td>
                        <td class="text-center"><br><%= detalle.getNomPPolitico() %></td>
                        <td class="text-center"><br><%= detalle.getNombreRegion() %></td>
                        <td class="text-center"><br><%= detalle.getNombreProvincia() %></td>
                        <td class="text-center"><br><%= detalle.getNombreDistrito() %></td>
                        <td class="text-center"><br>
                            <a class="btn btn-warning" href="mostrarCandidato.jsp?idCandidato=<%= detalle.getIdCandidato() %>">VER</a>
                        </td>
                    </tr>
                    <%}%>
                </tbody>
            </table>

        </div>
    </body>
    <%@include file="/footer.jsp"%>
</html>

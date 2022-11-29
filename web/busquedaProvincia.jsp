<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="/header.jsp"%>
<link rel="stylesheet" href="css/estilos.css">
<div class="contenedor-form">
    <div class="toggle">
            
        </div>
        <div class="formulario">
            <h2>Buscar Candidatos</h2>
            
                <span class="busqueda-etiqueta">Región o Departamento</span>
                <select class="form-control" name="region" id="region">
                    <option value="AREQUIPA">AREQUIPA</option>
                </select>
                <form action="ControladorDetCandidato">
                <span class="busqueda-etiqueta">Provincia</span>
                <select class="form-control" name="provincia" id="provincia">
                    <option value="AREQUIPA">AREQUIPA</option>
                </select>
                <p></p>
                <input type="submit" name="accion" value="P-Buscar">
                <p></p>
                <input type="submit" name="accion" value="Volver" formaction="busqueda.jsp">
                
            </form>
        </div>
</div>

   <script src="js/jquery-3.1.1.min.js"></script>    
   <script src="js/main.js"></script>

<%@include file="/footer.jsp"%>
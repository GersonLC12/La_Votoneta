<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="/header.jsp"%>
<link rel="stylesheet" href="css/estilos.css">
<div class="contenedor-form">
    <div class="toggle">
            
        </div>
        <div class="formulario">
            <h2>Seleccione su tipo de busqueda</h2>
                <form method="post">
            
                <input type="submit" name="accion" value="Buscar por Region o Departamento" formaction="busquedaRegion.jsp">
                <p></p>
                <input type="submit" name="accion" value="Buscar por Provincia" formaction="busquedaProvincia.jsp">
                <p></p>
                <input type="submit" name="accion" value="Buscar por Distrito" formaction="busquedaDistrito.jsp">
                
                </form>
        </div>
</div>
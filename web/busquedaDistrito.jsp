<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="/header.jsp"%>
<link rel="stylesheet" href="css/estilos.css">
<div class="contenedor-form">
    <div class="toggle">
            
        </div>
        <div class="formulario">
            <h2>Buscar Candidatos</h2>
            <form action="ControladorDetCandidato">
                <span class="busqueda-etiqueta">Región o Departamento</span>
                <select class="form-control" name="region" id="region">
                    <option value="r">AREQUIPA</option>
                </select>
                <span class="busqueda-etiqueta">Provincia</span>
                <select class="form-control" name="region" id="region">
                    <option value="r">AREQUIPA</option>
                </select>
                <span class="busqueda-etiqueta">Distrito</span>
                <select class="form-control" name="distrito" id="distrito">
                    <option value="ALTO SELVA ALEGRE">ALTO SELVA ALEGRE</option>
                    <option value="CAYMA">CAYMA</option>
                    <option value="CERRO COLORADO">CERRO COLORADO</option>
                    <option value="CHARACATO">CHARACATO</option>
                    <option value="CHIGUATA">CHIGUATA</option>
                    <option value="JACOBO HUNTER">JACOBO HUNTER</option>
                    <option value="JOSE LUIS BUSTAMANTE Y RIVERO">JOSE LUIS BUSTAMANTE Y RIVERO</option>
                    <option value="LA JOYA">LA JOYA</option>
                    <option value="MARIANO MELGAR">MARIANO MELGAR</option>
                    <option value="MIRAFLORES">MIRAFLORES</option>
                    <option value="MOLLEBAYA">MOLLEBAYA</option>
                    <option value="PAUCARPATA">PAUCARPATA</option>
                    <option value="POCSI">POCSI</option>
                    <option value="POLOBAYA">POLOBAYA</option>
                    <option value="QUEQUEÑA">QUEQUEÑA</option>
                    <option value="SABANDIA">SABANDIA</option>
                    <option value="SACHACA">SACHACA</option>
                    <option value="SAN JUAN DE SIGUAS">SAN JUAN DE SIGUAS</option>
                    <option value="SAN JUAN DE TARUCANI">SAN JUAN DE TARUCANI</option>
                    <option value="SANTA ISABEL DE SIGUAS">SANTA ISABEL DE SIGUAS</option>
                    <option value="SANTA RITA DE SIGUAS">SANTA RITA DE SIGUAS</option>
                    <option value="SOCABAYA">SOCABAYA</option>
                    <option value="TIABAYA">TIABAYA</option>
                    <option value="UCHUMAYO">UCHUMAYO</option>
                    <option value="VITOR">VITOR</option>
                    <option value="YANAHUARA">YANAHUARA</option>
                    <option value="YARABAMBA">YARABAMBA</option>
                    <option value="YURA">YURA</option>
                </select>
                <p></p>
                <input type="submit" name="accion" value="D-Buscar">
                <p></p>
                <input type="submit" name="accion" value="Volver" formaction="busqueda.jsp">
                
            </form>
        </div>
</div>

   <script src="js/jquery-3.1.1.min.js"></script>    
   <script src="js/main.js"></script>

<%@include file="/footer.jsp"%>
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class prueba_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("       <title>Glitch </title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Josefin+Sans|Montez|Pathway+Gothic+One\" rel=\"stylesheet\">\n");
      out.write(" <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write(" <link href=\"Recursos/css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("  <link  rel=\"icon\" href=\"Recursos/img/glitchlogo.ico\">\n");
      out.write("   \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("<div class=\"container-fluid\">\n");
      out.write("        <header>\n");
      out.write(" \n");
      out.write("<nav class=\"navbar  navbar-light bg-light \">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("      \n");
      out.write("      <a class=\"navbar-brand\" href=\"#\">GLITCH</a>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"collapse navbar-collapse  \" >\n");
      out.write("      <ul class=\"nav navbar-nav \">\n");
      out.write("        <li ><a  href=\"#\"><span class=\"glyphicon glyphicon-phone\"></span></a></li>\n");
      out.write("        <li><a href=\"#\"><span class=\"glyphicon glyphicon-envelope\"></span></a></li>\n");
      out.write("        <li><a href=\"#\"><span class=\"fa fa-google-plus\"></span></a></li>\n");
      out.write("        <li><a href=\"#\"><span class=\"fa fa-facebook\"></span></a></li>\n");
      out.write("      </ul>\n");
      out.write("      <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("     <form class=\"navbar-form navbar-right\" action=\"/action_page.php\">\n");
      out.write("      <div class=\"form-group\">\n");
      out.write("        <input type=\"text\" class=\"form-control\" placeholder=\"Search\">\n");
      out.write("      </div>\n");
      out.write("      <button type=\"submit\" class=\"btn btn-default\">Submit</button>\n");
      out.write("    </form>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("<br>\n");
      out.write("\n");
      out.write("\n");
      out.write("<nav class=\"navbar navbar-inverse\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("      <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>                        \n");
      out.write("      </button>\n");
      out.write("      <a class=\"navbar-brand\" href=\"#\">  INICIO</a>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("      <ul class=\"nav navbar-nav\">\n");
      out.write("        <li class=\"active\"><a href=\"#\">NOSOTROS</a></li>\n");
      out.write("        <li><a href=\"#\">JOYAS PARA ELLAS</a></li>\n");
      out.write("        <li><a href=\"#\">JOYAS PARA ELLOS</a></li>\n");
      out.write("        <li><a href=\"#\">JOYAS PARA NIÑOS</a></li>\n");
      out.write("        <li><a href=\"#\">JOYAS PARA NOVIOS</a></li>\n");
      out.write("          <li><a href=\"#\">JJOYAS PARA BEBÉ</a></li>\n");
      out.write("     \n");
      out.write("\n");
      out.write(" \n");
      out.write("\n");
      out.write("        \n");
      out.write("      </ul>\n");
      out.write("      <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("        <li><a href=\"#\"><span class=\"glyphicon glyphicon-shopping-cart\"></span> Comprar</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("                \n");
      out.write("        </header>          \n");
      out.write(" \n");
      out.write("     <br><br>\n");
      out.write("  <div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("    <!-- Indicators -->\n");
      out.write("    <ol class=\"carousel-indicators\">\n");
      out.write("      <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("      <li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\n");
      out.write("      <li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\n");
      out.write("    </ol>\n");
      out.write("\n");
      out.write("    <!-- Wrapper for slides -->\n");
      out.write("    <div class=\"carousel-inner\">\n");
      out.write("      <div class=\"item active\">\n");
      out.write("          <div align=\"center\">  <img src=\"Recursos/img/imagen1.jpeg\" alt=\"\" width=\"500\" height=\"500\"   > </div>\n");
      out.write("      </div>\n");
      out.write("        \n");
      out.write("      <div class=\"item\">\n");
      out.write("      <div align=\"center\">  <img src=\"Recursos/img/imagen4.jpeg\" alt=\"\" width=\"500\" height=\"500\"></div>\n");
      out.write("      </div>\n");
      out.write("    \n");
      out.write("      <div class=\"item\">\n");
      out.write("       <div align=\"center\"> <img src=\"Recursos/img/imagen11.jpeg\" alt=\"\" width=\"500\" height=\"500\"></div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Left and right controls -->\n");
      out.write("    <a class=\"left carousel-control\" href=\"#myCarousel\" data-slide=\"prev\">\n");
      out.write("      <span class=\"glyphicon glyphicon-chevron-left\"></span>\n");
      out.write("      <span class=\"sr-only\">Previous</span>\n");
      out.write("    </a>\n");
      out.write("    <a class=\"right carousel-control\" href=\"#myCarousel\" data-slide=\"next\">\n");
      out.write("      <span class=\"glyphicon glyphicon-chevron-right\"></span>\n");
      out.write("      <span class=\"sr-only\">Next</span>\n");
      out.write("    </a>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <br>\n");
      out.write("   \n");
      out.write("<div class=\"container\">    \n");
      out.write("  <div class=\"row\">\n");
      out.write("    <div class=\"col-sm-4\">\n");
      out.write("      <div class=\"panel panel-warning\">\n");
      out.write("        <div class=\"panel-heading\">DESCUENTO TODOS LOS DIAS</div>\n");
      out.write("        <div class=\"panel-body\"><img s src=\"Recursos/img/imagen1.jpeg\" class=\"img-responsive\" style=\"width:100%\" alt=\"Image\"></div>\n");
      out.write("        <div class=\"panel-footer\">COMPRALO YA</div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("      \n");
      out.write("    <div class=\"col-sm-4\"> \n");
      out.write("      <div class=\"panel panel-danger\">\n");
      out.write("        <div class=\"panel-heading\">DESCUENTO TODOS LOS DIAS</div>\n");
      out.write("        <div class=\"panel-body\">     <img  src=\"Recursos/img/imagen3.jpeg\" class=\"img-responsive\" style=\"width:100%\" alt=\"Image\"></div>\n");
      out.write("        <div class=\"panel-footer\">COMPRALO YA</div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("     \n");
      out.write("    <div class=\"col-sm-4\"> \n");
      out.write("      <div class=\"panel panel-warning\">\n");
      out.write("        <div class=\"panel-heading\">DESCUENTO TODOS LOS DIAS</div>\n");
      out.write("        <div class=\"panel-body\"><img src=\"Recursos/img/imagen6.jpeg\" class=\"img-responsive\" style=\"width:100%\" alt=\"Image\"></div>\n");
      out.write("        <div class=\"panel-footer\">COMPRALO YA</div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div><br>\n");
      out.write("\n");
      out.write("  \n");
      out.write("  <div class=\"container\">    \n");
      out.write("  <div class=\"row\">\n");
      out.write("    <div class=\"col-sm-4\">\n");
      out.write("      <div class=\"panel panel-warning\">\n");
      out.write("        <div class=\"panel-heading\">DESCUENTO TODOS LOS DIAS</div>\n");
      out.write("        <div class=\"panel-body\"><img src=\"Recursos/img/imagen2.jpeg\" class=\"img-responsive\" style=\"width:100%\" alt=\"Image\"></div>\n");
      out.write("        <div class=\"panel-footer\">COMPRALO YA</div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-sm-4\"> \n");
      out.write("      <div class=\"panel panel-warning\">\n");
      out.write("        <div class=\"panel-heading\">DESCUENTO TODOS LOS DIAS</div>\n");
      out.write("        <div class=\"panel-body\"><img src=\"Recursos/img/imagen5.jpeg\" class=\"img-responsive\" style=\"width:100%\" alt=\"Image\"></div>\n");
      out.write("        <div class=\"panel-footer\">COMPRALO YA</div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-sm-4\"> \n");
      out.write("      <div class=\"panel panel-warning\">\n");
      out.write("        <div class=\"panel-heading\">DESCUENTO TODOS LOS DIAS</div>\n");
      out.write("        <div class=\"panel-body\"><img src=\"Recursos/img/imagen9.jpeg\" class=\"img-responsive\" style=\"width:100%\" alt=\"Image\"></div>\n");
      out.write("        <div class=\"panel-footer\">COMPRALO YA</div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<div class=\"container-fluid\">\n");
      out.write("    <footer>\n");
      out.write("        \n");
      out.write("\n");
      out.write("        <div class=\"sociales\">\n");
      out.write("            <a href=\"\" class=\"gmail\"><i class=\"glyphicon glyphicon-envelope\"></i></a>\n");
      out.write("            <a href=\"\" class=\"facebook\"><i class=\"fa fa-facebook\"></i></a>\n");
      out.write("                <a href=\"\" class=\"telefono\"><i class=\"fa fa-phone\"></i></a>\n");
      out.write("                <a href=\"\" class=\"google\"><i class=\"fa fa-google-plus\"></i></a>\n");
      out.write("             \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("    </footer>\n");
      out.write("    \n");
      out.write("    </div>\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.4.1.slim.min.js\" integrity=\"sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\" integrity=\"sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\" integrity=\"sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://kit.fontawesome.com/d19fe367e1.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

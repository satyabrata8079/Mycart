package org.apache.jsp.Adminpage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class index2demo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <!-- Required meta tags-->\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <meta name=\"description\" content=\"au theme template\">\n");
      out.write("    \n");
      out.write("    <meta name=\"keywords\" content=\"au theme template\">\n");
      out.write("\n");
      out.write("    <!-- Title Page-->\n");
      out.write("    <title>Dashboard 2</title>\n");
      out.write("\n");
      out.write("    <!-- Fontfaces CSS-->\n");
      out.write("    <link href=\"css/font-face.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("    <link href=\"vendor/font-awesome-4.7/css/font-awesome.min.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("    <link href=\"vendor/font-awesome-5/css/fontawesome-all.min.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("    <link href=\"vendor/mdi-font/css/material-design-iconic-font.min.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("\n");
      out.write("    <!-- Bootstrap CSS-->\n");
      out.write("    <link href=\"vendor/bootstrap-4.1/bootstrap.min.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("\n");
      out.write("    <!-- Vendor CSS-->\n");
      out.write("    <link href=\"vendor/animsition/animsition.min.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("    <link href=\"vendor/bootstrap-progressbar/bootstrap-progressbar-3.3.4.min.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("    <link href=\"vendor/wow/animate.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("    <link href=\"vendor/css-hamburgers/hamburgers.min.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("    <link href=\"vendor/slick/slick.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("    <link href=\"vendor/select2/select2.min.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("    <link href=\"vendor/perfect-scrollbar/perfect-scrollbar.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("    <link href=\"vendor/vector-map/jqvmap.min.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css\" integrity=\"sha512-MV7K8+y+gLIBoVD59lQIYicR65iaqukzvf/nwasF0nqhPay5w/9lJmVM2hMDcnK1OnMGCdVK+iQrJ7lzPJQd1w==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("    <!-- Main CSS-->\n");
      out.write("    <link href=\"css/theme.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("    <!--modal-->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body class=\"animsition\">\n");
      out.write("    <div class=\"page-wrapper\">\n");
      out.write("        <!-- MENU SIDEBAR-->\n");
      out.write("        <aside class=\"menu-sidebar2\">\n");
      out.write("            <div class=\"logo\">\n");
      out.write("                <a href=\"#\">\n");
      out.write("                    <img src=\"images/icon/logo-white.png\" alt=\"Cool Admin\" />\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"menu-sidebar2__content js-scrollbar1\">\n");
      out.write("                <div class=\"account2\">\n");
      out.write("                    <div class=\"image img-cir img-120\">\n");
      out.write("                        <img src=\"images/icon/sneham.jpg\" alt=\"\" />\n");
      out.write("                    </div>\n");
      out.write("                    <h4 class=\"name\">sneha mohanty</h4>\n");
      out.write("                    <a href=\"signout.jsp\">Sign out</a>\n");
      out.write("                </div>\n");
      out.write("                <nav class=\"navbar-sidebar2\">\n");
      out.write("                    <ul class=\"list-unstyled navbar__list\">\n");
      out.write("                        <li class=\"active has-sub\">\n");
      out.write("                            <a class=\"js-arrow\" href=\"#\">\n");
      out.write("                                <i class=\"fas fa-tachometer-alt\"></i>Dashboard\n");
      out.write("                                <span class=\"arrow\">\n");
      out.write("                                    <i class=\"fas fa-angle-down\"></i>\n");
      out.write("                                </span>\n");
      out.write("                            </a>\n");
      out.write("                            <ul class=\"list-unstyled navbar__sub-list js-sub-list\">\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"index2demo.jsp\">\n");
      out.write("                                        <i class=\"fas fa-tachometer-alt\"></i>Dashboard 1</a>\n");
      out.write("                                </li>\n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                       \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </nav>\n");
      out.write("            </div>\n");
      out.write("        </aside>\n");
      out.write("        <!-- END MENU SIDEBAR-->\n");
      out.write("\n");
      out.write("        <!-- PAGE CONTAINER-->\n");
      out.write("        <div class=\"page-container2\">\n");
      out.write("            <!-- HEADER DESKTOP-->\n");
      out.write("            <header class=\"header-desktop2\">\n");
      out.write("                <div class=\"section__content section__content--p30\">\n");
      out.write("                    <div class=\"container-fluid\">\n");
      out.write("                        <div class=\"header-wrap2\">\n");
      out.write("                            <div class=\"logo d-block d-lg-none\">\n");
      out.write("                                <a href=\"#\">\n");
      out.write("                                    <img src=\"images/icon/logo-white.png\" alt=\"CoolAdmin\" />\n");
      out.write("                                </a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"header-button2\">\n");
      out.write("                                <div class=\"header-button-item js-item-menu\">\n");
      out.write("                                    <i class=\"zmdi zmdi-search\"></i>\n");
      out.write("                                    <div class=\"search-dropdown js-dropdown\">\n");
      out.write("                                        <form action=\"\">\n");
      out.write("                                            <input class=\"au-input au-input--full au-input--h65\" type=\"text\" placeholder=\"Search for datas &amp; reports...\" />\n");
      out.write("                                            <span class=\"search-dropdown__icon\">\n");
      out.write("                                                <i class=\"zmdi zmdi-search\"></i>\n");
      out.write("                                            </span>\n");
      out.write("                                        </form>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"header-button-item has-noti js-item-menu\">\n");
      out.write("                                    <i class=\"zmdi zmdi-notifications\"></i>\n");
      out.write("                                    <div class=\"notifi-dropdown js-dropdown\">\n");
      out.write("                                        <div class=\"notifi__title\">\n");
      out.write("                                            <p>You have 3 Notifications</p>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"notifi__item\">\n");
      out.write("                                            <div class=\"bg-c1 img-cir img-40\">\n");
      out.write("                                                <i class=\"zmdi zmdi-email-open\"></i>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"content\">\n");
      out.write("                                                <p>You got a email notification</p>\n");
      out.write("                                                <span class=\"date\">April 12, 2018 06:50</span>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"notifi__item\">\n");
      out.write("                                            <div class=\"bg-c2 img-cir img-40\">\n");
      out.write("                                                <i class=\"zmdi zmdi-account-box\"></i>\n");
      out.write("                                            </div>\n");
      out.write("                                            \n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"notifi__item\">\n");
      out.write("                                            <div class=\"bg-c3 img-cir img-40\">\n");
      out.write("                                                <i class=\"zmdi zmdi-file-text\"></i>\n");
      out.write("                                            </div>\n");
      out.write("                                            \n");
      out.write("                                        </div>\n");
      out.write("                                        \n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"header-button-item mr-0 js-sidebar-btn\">\n");
      out.write("                                    <i class=\"zmdi zmdi-menu\"></i>\n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </header>\n");
      out.write("            <aside class=\"menu-sidebar2 js-right-sidebar d-block d-lg-none\">\n");
      out.write("                <div class=\"logo\">\n");
      out.write("                    <a href=\"#\">\n");
      out.write("                        <img src=\"images/icon/logo-white.png\" alt=\"Cool Admin\" />\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"menu-sidebar2__content js-scrollbar2\">\n");
      out.write("                    <div class=\"account2\">\n");
      out.write("                        <div class=\"image img-cir img-120\">\n");
      out.write("                            <img src=\"images/icon/avatar-big-01.jpg\" alt=\"John Doe\" />\n");
      out.write("                        </div>\n");
      out.write("                        <h4 class=\"name\">john doe</h4>\n");
      out.write("                        <a href=\"#\">Sign out</a>\n");
      out.write("                    </div>\n");
      out.write("                    <nav class=\"navbar-sidebar2\">\n");
      out.write("                        <ul class=\"list-unstyled navbar__list\">\n");
      out.write("                            <li class=\"active has-sub\">\n");
      out.write("                                <a class=\"js-arrow\" href=\"#\">\n");
      out.write("                                    <i class=\"fas fa-tachometer-alt\"></i>Dashboard\n");
      out.write("                                    <span class=\"arrow\">\n");
      out.write("                                        <i class=\"fas fa-angle-down\"></i>\n");
      out.write("                                    </span>\n");
      out.write("                                </a>\n");
      out.write("                                <ul class=\"list-unstyled navbar__sub-list js-sub-list\">\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"indexdemo2.jsp\">\n");
      out.write("                                            <i class=\"fas fa-tachometer-alt\"></i>Dashboard 1</a>\n");
      out.write("                                    </li>\n");
      out.write("                                   \n");
      out.write("                                    \n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("                           \n");
      out.write("                            \n");
      out.write("                        </ul>\n");
      out.write("                    </nav>\n");
      out.write("                </div>\n");
      out.write("            </aside>\n");
      out.write("            <!-- END HEADER DESKTOP-->\n");
      out.write("\n");
      out.write("            <!-- BREADCRUMB-->\n");
      out.write("            <section class=\"au-breadcrumb m-t-75\">\n");
      out.write("                <div class=\"section__content section__content--p30\">\n");
      out.write("                    <div class=\"container-fluid\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-12\">\n");
      out.write("                                <div class=\"au-breadcrumb-content\">\n");
      out.write("                                    <div class=\"au-breadcrumb-left\">\n");
      out.write("                                        <span class=\"au-breadcrumb-span\">You are here:</span>\n");
      out.write("                                        <ul class=\"list-unstyled list-inline au-breadcrumb__list\">\n");
      out.write("                                            <li class=\"list-inline-item active\">\n");
      out.write("                                                <a href=\"#\">Home</a>\n");
      out.write("                                            </li>\n");
      out.write("                                            <li class=\"list-inline-item seprate\">\n");
      out.write("                                                <span>/</span>\n");
      out.write("                                            </li>\n");
      out.write("                                            <li class=\"list-inline-item\">Dashboard</li>\n");
      out.write("                                        </ul>\n");
      out.write("                                    </div>\n");
      out.write("<!--                                    <button class=\"au-btn au-btn-icon au-btn--green\" data-bs-toggle=\"modal\" data-bs-target=\"#exampleModal\">\n");
      out.write("                                        <i class=\"zmdi zmdi-plus\" ></i>add item</button>-->\n");
      out.write("                                    <button type=\"button\" class=\"au-btn au-btn-icon au-btn--green\" data-toggle=\"modal\" data-target=\"#myModal2\">\n");
      out.write("                                                <i class=\"zmdi zmdi-plus\" ></i>add category</button>\n");
      out.write("                                         <button class=\"au-btn au-btn-icon au-btn--green\" data-toggle=\"modal\" data-target=\"#myModal\">\n");
      out.write("                                        <i class=\"zmdi zmdi-plus\"></i>add product</button>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("            <!-- END BREADCRUMB-->\n");
      out.write("           \n");
      out.write("            <!--trail-->\n");
      out.write("        \n");
      out.write("<div class=\"modal fade\" id=\"myModal2\" role=\"dialog\">\n");
      out.write("    <div class=\"modal-dialog modal-lg\">\n");
      out.write("    \n");
      out.write("      <!-- Modal content-->\n");
      out.write("      <div class=\"modal-content\">\n");
      out.write("        <div class=\"modal-header\">\n");
      out.write("          <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("          \n");
      out.write("        </div>\n");
      out.write("        <div class=\"modal-body\">\n");
      out.write("            <form action=\"addcategory.jsp\" method=\"post\">\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <input type=\"text\" class=\"form-control\" name=\"cat\" placeholder=\"enter the category title\" required=\"\"/>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <textarea style=\"height: 300px\" class=\"form-control\" placeholder=\"Enter the descripation of category\" name=\"desc\"></textarea>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"container text-center\">\n");
      out.write("                <button class=\"btn btn-outline-success\">\n");
      out.write("                    Add category\n");
      out.write("                </button>\n");
      out.write("            </div>\n");
      out.write("           </form>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"modal-footer\">\n");
      out.write("          <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write(" <div class=\"modal fade\" id=\"myModal\" role=\"dialog\">\n");
      out.write("    <div class=\"modal-dialog modal-lg\">\n");
      out.write("    \n");
      out.write("      <!-- Modal content-->\n");
      out.write("      <div class=\"modal-content\">\n");
      out.write("        <div class=\"modal-header\">\n");
      out.write("          <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("          <h4 class=\"modal-title\">Modal Header</h4>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"modal-body\">\n");
      out.write("            <form action=\"AddImage2\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <input type=\"text\" class=\"form-control\" name=\"product\" placeholder=\"enter the product title\" required=\"\"/>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <input type=\"number\" class=\"form-control\" name=\"price\" placeholder=\"enter the product price\" required=\"\"/>\n");
      out.write("            </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                <input type=\"number\" class=\"form-control\" name=\"discount\" placeholder=\"enter the product discount\" required=\"\"/>\n");
      out.write("            </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                <input type=\"number\" class=\"form-control\" name=\"quantity\" placeholder=\"enter the product quantity\" required=\"\"/>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <select name=\"cat\" id=\"\" class=\"form-control\">\n");
      out.write("                        ");
 
        try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mycart?useSSL=false", "root", "root");
            PreparedStatement pst = conn.prepareStatement("select cid,categoryname from category");
            
            ResultSet rs = pst.executeQuery();
          
            while(rs.next()){
                
               
      out.write("\n");
      out.write("               <option value=\"");
      out.print(rs.getString("categoryname"));
      out.write("\" >");
      out.print(rs.getString("categoryname"));
      out.write("</option>\n");
      out.write("                        ");

//                             out.print(rs.getString("categoryname"));
                out.println();
            }
        }
        catch(Exception e){
           
        }
        
      out.write("\n");
      out.write("                        <!--<option value=\"mobile\">mobile</option>-->\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"pic\">Select the picutere of product</label>\n");
      out.write("                    <input type=\"file\" class=\"form-control\" name=\"file\" id=\"pic\" required=\"\"/>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <textarea style=\"height: 150px\" class=\"form-control\" placeholder=\"Enter the descripation of category\" name=\"desc\"></textarea>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"container text-center\">\n");
      out.write("                <button class=\"btn btn-outline-success\">\n");
      out.write("                    Add product\n");
      out.write("                </button>\n");
      out.write("            </div>\n");
      out.write("           </form>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"modal-footer\">\n");
      out.write("          <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write(" \n");
      out.write("            <!--trail end-->\n");
      out.write("            <!-- STATISTIC-->\n");
      out.write("            <section class=\"statistic\">\n");
      out.write("                <div class=\"section__content section__content--p30\">\n");
      out.write("                    <div class=\"container-fluid\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-6 col-lg-3\">\n");
      out.write("                                <div class=\"statistic__item\">\n");
      out.write("                                    <h2 class=\"number\">10,368</h2>\n");
      out.write("                                    <span class=\"desc\">members online</span>\n");
      out.write("                                    <div class=\"icon\">\n");
      out.write("                                        <i class=\"zmdi zmdi-account-o\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-6 col-lg-3\">\n");
      out.write("                                <div class=\"statistic__item\">\n");
      out.write("                                    <h2 class=\"number\">388,688</h2>\n");
      out.write("                                    <span class=\"desc\">items sold</span>\n");
      out.write("                                    <div class=\"icon\">\n");
      out.write("                                        <i class=\"zmdi zmdi-shopping-cart\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-6 col-lg-3\">\n");
      out.write("                                <div class=\"statistic__item\">\n");
      out.write("                                    <h2 class=\"number\">1,086</h2>\n");
      out.write("                                    <span class=\"desc\">this week</span>\n");
      out.write("                                    <div class=\"icon\">\n");
      out.write("                                        <i class=\"zmdi zmdi-calendar-note\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-6 col-lg-3\">\n");
      out.write("                                <div class=\"statistic__item\">\n");
      out.write("                                    <h2 class=\"number\">$1,060,386</h2>\n");
      out.write("                                    <span class=\"desc\">total earnings</span>\n");
      out.write("                                    <div class=\"icon\">\n");
      out.write("                                        <i class=\"zmdi zmdi-money\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("            <!-- END STATISTIC-->\n");
      out.write("\n");
      out.write("            <section>\n");
      out.write("                <div class=\"section__content section__content--p30\">\n");
      out.write("                    <div class=\"container-fluid\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-xl-8\">\n");
      out.write("                                <!-- RECENT REPORT 2-->\n");
      out.write("                                <table class=\"table table-bordered\">\n");
      out.write("                                   <thead>\n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t<th>ID</th>\n");
      out.write("\t\t\t\t\t\t<th>productname</th>\n");
      out.write("\t\t\t\t\t\t<th>productdesc</th>\n");
      out.write("\t\t\t\t\t\t<th>productcolprice</th>\n");
      out.write("\t\t\t\t\t\t<th>productdiscount</th>\n");
      out.write("                                                <th>category</th>\n");
      out.write("                                                <th></th>\n");
      out.write("                                                <th></th>\n");
      out.write("                                                \n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t</thead>\n");
      out.write("                                ");

                                   try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mycart?useSSL=false", "root", "root");
            PreparedStatement pst = conn.prepareStatement("select * from products");
            
            ResultSet rs = pst.executeQuery();
          
            while(rs.next()){
                
               
      out.write("\n");
      out.write("                                <tbody>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>");
      out.print( rs.getString("pid") );
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print( rs.getString("productname") );
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print( rs.getString("productdesc") );
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print( rs.getString("productcolprice") );
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print( rs.getString("productdiscount") );
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print( rs.getString("category") );
      out.write("</td>\n");
      out.write("                                        <td class=\"product_remove\"><a href=\"pdelete.jsp?d=");
      out.print( rs.getString("pid") );
      out.write("\"><i class=\"fa-sharp fa-solid fa-trash\"></i></a></td>\n");
      out.write("                                        <td><a href=\"updateproduct.jsp?r=");
      out.print( rs.getString("pid") );
      out.write("\"><i class=\"fa-solid fa-pen-to-square\"></i></a></td>\n");
      out.write("                                    </tr>\n");
      out.write("                                </tbody>\n");
      out.write("                                  ");

//                             out.print(rs.getString("categoryname"));
                
            }
        }
        catch(Exception e){
           out.print(e);
        }
        
      out.write("   \n");
      out.write("                                </table>\n");
      out.write("                                <!-- END RECENT REPORT 2             -->\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("\n");
      out.write("            \n");
      out.write("\n");
      out.write("            <section>\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-12\">\n");
      out.write("                            <div class=\"copyright\">\n");
      out.write("                                <p>Copyright by satyabrata jena and sneha mohanty</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("            <!-- END PAGE CONTAINER-->\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Jquery JS-->\n");
      out.write("    <script src=\"vendor/jquery-3.2.1.min.js\"></script>\n");
      out.write("    <!-- Bootstrap JS-->\n");
      out.write("    <script src=\"vendor/bootstrap-4.1/popper.min.js\"></script>\n");
      out.write("    <script src=\"vendor/bootstrap-4.1/bootstrap.min.js\"></script>\n");
      out.write("    <!-- Vendor JS       -->\n");
      out.write("    <script src=\"vendor/slick/slick.min.js\">\n");
      out.write("    </script>\n");
      out.write("    <script src=\"vendor/wow/wow.min.js\"></script>\n");
      out.write("    <script src=\"vendor/animsition/animsition.min.js\"></script>\n");
      out.write("    <script src=\"vendor/bootstrap-progressbar/bootstrap-progressbar.min.js\">\n");
      out.write("    </script>\n");
      out.write("    <script src=\"vendor/counter-up/jquery.waypoints.min.js\"></script>\n");
      out.write("    <script src=\"vendor/counter-up/jquery.counterup.min.js\">\n");
      out.write("    </script>\n");
      out.write("    <script src=\"vendor/circle-progress/circle-progress.min.js\"></script>\n");
      out.write("    <script src=\"vendor/perfect-scrollbar/perfect-scrollbar.js\"></script>\n");
      out.write("    <script src=\"vendor/chartjs/Chart.bundle.min.js\"></script>\n");
      out.write("    <script src=\"vendor/select2/select2.min.js\">\n");
      out.write("    </script>\n");
      out.write("    <script src=\"vendor/vector-map/jquery.vmap.js\"></script>\n");
      out.write("    <script src=\"vendor/vector-map/jquery.vmap.min.js\"></script>\n");
      out.write("    <script src=\"vendor/vector-map/jquery.vmap.sampledata.js\"></script>\n");
      out.write("    <script src=\"vendor/vector-map/jquery.vmap.world.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Main JS-->\n");
      out.write("    <script src=\"js/main.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("<!-- end document-->\n");
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

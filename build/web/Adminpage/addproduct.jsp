<%-- 
    Document   : addproduct
    Created on : 14 Nov, 2022, 11:47:14 PM
    Author     : satyabrata jena
--%>


<%@page import="java.io.InputStream"%>
<%@page import="java.io.FileOutputStream"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <% 
           
        Part file=request.getPart("file");
		
	String imageFileName=file.getSubmittedFileName();  // get selected image file name
                
	String uploadPath="C:/Users/satyabrata jena/Documents/NetBeansProjects/E_Commerce/web/images2/"+imageFileName;
        try
		{
		
		FileOutputStream fos=new FileOutputStream(uploadPath);
		InputStream is=file.getInputStream();
		
		byte[] data=new byte[is.available()];
		is.read(data);
		fos.write(data);
		fos.close();
		
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
        String product=request.getParameter("product");
        String price=request.getParameter("price");
        String discount=request.getParameter("discount");
        String quantity=request.getParameter("quantity");
//        String file=request.getParameter("file");
        String desc=request.getParameter("desc");
        int cid=1;
        
        int sts=0;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mycart?useSSL=false", "root", "root");
            PreparedStatement pst = conn.prepareStatement("insert into products(productname,productdesc,productphoto,productcolprice,productdiscount,productqt,cid)values(?,?,?,?,?,?,?)");
            pst.setString(1, product);
            pst.setString(2, desc);
            pst.setString(3,imageFileName);
            pst.setString(4, price);
            pst.setString(5, discount);
            pst.setString(6, quantity);
            pst.setInt(7, cid);
            
           
             sts = pst.executeUpdate();
             if(sts > 0){
//                 JOptionPane.showMessageDialog(null, "Your shopping bag is empty");
                 %>
                 <script>
                     alert("sucess");
                     <% response.sendRedirect("index2demo.jsp"); %>
                 </script>
                 <%
                    
             }
            else{
            out.print("error");
            }
             
//            if (sts.next()) {
//                out.println("login successful...");
////                response.sendRedirect("homepage.html");
//            } 
//            else {
//                out.println("Incorrect login credentials");
//            }
        } 
        catch (Exception e) {
//            throws new ServletException("something went wrong",e);
        out.println("Something went wrong !! Please try again"+e);
        }
        
       
        %>
    </body>
</html>

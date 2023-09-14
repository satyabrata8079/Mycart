import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import static java.lang.System.out;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import javax.swing.JOptionPane;

@MultipartConfig
@WebServlet("/AddImage")

public class AddImage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AddImage() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		Part file=request.getPart("file");
		
		String imageFileName=file.getSubmittedFileName();  // get selected image file name
		
//		String uploadPath="C:/Users/satyabrata jena/Documents/NetBeansProjects/E_Commerce/web/images2/"+imageFileName;  // upload path where we have to upload our actual image
		
		String uploadPath="C:/Users/satyabrata jena/Documents/NetBeansProjects/E_Commerce/web/userpage/assets/images/product/default/home-1/"+imageFileName;
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
		//**********************
		
		//getting database connection (jdbc code)
                String product=request.getParameter("product");
                String price=request.getParameter("price");
                String discount=request.getParameter("discount");
                String quantity=request.getParameter("quantity");
//              String file=request.getParameter("file");
                String desc=request.getParameter("desc");
                String catg=request.getParameter("cat");
                int cid=1;
		Connection connection=null;
            try 
		{
             Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mycart?useSSL=false", "root", "root");
            PreparedStatement pst = conn.prepareStatement("insert into products(productname,productdesc,productphoto,productcolprice,productdiscount,productqt,category)values(?,?,?,?,?,?,?)");
            pst.setString(1, product);
            pst.setString(2, desc);
            pst.setString(3,imageFileName);
            pst.setString(4, price);
            pst.setString(5, discount);
            pst.setString(6, quantity);
           pst.setString(7, catg);
            
           int sts=0;
            sts = pst.executeUpdate();
             if(sts > 0){
//                 JOptionPane.showMessageDialog(null, "Your shopping bag is empty");
                 response.sendRedirect("/E_Commerce/Adminpage/index2demo.jsp");
                    
             }
            else{
            out.print("error");
            }
			
			
		}
		catch (Exception e)
		{
			out.print(e);
		}
		
	}

}

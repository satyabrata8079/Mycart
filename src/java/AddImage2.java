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

@MultipartConfig
@WebServlet("/AddImage2")
public class AddImage2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AddImage2() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            System.out.println("redirected");
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
                 response.sendRedirect("example.jsp");
                    
             }
            else{
            out.print("error");
            }
			
			
		}
		catch (Exception e)
		{
			out.print(e);
		}
		

//		
//	  System.out.println("In do post method of Add Image servlet.");
//		Part file=request.getPart("image");
//		
//		String imageFileName=file.getSubmittedFileName();  // get selected image file name
//		System.out.println("Selected Image File Name : "+imageFileName);
//		
//		String uploadPath="C:/Users/Vostro.MURADALIMJ/Desktop/Youtube Tutorials/ImageTutorial/WebContent/images/"+imageFileName;  // upload path where we have to upload our actual image
//		System.out.println("Upload Path : "+uploadPath);
//		
//		// Uploading our selected image into the images folder
//		
//		try
//		{
//		
//		FileOutputStream fos=new FileOutputStream(uploadPath);
//		InputStream is=file.getInputStream();
//		
//		byte[] data=new byte[is.available()];
//		is.read(data);
//		fos.write(data);
//		fos.close();
//		
//		}
//		
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
//		//**********************
//		
//		//getting database connection (jdbc code)
//		Connection connection=null;
//		try 
//		{
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/imageTutorial","root","your password");
//			PreparedStatement stmt;
//			String query="insert into image(imageFileName) values(?)";
//			stmt=connection.prepareStatement(query);
//			stmt.setString(1,imageFileName);
//			int row=stmt.executeUpdate(); // it returns no of rows affected.
//			
//			if(row>0)
//			{
//				System.out.println("Image added into database successfully.");
//			}
//			
//			else
//			{
//				System.out.println("Failed to upload image.");
//			}
//			
//			
//		}
//		catch (Exception e)
//		{
//			System.out.println(e);
//		}
//		
	}

}
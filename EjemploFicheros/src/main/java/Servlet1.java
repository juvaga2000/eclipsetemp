

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Servlet1
 */
@MultipartConfig(fileSizeThreshold = 1024*1024*10,
		maxFileSize = 1024*1024*50,
		maxRequestSize = 1024*1024*100)

public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String UPLOAD_DIR="uploads";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet1() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String appPath = getServletContext().getRealPath("");
		
		String uploadFilePath = appPath + UPLOAD_DIR;
		PrintWriter out = response.getWriter();
		
		File fileSaveDir = new File(uploadFilePath);
		if(!fileSaveDir.exists()) {
			fileSaveDir.mkdirs();
		}
		out.println("Directorio subida = "+fileSaveDir.getAbsolutePath());
		String fileName;
		
		for(Part p : request.getParts()) {
			if(p.getName().equals("fichero")) {
				fileName=getFileName(p);
				System.out.println(uploadFilePath+File.separator+fileName);
				p.write(uploadFilePath + File.separator + fileName);
				out.println("Fichero subido");
			}
		}
	}

	private String getFileName(Part p) {
		String fileName="";
		String contentDisp=p.getHeader("content-disposition");
		System.out.println("content-disposition header = "+contentDisp);
		String[] tokens=contentDisp.split(";");
		for (String token : tokens) {
			if(token.trim().startsWith("filename")) {
				if(token.contains("\\")) {
					fileName=token.substring(token.lastIndexOf("\\")+1,token.length()-1);
				}else {
					fileName=token.substring(token.lastIndexOf("=")+2,token.length()-1);
				}
			}
		}
		return fileName;
	}
}

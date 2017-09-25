package com.dd;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.omg.CORBA.portable.OutputStream;


@WebServlet(urlPatterns="/Upload.do")
@MultipartConfig(fileSizeThreshold =5_242_880,    
maxFileSize =20_971_520L,
maxRequestSize =41_943-040L
)
public class Uploadervlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Uploadervlet() {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          Part filePart = request.getPart("file");
          InputStream inputStream = filePart.getInputStream();
          FileOutputStream outputStream = new FileOutputStream("C:\\Users\\Master\\ddd"+filePart.getSubmittedFileName());
          
          int read;
          final byte[] bytes =new byte[1024];
          
          while ((read = inputStream.read(bytes)) != -1) {
        	  outputStream.write(bytes,0,read);
          }
        		  outputStream.flush();
        		  outputStream.close();
          
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

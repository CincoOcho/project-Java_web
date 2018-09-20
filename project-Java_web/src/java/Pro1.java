/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Serv
 */
@WebServlet(urlPatterns = {"/Pro1"})
public class Pro1 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Pro1</title>");            
            out.println("</head>");
            out.println("<body>");
            

            out.println("<form action='http://localhost:8080/project-Java_web/Pro1' method='post'>");
            out.println("<input type='text' name='n1'>");
            out.println("<input type='text' name='n2'>");
            out.println("<input type='submit'>");
            
            
           
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        PrintWriter out = response.getWriter();
        
        
           int num1,num2;
           num1= Integer.parseInt(request.getParameter("n1"));
           num2= Integer.parseInt(request.getParameter("n2"));
            
           out.println("<table border='1'>");
           int resultado=num1*num2;
           
           for(int i=1;i<=num1;i++)
           {
           
            out.println("<tr>");
               for(int j=1; j<=num2;j++)
               {
                   out.println("<th>");
                   out.println("<h1>"+i*j+"</h1>");
               
               }
           
                    
           }
           out.println("</table>");
           
    }

   
    
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

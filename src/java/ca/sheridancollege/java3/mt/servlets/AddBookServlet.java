package ca.sheridancollege.java3.mt.servlets;

import ca.sheridancollege.java3.mt.Textbook;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ca.sheridancollege.java3.mt.Subject;
import ca.sheridancollege.java3.mt.Textbook;

public class AddBookServlet extends HttpServlet {

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
        
        // Get the form inputs.
        String title = request.getParameter("title");
        String stringPrice = request.getParameter("price");
        double price;
        String stringSubject = request.getParameter("lstSubject");
        Subject subject = null;
        String errors = "";
        Textbook textbook = null;
        
        // Check for validation.
        // Ensure that title is not null or empty, 
        // ensure that price is not null or empty
        // ensure that there is a valid selection from the list.
        if (title == null || title.trim().isEmpty()) {
            errors += "Textbook title can't be empty.<br>";
        } 
        if (stringPrice== null || stringPrice.trim().isEmpty()) {
            errors += "Price can't be empty.<br>";
        }
        if (stringSubject == null || stringSubject.trim().isEmpty()) {
            errors += "You must select a subject.<br>";
        }
        
        if (errors.isEmpty()) {
            // If there are no errors, create a Textbook object.
            price = Double.parseDouble(stringPrice);
            subject = Subject.valueOf(stringSubject);
            textbook = new Textbook(title, price, subject);  
            // Store the textbook in a request attribute called "textbook".
            request.setAttribute("textbook", textbook);
            // Forward to your output.jsp page.
            request.getRequestDispatcher("output.jsp").forward(request, response);
        }
        else {
            // Otherwise, if there are errors, wrap them in a ServletException.
            throw new ServletException(errors);
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
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

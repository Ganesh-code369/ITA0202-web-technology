
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegistrationServlet extends HttpServlet {

    protected void doPost(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");
        String registerNo = request.getParameter("registerNo");
        String email = request.getParameter("email");
        String department = request.getParameter("department");
        String semester = request.getParameter("semester");

        if (name == null || name.trim().isEmpty()
                || registerNo == null || registerNo.trim().isEmpty()
                || email == null || email.trim().isEmpty()
                || department == null || department.isEmpty()
                || semester == null || semester.isEmpty()) {

            out.println("<h2>Please fill all the fields!</h2>");
            out.println("<a href='registration.html'>Go Back</a>");

        } else {

            out.println("<html>");
            out.println("<head><title>Registration Details</title></head>");

            out.println("<body style='font-family:Arial; text-align:center;'>");

            out.println("<h1>Student Registration Successful!</h1>");

            out.println("<h3>Submitted Details</h3>");

            out.println("<p><b>Student Name:</b> " + name + "</p>");

            out.println("<p><b>Register Number:</b> "
                    + registerNo + "</p>");

            out.println("<p><b>Email:</b> " + email + "</p>");

            out.println("<p><b>Department:</b> "
                    + department + "</p>");

            out.println("<p><b>Semester:</b> "
                    + semester + "</p>");

            out.println("</body>");
            out.println("</html>");
        }
    }
}

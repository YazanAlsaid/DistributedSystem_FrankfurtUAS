package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Account;
import model.Entry;

@WebServlet("/changeEntry")
public class ChangeEntryServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        // Retrieve form data
        String entryName = request.getParameter("entryName");
        double newAmount = Double.parseDouble(request.getParameter("newAmount"));
        // Retrieve the Account object from the session
        // Account account = SessionMana.getAccount(request);

        // Change the amount of the specified entry in the Account
        if (account != null) {
            Entry entry = account.getEntryName(entryName);
            if (entry != null) {
                entry.setAmount(newAmount);
            }
        }
    }
}
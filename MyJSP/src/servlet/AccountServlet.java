package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Account;

import java.io.IOException;

@WebServlet("/createAccount")
public class AccountServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve form data
        String accountName = request.getParameter("accountName"); // the accountName from addEntry.jsp --> input ---> name="accountName"
        // Create an Account object with the provided account name
        Account account = new Account(accountName);
        // Set the account object as an attribute in the request
        request.setAttribute("account", account);
    }
}

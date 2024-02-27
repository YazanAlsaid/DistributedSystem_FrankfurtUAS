package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.Account;

import java.io.IOException;
import java.util.List;


@WebServlet("/session")
public class SessionServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        doPost(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        HttpSession session = request.getSession();

        // Check if an account selection has been made
        String accountName = request.getParameter("accountName");
        if (accountName != null) {
            // Retrieve the list of accounts from the session
            List<Account> accounts = (List<Account>) session.getAttribute("accounts");

            // Find the selected account by name
            Account selectedAccount = null;
            for (Account account : accounts) {
                if (account.getName().equals(accountName)) {
                    selectedAccount = account;
                    break;
                }
            }

            // Store the selected account in the session
            session.setAttribute("selectedAccount", selectedAccount);
        }

        // Check if changing the account
        String changeAccount = request.getParameter("changeAccount");
        if (changeAccount != null && changeAccount.equals("true")) {
            // Clear the selected account from the session
            session.removeAttribute("selectedAccount");
        }

        // Redirect the user to the appropriate page
        response.sendRedirect("accountSelection.jsp");
    }
}


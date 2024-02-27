package servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.Account;
import model.Entry;

import java.time.LocalDate;

@WebServlet("/addEntry")
public class AddEntryServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        // Retrieve form data
        String accountName = request.getParameter("accountName");
        String entryName = request.getParameter("entryName");
        double amount = Double.parseDouble(request.getParameter("amount"));
        // Assuming the date is submitted as a string in the format "yyyy-MM-dd"
        LocalDate date = LocalDate.parse(request.getParameter("date"));
        // Create an Entry object with the provided data
        Entry entry = new Entry(entryName, amount, date);
        // Retrieve the Account object from the session or create a new one
        HttpSession session = request.getSession();
        Account account = (Account) session.getAttribute("account");
        if (account == null) {
            account = new Account(accountName);
            session.setAttribute("account", account);
        }
    }
}

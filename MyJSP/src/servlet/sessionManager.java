package servlet;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import model.Account;

public class sessionManager {
    private static final String ACCOUNT_SESSION_ATTRIBUTE = "account";
    public static HttpSession getSession(HttpServletRequest request) {
        return request.getSession();
    }

    public static Account getAccount(HttpServletRequest request) {
        HttpSession session = getSession(request);
        return (Account) session.getAttribute(ACCOUNT_SESSION_ATTRIBUTE);
    }

    public static void setAccount(HttpServletRequest request, Account account) {
        HttpSession session = getSession(request);
        session.setAttribute(ACCOUNT_SESSION_ATTRIBUTE, account);
    }

    public static void removeAccount(HttpServletRequest request) {
        HttpSession session = getSession(request);
        session.removeAttribute(ACCOUNT_SESSION_ATTRIBUTE);
    }
}

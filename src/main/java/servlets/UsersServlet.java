package servlets;

import accounts.AccountService;
import accounts.UserProfile;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author v.chibrikov
 *         <p>
 *         Пример кода для курса на https://stepic.org/
 *         <p>
 *         Описание курса и лицензия: https://github.com/vitaly-chibrikov/stepic_java_webserver
 */
public class UsersServlet extends HttpServlet {

    private final AccountService accountService;

    public UsersServlet(AccountService accountService) {
        this.accountService = accountService;
    }


   public void doGet(HttpServletRequest request,
                      HttpServletResponse response) throws ServletException, IOException {

            response.setContentType("text/html;charset=utf-8");
            response.getWriter().println("вы зарегистрированы");
            response.setStatus(HttpServletResponse.SC_OK);

    }


    public void doPost(HttpServletRequest request,
                       HttpServletResponse response) throws ServletException, IOException {
        String login = request.getParameter("login");
        String pass = request.getParameter("pass");

        if (accountService.getUserByLogin(login)==null) {
            accountService.addNewUser(new UserProfile(login, pass));


            response.setContentType("text/html;charset=utf-8");
            response.getWriter().println("Вы зарегистрированы");
            response.setStatus(HttpServletResponse.SC_OK);
        } else {
            response.setContentType("text/html;charset=utf-8");
            response.getWriter().println("Имя занято");
            response.setStatus(HttpServletResponse.SC_OK);
        }
    }





}



package controller;

import repository.UserDAO;
import model.User;
import service.IUserService;
import service.UserService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "UserServlet", value = "/users")
public class UserServlet extends HttpServlet {

    private static IUserService iUserService = new UserService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createUser(request,response);
                break;
            case "edit":
                updateUsers(request,response);
                break;
            case "delete":
                deleteUser(request,response);
            case "search":
                searchUser(request,response);
            case "sort":
                sortByNameUser(request,response);
            default:
                break;
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }

        switch (action) {
            case "create":
                createForm(request,response);
                break;
            case "edit":
                updateForm(request,response);
                break;
            default:
                listUser(request, response);
                break;
        }

    }

    private void listUser(HttpServletRequest request, HttpServletResponse response) {
        List<User> listUser = iUserService.findAll();
        request.setAttribute("listUser", listUser);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/view/list.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void createUser(HttpServletRequest request, HttpServletResponse response){
//    int id = Integer.parseInt(request.getParameter("id"));
    String name = request.getParameter("name");
    String email = request.getParameter("email");
    String country = request.getParameter("country");
    User user = new User(name,email,country);
    iUserService.create(user);
        try {
            response.sendRedirect("/users");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void createForm(HttpServletRequest request, HttpServletResponse response){
        try {
            request.getRequestDispatcher("/view/create.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void updateUsers(HttpServletRequest request, HttpServletResponse response){
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String country = request.getParameter("country");
        int id = Integer.parseInt(request.getParameter("id"));

        User user = iUserService.findById(id);
            user.setName(name);
            user.setEmail(email);
            user.setCountry(country);
            iUserService.update(user);
            try {
                response.sendRedirect("/users");
            } catch (IOException e) {
                e.printStackTrace();
            }
    }

    private void updateForm(HttpServletRequest request, HttpServletResponse response){
    int id = Integer.parseInt(request.getParameter("id"));
    User user = iUserService.findById(id);
    request.setAttribute("user",user);
        try {
            request.getRequestDispatcher("/view/edit.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void deleteUser(HttpServletRequest request, HttpServletResponse response){
        int id = Integer.parseInt(request.getParameter("deleteId"));
        iUserService.delete(id);
        try {
            response.sendRedirect("/users");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void searchUser(HttpServletRequest request, HttpServletResponse response){
        String country = request.getParameter("country");
        List<User> userList = iUserService.search(country);
        request.setAttribute("userList" , userList);
        try {
            request.getRequestDispatcher("/view/search.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void sortByNameUser(HttpServletRequest request, HttpServletResponse response) {
        List<User> userList = iUserService.sort();
        request.setAttribute("userList", userList);
            try {
                request.getRequestDispatcher("view/sort.jsp").forward(request, response);
            } catch (ServletException | IOException e) {
                e.printStackTrace();
            }
        }
}

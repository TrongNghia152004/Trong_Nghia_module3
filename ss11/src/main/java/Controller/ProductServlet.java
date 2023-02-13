package Controller;

import Model.Product;
import Service.IProductService;
import Service.ProductService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet" , value = "/product")
public class ProductServlet extends HttpServlet {
    private IProductService iProductService = new ProductService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String actionUser = request.getParameter("actionUser");
        if (actionUser == null) {
            actionUser = "";
        }
        switch (actionUser) {
            case "create":
                request.getRequestDispatcher("/View/product/create.jps");
                break;
            default:
                request.setAttribute("productList", iProductService);
                request.getRequestDispatcher("/View/product/index.jsp");
//                int idProduct = Integer.parseInt(request.getParameter("idProduct"));
//                String nameProduct = request.getParameter("nameProduct");
//                int priceProduct = Integer.parseInt(request.getParameter("priceProduct"));
//                String describeProduct = request.getParameter("describeProduct");
//                String producer = request.getParameter("producer");
//                Product product = new Product(idProduct, nameProduct, priceProduct, describeProduct, producer);
//                iProductService.save(product);
//                response.sendRedirect("/product");

        }
    }
}

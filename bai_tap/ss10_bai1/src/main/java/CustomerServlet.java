import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet" , value = "/customer")
public class CustomerServlet extends HttpServlet {
    private List<Customer> customerList = new ArrayList<>();
    public void init(){
        customerList.add(new Customer(1, "Mai Văn Hoàn" , "1983-08-20" , "Hà Nội" , "https://cdn.24h.com.vn/upload/4-2021/images/2021-10-30/Thien-than-phim-18--dau-gia-anh-nong-fan-do-xo-gianh-giat-chiec-ve-yua-mikami--1--1635606665-682-width660height825.jpg"));
        customerList.add(new Customer(1, "Nguyễn Văn Nam" , "1983-08-21" , "Bắc Giang" , "https://cdn.24h.com.vn/upload/4-2021/images/2021-10-30/Thien-than-phim-18--dau-gia-anh-nong-fan-do-xo-gianh-giat-chiec-ve-yua-mikami--1--1635606665-682-width660height825.jpg"));
        customerList.add(new Customer(1, "Nguyễn Thái Hoà" , "1983-08-22" , "Nam Định" , "https://cdn.24h.com.vn/upload/4-2021/images/2021-10-30/Thien-than-phim-18--dau-gia-anh-nong-fan-do-xo-gianh-giat-chiec-ve-yua-mikami--1--1635606665-682-width660height825.jpg"));
        customerList.add(new Customer(1, "Trần Đăng Khoa" , "1983-08-17" , "Hà Tây" , "https://cdn.24h.com.vn/upload/4-2021/images/2021-10-30/Thien-than-phim-18--dau-gia-anh-nong-fan-do-xo-gianh-giat-chiec-ve-yua-mikami--1--1635606665-682-width660height825.jpg"));
        customerList.add(new Customer(1, "Nguyễn Đình Thi" , "1983-08-19" , "Hà Nội" , "https://cdn.24h.com.vn/upload/4-2021/images/2021-10-30/Thien-than-phim-18--dau-gia-anh-nong-fan-do-xo-gianh-giat-chiec-ve-yua-mikami--1--1635606665-682-width660height825.jpg"));
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    request.setAttribute("customerList" , customerList);
    request.getRequestDispatcher("customer.jsp").forward(request,response);
    }
}

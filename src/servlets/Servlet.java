package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet")
public class Servlet extends HttpServlet {
    @Override
    /*protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("gb2312");
        response.setContentType("text/html;charset=gb2312");
        PrintWriter out=response.getWriter();
        out.println("欢迎");
    }*/

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("gb2312");
        response.setContentType("text/html;charset=gb2312");
        String phone=request.getParameter("phone");
        int i;
        boolean flag=true;
        if(phone.length()==13){
            for(i=0;i<phone.length();i++){
                if(i==3||i==8){
                    if (phone.charAt(i)!='-'){
                        flag=false;
                    }
                }
                else{
                    if(!('0'<=phone.charAt(i)&&phone.charAt(i)<='9')){
                        flag=false;
                    }
                }
            }
        }
        else {
            flag=false;
        }
        PrintWriter out=response.getWriter();
        if(flag){
            out.println("对");
        }
        else {
            out.println("错");
        }
    }
}

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MyCalcServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
this.doGet(request,response);//在doPost里调用doGet方法
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
response.setCharacterEncoding("utf-8");
        response.setContentType("application/json");//注意现在使用的是json格式，返回也是json，应设置application/json
        int state = -1;//状态,200正常返回
        String msg="";//错误描述信息
        int sum=0;
        //1.先从前端获取参数
        String num1=request.getParameter("number1");
        String num2=request.getParameter("number2");
        //非空校验，原则：永远不要相信前端
        //注意非空的所有信息
        if(num1!=null && num2!=null &&
                !num1.equals("") && !num2.equals("")){
            // 2.进行相应的业务处理（进行相加操作）
            sum = Integer.parseInt(num1) +
                    Integer.parseInt(num2);
            state = 200;

        }else {
            msg="非法请求，参数传递不全";
        }

        //返回结果给前端
        // {"state":%d,"msg":"%s","sum":%d}
        PrintWriter writer = response.getWriter();
        writer.println(String.format("{\"state\":%d,\"msg\":\"%s\",\"sum\":%d}",
                state,msg,sum));

    }
}

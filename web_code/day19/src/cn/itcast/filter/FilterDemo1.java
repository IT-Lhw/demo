package cn.itcast.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter("/*")
public class FilterDemo1 implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("第一次打劫index.jsp。。。");
        chain.doFilter(req, resp);
        System.out.println("第二次打劫index.jsp。。。");
    }

    public void init(FilterConfig config) throws ServletException {

    }

}

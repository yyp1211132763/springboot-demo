package com.qianmi.uc.filter;/**
 * @author 叶延平[OF1643]
 * @Description:
 * @date 2018/8/18 10:27
 */

import org.springframework.core.annotation.Order;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 *
 * @author
 * @create 2018-08-18 10:27
 **/

@WebFilter(filterName = "aFilter",urlPatterns = {"/*"})
@Order(value = 2)
public class CustomFilter implements Filter{
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("初始化");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("doFilter 请求处理");

        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        System.out.println("destroy");
    }
}

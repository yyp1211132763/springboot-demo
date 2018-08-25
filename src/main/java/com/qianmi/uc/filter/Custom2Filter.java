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

@WebFilter(filterName = "bFilter",urlPatterns = {"/*"})
@Order(value = 1)
public class Custom2Filter implements Filter{
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("初始化1");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("doFilter请求处理1");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        System.out.println("destroy1");
    }
}

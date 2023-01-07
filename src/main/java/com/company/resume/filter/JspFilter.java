package com.company.resume.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(filterName = "JSPFileFilter", urlPatterns = {"*.jsp"})   //bu filterin meqsedi .jsp ile direct olaraq girirsi engellemek. ".jsp" olmadan daxil olun kardesim demis olruq
public class JspFilter implements Filter {

    public void  doFilter(ServletRequest request, ServletResponse response,
                          FilterChain chain) {
        HttpServletResponse res = (HttpServletResponse) response;
        try {
                res.sendRedirect("error?msg=not found");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void destroy() {

    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

}

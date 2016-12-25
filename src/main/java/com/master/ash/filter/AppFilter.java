package com.master.ash.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.logging.Logger;

public class AppFilter implements Filter {

    private static final Logger logger = Logger.getLogger(AppFilter.class.getSimpleName());

    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        String requestUrl = ((HttpServletRequest) req).getRequestURI();
        logger.info(requestUrl);
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {
        logger.info(this.getClass().getSimpleName() + " initialized");
    }

}
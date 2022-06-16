package com.gc.security.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
@Slf4j
public class LoginFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request,
                                    HttpServletResponse response,
                                    FilterChain filterChain)
            throws ServletException, IOException {
        response.setContentType("application/json;charset=utf-8");
        //如果是 登录请求 post 则执行 post /login
        if ((request.getMethod().equalsIgnoreCase("post") &&
                request.getRequestURI().endsWith("/login"))) {
        }
        filterChain.doFilter(request, response);
    }
}

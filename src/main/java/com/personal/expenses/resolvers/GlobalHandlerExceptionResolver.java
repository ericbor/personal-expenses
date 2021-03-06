package com.personal.expenses.resolvers;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class GlobalHandlerExceptionResolver implements HandlerExceptionResolver {



    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception e){

        System.out.println("ENTER EXCEPTION RESOLVER");

        ModelAndView model = new ModelAndView();
        model.setViewName("exception");

        return model;
    }
}

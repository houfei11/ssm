package com.imooc.controller;

import com.imooc.entity.Personal;
import com.imooc.service.PersonalService;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PersonalController implements Controller {

    private PersonalService personalService;

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

        String stuId = request.getParameter("stuId");
        Integer stu = Integer.valueOf(stuId);
        Personal personal = new Personal();
        personal.setStuId(stu);

        personalService.selectAdd(personal);

        return new ModelAndView("/index.jsp");
    }

    public PersonalService getPersonalService() {
        return personalService;
    }

    public void setPersonalService(PersonalService personalService) {
        this.personalService = personalService;
    }
}

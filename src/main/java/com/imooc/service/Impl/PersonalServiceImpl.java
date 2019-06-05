package com.imooc.service.Impl;

import com.imooc.dao.IPersonal;
import com.imooc.entity.Personal;
import com.imooc.service.PersonalService;

public class PersonalServiceImpl implements PersonalService {

    private IPersonal iPersonal;

    @Override
    public void selectAdd(Personal personal) {

    }

    public IPersonal getiPersonal() {
        return iPersonal;
    }

    public void setiPersonal(IPersonal iPersonal) {
        this.iPersonal = iPersonal;
    }
}

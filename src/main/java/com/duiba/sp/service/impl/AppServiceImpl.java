package com.duiba.sp.service.impl;

import com.duiba.sp.dao.AppDao;
import com.duiba.sp.entity.AppEntity;
import com.duiba.sp.service.AppService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AppServiceImpl implements AppService {

    @Resource
    private AppDao appDao;
    @Override
    public List<AppEntity> getAllApps() {
        return appDao.selectApp();
    }
}

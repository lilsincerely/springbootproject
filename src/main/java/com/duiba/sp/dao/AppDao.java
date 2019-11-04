package com.duiba.sp.dao;

import com.duiba.sp.entity.AppEntity;

import java.util.List;

public interface AppDao {
    List<AppEntity> selectApp();
}

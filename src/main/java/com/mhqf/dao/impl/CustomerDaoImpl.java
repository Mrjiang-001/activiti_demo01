package com.mhqf.dao.impl;

import com.mhqf.dao.CustomerDao;

/**
 * @author mhqf
 * @version 1.0
 * @date 2021/5/28 23:32
 */
public class CustomerDaoImpl implements CustomerDao {
    @Override
    public void add() {
        System.out.println("添加客户...");
    }

    @Override
    public void update() {
        System.out.println("修改客户...");
    }

    @Override
    public void delete() {
        System.out.println("删除客户...");
    }

    @Override
    public void find() {
        System.out.println("修改客户...");
    }
}

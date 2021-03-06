package com.spring.cloud.client.admin.controller.service.impl;

import com.spring.cloud.client.admin.controller.service.UserService;
import com.spring.cloud.client.admin.controller.service.dataservice.UserDataService;
import com.spring.cloud.common.po.UserWithBLOBs;
import com.spring.cloud.common.vo.PageBean;
import com.spring.cloud.common.vo.PageResult;
import com.spring.cloud.common.vo.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @version 1.0
 * @description：
 * @author: Yang.Chang
 * @project: cloud
 * @package: com.spring.cloud.client.admin.controller.service.impl、
 * @email: cy880708@163.com
 * @date: 2018/12/3 下午6:33
 * @mofified By:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDataService userDataService;

    @Override
    public String insertUser(UserRole userRole) {
        // TODO 这里可以做客户端的逻辑处理
        return userDataService.insertUser(userRole);
    }

    @Override
    public String deleteUser(UserRole userRole) {
        // TODO 这里可以做客户端的逻辑处理
        return userDataService.deleteUser(userRole);
    }

    @Override
    public String updateUser(UserRole userRole) {
        // TODO 这里可以做客户端的逻辑处理
        return userDataService.updateUser(userRole);
    }

    @Override
    public UserWithBLOBs selectUser(UserRole userRole) {
        // TODO 这里可以做客户端的逻辑处理
        return userDataService.selectUser(userRole);
    }

    @Override
    public PageResult<UserWithBLOBs> selectUsers(UserRole userRole, PageBean pageBean) {
        // TODO 这里可以做客户端的逻辑处理
        return userDataService.selectUsers(userRole, pageBean);
    }


}

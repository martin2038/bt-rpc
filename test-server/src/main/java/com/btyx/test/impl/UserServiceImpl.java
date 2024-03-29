/**
 * Martin.Cong
 * Copyright (c) 2021-2021 All Rights Reserved.
 */
package com.btyx.test.impl;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

import com.bt.model.PagedList;
import com.bt.model.PagedQuery;
import com.bt.rpc.server.Filters;
import com.bt.rpc.model.RpcResult;
import com.btyx.test.UserService;
import com.btyx.test.convert.UserConvert;
import com.btyx.test.dto.User;
import com.btyx.test.filter.TestFilter2;
import com.btyx.test.mapper.UserMapper;
import io.quarkus.runtime.Startup;

/**
 *
 * @author Martin.C
 * @version 2021/10/27 10:55 AM
 */
@ApplicationScoped
@Startup
@Filters(TestFilter2.class)
public class UserServiceImpl implements UserService {

    @Inject //by the ext
    UserMapper userMapper;

    @Inject
    UserConvert userConvert;



    @Override
    public RpcResult<User> getUser(Integer id) {
        return RpcResult.ok(userMapper.getUser(id));
    }


    @Override
    public RpcResult<PagedList<User>> listUser(PagedQuery<User> query) {
        //var list = Mappers.pager(query.getPage(), query.getPageSize(), query.getQ(), userMapper::listBy);
        //return RpcResult.ok(list);
        var list  = userConvert.pager(query,userMapper::listBy);


        //var pl = ((PageQueryHelper<User>) dto -> {
        //    var map = new HashMap<String,Object>();
        //    return map;
        //});

        //var pl = PagedQueryHelper.pager(query,
        //        //map,//
        //        (dto,m) -> m.put("name",dto.getName()),
        //        userMapper::listBy);

        //var bounds = DbBounds.fromPage(query.getPage(), query.getPageSize());
        //var qMap = userConvert.toQuery(query.getQ());
        //System.out.println(qMap);
        //var list = userMapper.listBy(new HashMap<>(), bounds);
        //HACK , this call rewrite count to bounds
        //var pl = new  PagedList<>(bounds.getCount(), list);

        return RpcResult.ok(list);
    }

    @Override
    @Transactional//(REQUIRED) (default):
    public RpcResult<Integer> saveUser(User u) {
        var del = userMapper.remove(u.getId());
        System.out.println("del : " + del);
        var id = userMapper.save(u.getId(),u.getName());
        return RpcResult.ok(id);
    }

}
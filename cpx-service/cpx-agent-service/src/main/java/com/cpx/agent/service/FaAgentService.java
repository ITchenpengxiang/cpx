package com.cpx.agent.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cpx.agent.domain.FaAgent;
public interface FaAgentService extends IService<FaAgent> {


    int deleteByPrimaryKey(String id);

    int insert(FaAgent record);

    int insertSelective(FaAgent record);

    FaAgent selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(FaAgent record);

    int updateByPrimaryKey(FaAgent record);

}

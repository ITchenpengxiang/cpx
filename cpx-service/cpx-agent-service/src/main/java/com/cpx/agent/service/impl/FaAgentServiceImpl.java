package com.cpx.agent.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.cpx.agent.mapper.FaAgentMapper;
import com.cpx.agent.domain.FaAgent;
import com.cpx.agent.service.FaAgentService;
@Service
public class FaAgentServiceImpl extends ServiceImpl<FaAgentMapper,FaAgent> implements FaAgentService{

    @Autowired
    private FaAgentMapper faAgentMapper;

    @Override
    public int deleteByPrimaryKey(String id) {
        return faAgentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(FaAgent record) {
        return faAgentMapper.insert(record);
    }

    @Override
    public int insertSelective(FaAgent record) {
        return faAgentMapper.insertSelective(record);
    }

    @Override
    public FaAgent selectByPrimaryKey(String id) {
        return faAgentMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(FaAgent record) {
        return faAgentMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(FaAgent record) {
        return faAgentMapper.updateByPrimaryKey(record);
    }

}

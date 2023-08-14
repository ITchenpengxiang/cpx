package com.cpx.agent.controller;

import com.alibaba.fastjson.JSON;
import com.cpx.agent.domain.FaAgent;
import com.cpx.agent.service.FaAgentService;
import com.cpx.agent.service.impl.FaAgentServiceImpl;

import com.cpx.common.redis.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (fa_agent)表控制层
 *
 * @author xxxxx
 */
@RestController
@RequestMapping("/faAgent")
public class FaAgentController {
    /**
     * 服务对象
     */
    @Autowired
    private FaAgentService faAgentService;
    @Autowired
    private RedisService redisService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/selectOneById/{id}")
    public FaAgent selectOne(@PathVariable("id") String id) {
        FaAgent faAgent = faAgentService.getById(id);
        redisService.set("CPX_AGENT", JSON.toJSONString(faAgent));
        return faAgent;
    }




}

package com.cpx.agent.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cpx.agent.domain.FaAgent;
import org.apache.ibatis.annotations.Mapper;

/**
 * 代理人信息表
 * @author chenpengxiang
 */
@Mapper
public interface FaAgentMapper extends BaseMapper<FaAgent> {
    /**
     * delete by primary key
     * @param id primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(String id);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(FaAgent record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(FaAgent record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    FaAgent selectByPrimaryKey(String id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(FaAgent record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(FaAgent record);
}
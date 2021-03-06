package com.cherry.framework.dao;

import com.cherry.framework.model.ResourceEntity;
import java.util.List;

public interface ResourceEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fr_resource
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fr_resource
     *
     * @mbggenerated
     */
    int insert(ResourceEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fr_resource
     *
     * @mbggenerated
     */
    ResourceEntity selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fr_resource
     *
     * @mbggenerated
     */
    List<ResourceEntity> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fr_resource
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ResourceEntity record);

    /**
     * 根据用户id查询资源权限列表
     *
     * @param userId
     * @return
     */
    List<ResourceEntity> findResourceListByUserId(int userId);
}
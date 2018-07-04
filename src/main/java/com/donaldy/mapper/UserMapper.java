package com.donaldy.mapper;

import com.donaldy.model.User;
import org.apache.ibatis.annotations.Param;

/**
 * Created by DonaldY on 2018/7/4.
 */
public interface UserMapper {
    
    User findByUsername(@Param("username") String username) ;
}

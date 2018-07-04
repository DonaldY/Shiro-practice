package com.donaldy.service;

import com.donaldy.model.User;
import org.springframework.stereotype.Service;

/**
 * Created by DonaldY on 2018/7/4.
 */
@Service
public interface UserService {
    
    User findByUsername(String username);
}

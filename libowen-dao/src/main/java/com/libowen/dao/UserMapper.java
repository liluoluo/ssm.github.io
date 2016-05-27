package com.libowen.dao;

import com.libowen.model.UserDTO;

public interface UserMapper {
    
    UserDTO joinLogin(UserDTO dto);
}
package com.brainmentors.kbc.model.user;

import com.brainmentors.kbc.dto.user.UserDTO;

public class UserOperations {
         public boolean isAuth(UserDTO userDTO){
			
        	 return userDTO.getUserid().equals(userDTO.getPassword());
        	 
         }
}

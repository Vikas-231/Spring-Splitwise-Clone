package com.splitwise.clone.mapper;

import org.mapstruct.Mapper;

import com.splitwise.clone.entity.UserEntity;
import com.splitwise.clone.model.UserVo;
import com.splitwise.clone.vo.UserRequestVo;

@Mapper(componentModel = "spring")
public interface UserMapper {

	UserEntity toUserEntity(UserRequestVo userRequestVo);

	UserVo toUserVo(UserEntity userEntity);

}

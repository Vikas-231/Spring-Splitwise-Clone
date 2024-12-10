package com.splitwise.clone.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.splitwise.clone.entity.UserEntity;
import com.splitwise.clone.model.UserVo;
import com.splitwise.clone.vo.UserRequestVo;

@Mapper(componentModel = "spring")
public interface UserMapper {
	
	UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

	UserEntity toUserEntity(UserRequestVo userRequestVo);

	UserVo toUserVo(UserEntity userEntity);

}

package cn.ecust.matchbackend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.ecust.matchbackend.entity.User;
import cn.ecust.matchbackend.service.UserService;
import cn.ecust.matchbackend.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author chris
* @description 针对表【user(用户)】的数据库操作Service实现
* @createDate 2023-03-07 15:32:21
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}





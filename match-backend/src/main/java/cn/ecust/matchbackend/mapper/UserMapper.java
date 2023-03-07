package cn.ecust.matchbackend.mapper;

import cn.ecust.matchbackend.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author chris
 * @description 针对表【user(用户)】的数据库操作Mapper
 * @createDate 2023-03-07 15:58:02
 * @Entity cn.ecust.matchbackend.entity.User
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}






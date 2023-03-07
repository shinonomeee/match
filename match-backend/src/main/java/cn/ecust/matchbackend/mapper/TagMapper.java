package cn.ecust.matchbackend.mapper;

import cn.ecust.matchbackend.entity.Tag;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author chris
* @description 针对表【tag(标签)】的数据库操作Mapper
* @createDate 2023-03-07 15:16:47
* @Entity generator.entity.Tag
*/
@Mapper
public interface TagMapper extends BaseMapper<Tag> {

}





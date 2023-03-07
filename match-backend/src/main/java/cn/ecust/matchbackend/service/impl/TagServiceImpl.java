package cn.ecust.matchbackend.service.impl;

import cn.ecust.matchbackend.entity.Tag;
import cn.ecust.matchbackend.mapper.TagMapper;
import cn.ecust.matchbackend.service.TagService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
* @author chris
* @description 针对表【tag(标签)】的数据库操作Service实现
* @createDate 2023-03-07 15:16:47
*/
@Service
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag>
    implements TagService {

}





package cn.msw.demo.mapper;

import cn.msw.demo.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author moshuowen@outlook.com
 * @date 2022/7/3 15:47
 * @version 1.0
 */
@Repository
@Mapper
public interface UserMapper extends BaseMapper<User> {
}

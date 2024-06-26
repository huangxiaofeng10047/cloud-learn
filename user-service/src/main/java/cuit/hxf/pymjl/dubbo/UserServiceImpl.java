package cuit.hxf.pymjl.dubbo;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cuit.hxf.pymjl.entity.User;
import cuit.hxf.pymjl.service.UserService;
import cuit.hxf.pymjl.mapper.UserMapper;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Pymjl
 * @version 1.0
 * @date 2022/8/27 0:50
 **/
@DubboService
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    private static final AtomicInteger ATOMIC_INTEGER = new AtomicInteger(0);
    
    @Override
    public void register() {
        User user = new User();
        user.setUsername("pymjl@" + ATOMIC_INTEGER.incrementAndGet());
        user.setPassword("123456");
        user.setPhone("1231234214124");
        user.setPhone2("123123");
        user.setEmail("pymjl@" + ATOMIC_INTEGER.incrementAndGet() + ".com");
        baseMapper.insert(user);
    }
    
    @Override
    public User get(Long id) {
        return baseMapper.selectById(id);
    }
}

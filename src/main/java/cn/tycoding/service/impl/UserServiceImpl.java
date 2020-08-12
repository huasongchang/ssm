package cn.tycoding.service.impl;

import cn.tycoding.mapper.UserMapper;
import cn.tycoding.pojo.Customer;
import cn.tycoding.pojo.PageBean;
import cn.tycoding.pojo.User;
import cn.tycoding.service.UserService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author tycoding
 * @date 18-4-7下午9:09
 */
@Service
public class UserServiceImpl implements UserService {

    //注入
    @Autowired
    private UserMapper userMapper;

    public void create(User user) {
        userMapper.create(user);
    }

    public void delete(Long id) {
        userMapper.delete(id);
    }

    public List<User> findAll() {
        return null;
    }

    public User findById(Long id) {
        return userMapper.findById(id);
    }

    public void update(User user) {
        userMapper.update(user);
    }

    /**
     * 分页查询-条件查询方法
     *
     * @param User 查询条件
     * @param pageCode 当前页
     * @param pageSize 每页的记录数
     * @return
     */
    public PageBean findByPage(User user, int pageCode, int pageSize) {
        //使用Mybatis分页插件
        PageHelper.startPage(pageCode, pageSize);

        //调用分页查询方法，其实就是查询所有数据，mybatis自动帮我们进行分页计算
        Page<User> page = userMapper.findByPage(user);

        return new PageBean(pageCode, (int)Math.ceil((double)(page.getTotal() / (double)pageSize)), (int)page.getTotal(), pageSize, page.getResult());
    }

    /**
     * 用户登录的方法
     */
    public User login(String username) {
        return userMapper.login(username);
    }

    /*public List<User> findAll() {
        return null;
    }

    public User findById(Long id) {
        return null;
    }

    public void create(User user) {

    }

    public void delete(Long id) {

    }

    public void update(User user) {

    }*/
}

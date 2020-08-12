package cn.tycoding.mapper;

import cn.tycoding.pojo.Customer;
import cn.tycoding.pojo.User;
import com.github.pagehelper.Page;

/**
 * @author tycoding
 * @date 18-4-7下午9:10
 */
public interface UserMapper {

    void create(User user);

    void delete(Long id);

    User findById(Long id);

    void update(User user);

    Page<User> findByPage(User user);

    User login(String username);
}

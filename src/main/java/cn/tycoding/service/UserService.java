package cn.tycoding.service;

import cn.tycoding.pojo.Customer;
import cn.tycoding.pojo.PageBean;
import cn.tycoding.pojo.User;

/**
 * @author tycoding
 * @date 18-4-7下午9:09
 */
public interface UserService extends BaseService<User> {

    User login(String username);

    /**
     * 分页查询
     * @param User 查询条件
     * @param pageCode 当前页
     * @param pageSize 每页的记录数
     * @return
     */

    PageBean findByPage(User user, int pageCode, int pageSize);

}

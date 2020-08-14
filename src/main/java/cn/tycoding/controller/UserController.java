package cn.tycoding.controller;

import cn.tycoding.pojo.Customer;
import cn.tycoding.pojo.User;
import cn.tycoding.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 用户的控制层
 *
 * @author tycoding
 * @date 18-4-7下午9:00
 */
@Controller
@RequestMapping("/user")
public class UserController {

    //注入service
    @Autowired
    private UserService userService;

    /**
     * 用户登录
     */
    @RequestMapping(value = "/login")
    public String login(@RequestParam String account,@RequestParam String password, Model model) {
        User user = userService.login(account);
        if (user != null) {
            if (user.getPassword().equals(password)) {
                //登录成功
                return "page/page";
            } else {
                model.addAttribute("message", "登录失败");
                return "page/loginInfo";
            }
        } else {
            model.addAttribute("message", "你输入的用户名或密码有误");
            return "page/loginInfo";
        }
    }

    /**
     * 回到登录页
     */
    @RequestMapping(value="/index")
    public String index(){
        return "index";
    }

    /**
     * 跳转到添加客户功能页面
     */
    @RequestMapping("/toSavePage")
    public String toSavePage() {
        return "page/save";
    }

    /**
     * 跳转到客户列表页面
     */
    @RequestMapping(value = "/toListPage")
    public String toListPage(Model model) {
        return "redirect:findByPage.do";
    }

    /**
     * 客户信息保存
     *
     * @param user
     * @param model
     * @return
     */
    @RequestMapping(value = "/save")
    public String create(User user, Model model) {
        try {
            userService.create(user);
            model.addAttribute("message", "添加用户成功，默认密码为123456");
        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("message", "添加失败，请注意账号不能重复，日期格式例如2018-08-06");

        }
        return "page/info";
    }

    /**
     * 客户信息删除的方法
     *
     * @param id
     * @param model
     * @return
     */
    @RequestMapping(value = "/delete")
    public String delete(@RequestParam Long id, Model model) {
        try {
            userService.delete(id);
            model.addAttribute("message", "删除用户信息成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "page/info";
    }


    /**
     * 根据id查询客户信息方法
     *
     * @param user
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/findById")
    public User findById(@RequestBody User user) {
        User user_info = userService.findById(user.getId());
        if (user_info != null) {
            return user_info;
        } else {
            return null;
        }
    }

    /**
     * 更新客户信息的方法
     *
     * @param user
     * @param model
     * @return
     */
    @RequestMapping(value = "/update")
    public String update(User user, Model model) {
        try {
            userService.update(user);
            model.addAttribute("message", "更新用户信息成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "page/info";
    }

    /**
     * 分页查询
     *
     * @param user 查询条件
     * @param pageCode 当前页
     * @param pageSize 每页显示的记录数
     * @return
     */
    @RequestMapping("/findByPage")
    public String findByPage(User user,
                                  @RequestParam(value = "pageCode", required = false, defaultValue = "1") int pageCode,
                                  @RequestParam(value = "pageSize", required = false, defaultValue = "3") int pageSize,
                                  Model model) {
        // 回显数据
        model.addAttribute("page", userService.findByPage(user, pageCode, pageSize));
        return "page/listUser";
    }
}

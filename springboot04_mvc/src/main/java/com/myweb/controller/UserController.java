package com.myweb.controller;

import com.myweb.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;

/**
 * MVC调用步骤:
 * 1. 当用户发起请求时, 被SpringMVC框架中的前端控制器
 * 2. 由于前端控制器,并不清楚哪个方法与请求对应, 所以查询处理器映射器
 * 3. 当tomcat服务器启动,则处理器映射器会加载所有的@RequestMapping注解, 将其中的路径与方法进行绑定. Map</请求路径, 包名.类名.方法名(参数)>, 将查找到的方法信息回传给前端控制器 进行后续调用
 * 4. 秉承着松耦合的思想,前端控制器将查询得到的方法请求处理器适配器(mvc针对不同的配置文件有不同的适配器)挑选合适的处理器去执行
 * 5. 当挑选合适的处理器之后, 我们的程序开始真正的执行业务方法. Controller-Service-Dao,执行业务, 当业务执行成功之后, 返回同一个ModelAndView对象. 其中包含两部分数据1-Model(服务器数据) 2-View(页面的逻辑名称)
 * 6. 当前端控制器获取ModelAndView对象之后, 交给我们的视图解析器 解析View对象的逻辑名称. 动态的拼接前缀 + 逻辑名称 + 后缀. 最后幸好曾了用户展现页面的全路径
 * 7. 将Model的数据填充到页面中的过程,叫做视图选软, 渲染之后, 将数据交给前端控制处理
 * 8. 将得到的完整页面 响应给用户展现.
 */
@Controller
public class UserController {

    @RequestMapping("/addUser")
    public String addUserParam(User user){
        System.out.println("参数获取: " + user.getId() + "| " + user.getName() + "| " + Arrays.toString(user.getHobbys()) + "|" + user.getDog());
        return "success";
    }

    /**
     * 同名提交测试
     * 参数提交形式：SpringMVC自动将参数列用","进行拼接, MVC自动创建了字符串数组去接收
     * String... 变量名: 可变参数类型, 实质就是数组
     *
     */
//    @RequestMapping("/addUser")
//    public String addUserParam(@RequestParam(value = "id") Integer i, String name, String... hobbys){
//        System.out.println("参数获取: " + i + "| " + name + "| " + Arrays.toString(hobbys));
//        return "success";
//    }


    /**
     * 测试@RequestParam注解
     * @param model
     * @return
     */
//    @RequestMapping("/addUser")
//    public String addUserParam(@RequestParam(value = "id") Integer i, String name){
//        System.out.println("参数获取: " + i + ", " + name);
//        return "success";
//    }

    @RequestMapping("/user")
    public String toUser(Model model){
//        将数据通过model进行传递
        model.addAttribute("id", 1003);
        model.addAttribute("name", "烟火神");
        return "user";
    }

//    这是标准方法
//    @RequestMapping("/addUser")
//    public String addUser(Integer id, String name){
//        System.out.println("参数获取:" + id + ", "+ name);//传的参数是前端的name属性名
//        return "success";
//    }
    /**
     * 请求路径: http://localhost:8090/adduser
     * 请求参数: id: 100 name: 近期正
     * request/response对象的说明: 只要用户调用就会自动赋值
     *                           这个两个方法的.getParameter(String name)方法都是返回String类型
     * 复杂方法, 不适用
     */
//    @RequestMapping("/addUser")
//    public String addUser(HttpServletRequest request, HttpServletResponse response){
//        Integer id = Integer.parseInt(request.getParameter("id"));//传的参数是前端的name属性名
//        String name = request.getParameter("name");
//        System.out.println("参数: " + id + ", " + name);
//        return "success";
//    }

//      MVC的底层数据实现
//    @RequestMapping("/user")
//    public ModelAndView toUser(){
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("user");
//        modelAndView.addObject("id", 1001);
//        modelAndView.addObject("name", "野人");
//        return modelAndView;
//    }
}

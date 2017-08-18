package com.gus.controller;

import com.gus.po.Items;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;


/**
 * The type Items controller 1.
 * 实现controller接口的处理器
 */
//使用@Controller标记他是一个控制器
@Controller
public class ItemsController1anno {

//    这就是注解的映射器的配套使用
//    @RequestMapping实现了对queryItems方法和url进行映射，一个方法对应一个url
//    url和方法名没有任何关系，url后边可以加.action，也可以不加
//    一般建议将二者写成一样，方便维护
    @RequestMapping("/queryItems")
    public ModelAndView queryItems() throws Exception {
        List<Items> itemsList = new ArrayList<Items>();
//        填充静态数据

        Items items_1 = new Items();
        items_1.setName("联想笔记本");
        items_1.setPrice(6000f);
        items_1.setDetail("ThinkPad T430 联想笔记本电脑！");

        Items items_2 = new Items();
        items_2.setName("苹果手机");
        items_2.setPrice(5000f);
        items_2.setDetail("iphone6苹果手机！");

        itemsList.add(items_1);
        itemsList.add(items_2);

//        返回ModelAndView
        ModelAndView modelAndView = new ModelAndView();

//        相当于request的setAttribute方法
        modelAndView.addObject("itemsList", itemsList);

//        指定视图
//        下面的路径，如果在试图解析器中配置了jsp路径的前缀和jsp路径的后缀，修改为
//        因为路径名在前边已经配置了，所以在这里可以不指定jsp路径的前缀和jsp路径的后缀
//        modelAndView.setViewName("/WEB-INF/jsp/items/itemsList.jsp");
        modelAndView.setViewName("/items/itemsList");

        return modelAndView;
    }

}
//    @Override
//    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
////        将来这里整合service，dao之后
////        调用srevice查询数据库，查询商品列表，这里使用静态数据来模拟
//        List<Items> itemsList = new ArrayList<Items>();
////        填充静态数据
//
//        Items items_1 = new Items();
//        items_1.setName("联想笔记本");
//        items_1.setPrice(6000f);
//        items_1.setDetail("ThinkPad T430 联想笔记本电脑！");
//
//        Items items_2 = new Items();
//        items_2.setName("苹果手机");
//        items_2.setPrice(5000f);
//        items_2.setDetail("iphone6苹果手机！");
//
//        itemsList.add(items_1);
//        itemsList.add(items_2);
//
////        返回ModelAndView
//        ModelAndView modelAndView = new ModelAndView();
//
////        相当于request的setAttribute方法
//        modelAndView.addObject("itemsList",itemsList);
//
////        指定视图
//        modelAndView.setViewName("/WEB-INF/jsp/items/itemsList.jsp");
//
////        return modelAndView;
//    }
//}

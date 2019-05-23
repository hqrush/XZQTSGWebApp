package org.xzqtsg.webapp_core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

// @Controller注释将类定义为Spring MVC控制器
@Controller
@RequestMapping("/hello") 
public class HelloWorldController {

	// 声明printHello()方法作为控制器的默认服务方法来处理HTTP GET请求
	@RequestMapping(method = RequestMethod.GET)
	public String printHello(ModelMap model) {
		// 用这个方法向视图传递参数
		model.addAttribute("message", "Hello Spring MVC Framework!");
		// 返回视图，这个视图对应这views目录下同名的jsp文件
		return "helloworld";
	}
}

/*
 * 还有下面这种写法
 * 
 * @Controller
 * 
 * @RequestMapping("/hello") public class HelloWorldController {
 * 
 * @RequestMapping(method = RequestMethod.GET) public String printHello(ModelMap
 * model) { model.addAttribute("message", "Hello Spring MVC Framework!"); return
 * "helloworld"; }
 * 
 * }
 * 
 * 这里@RequestMapping的第一个用法表示此控制器上的所有处理方法都与/hello路径相关。
 * 第二个注释用法用于声明printHello()方法作为控制器的默认服务方法来处理HTTP GET请求
 * 
 */
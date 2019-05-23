package org.xzqtsg.webapp_core.controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.xzqtsg.webapp_core.domain.entity.Admin;
import org.xzqtsg.webapp_core.service.impl.AdminServiceImpl;

@Controller
@RequestMapping("bmpages")
public class AdminController {

	// @Autowired就可以不用些getter和setter
	@Autowired
	private AdminServiceImpl adminServiceImpl;

	// @GetMapping是一个组合注解，是@RequestMapping(method = RequestMethod.GET)的缩写。
	// @PostMapping是一个组合注解，是@RequestMapping(method = RequestMethod.POST)的缩写。

	@GetMapping("/login")
	public String login() {
		return "bmpages/login";
	}

	@PostMapping("/doLogin")
	public String doLogin(String adminName, String password) {
		System.out.println(adminName);
		if (Objects.equals(adminName, "admin") && Objects.equals(password, "111")) {
			return "bmpages/admin/list";
		}
		return "bmpages/login";
	}

	@RequestMapping("/admin/list")
	public String list(Model model) {
		model.addAttribute("admins", this.adminServiceImpl.findAll());
		return "bmpages/admin/list";
	}

	// 添加管理员

	@RequestMapping("/admin/add")
	public String addPrompt() {
		return "bmpages/admin/add";
	}

	@RequestMapping(value = "/admin/doAdd")
	public String add(Admin admin) {
		adminServiceImpl.add(admin);
		return "bmpages/admin/list";
	}

	// 删除管理员

	@RequestMapping("/deletePrompt")
	public String deletePrompt(Model model, long id) {
		model.addAttribute("id", id);
		return "bmpages/admin/delete";
	}

	@RequestMapping(value = "/doDeleteById")
	public String deleteById(long id) {
		adminServiceImpl.deleteById(id);
		return "bmpages/admin/list";
	}

	// 修改管理员

	@RequestMapping("/updatePrompt")
	public String updatePrompt(Model model, long id) {
		model.addAttribute("admin", getById(id));
		return "bmpages/admin/update";
	}

	@RequestMapping(value = "/doUpdate")
	public String update(Admin admin) {
		adminServiceImpl.update(admin);
		return "bmpages/admin/list";
	}

	// 根据id查询得到某个管理员信息

	@RequestMapping(value = "/getById")
	@ResponseBody
	public Admin getById(long id) {
		return adminServiceImpl.getById(id);
	}

}

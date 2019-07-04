package com.crudController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.crudModel.crudEmployeeModel;
import com.crudserviceInterface.crudServiceInterface;

@Controller
public class crudController {
	
	@Autowired
	private crudServiceInterface crdServiceInterface;


	@RequestMapping("FirstPage")
	public ModelAndView welcomePage(Model model,@ModelAttribute("register")crudEmployeeModel crudemployeemodel )
	{
		System.out.println("on Welcome Page");
		
		List<String> list=new ArrayList<>();
		list=crdServiceInterface.getList();
		model.addAttribute("list", list);
		return new ModelAndView("Welcome");
	}
			
	@RequestMapping(value="Registration",params="insert")
	public ModelAndView insert(Model model,@ModelAttribute("register")crudEmployeeModel crudemployeemodel)
	{
		System.out.println("on insert Page");
		
		crdServiceInterface.getInsertRecord(crudemployeemodel);
		
		List<String> list=new ArrayList<>();
		list=crdServiceInterface.getList();
		model.addAttribute("list", list);
		return new ModelAndView("Welcome");
	}
	
	
	@RequestMapping(value="edit")
	public ModelAndView editRecord(Model model,@ModelAttribute("register")crudEmployeeModel crudemployeemodel)
	{
		System.out.println("on Edit Page Page");
		
		return new ModelAndView("EditInfo");
	}
	
	@RequestMapping(value="Update")
	public ModelAndView Update(Model model,@ModelAttribute("register")crudEmployeeModel crudemployeemodel)
	{
		System.out.println("on Click Edit Link way to update");
		
		crdServiceInterface.updateInfo(crudemployeemodel);
		
		List<String> list=new ArrayList<>();
		list=crdServiceInterface.getList();
		model.addAttribute("list", list);
		
		return new ModelAndView("Welcome");
	}
	
	@RequestMapping(value="delete")
	public ModelAndView deleteRecord(Model model,@ModelAttribute("register")crudEmployeeModel crudemployeemodel)
	{
		System.out.println("on Delete Page Page");
		
		return new ModelAndView("DeleteInfo");
	}
	
	
	
	@RequestMapping(value="deleteRecord")
	public ModelAndView deleteRecord1(Model model,@ModelAttribute("register")crudEmployeeModel crudemployeemodel)
	{
		System.out.println("on click Delete and way to delete Page");
		
		crdServiceInterface.deleteInfo(crudemployeemodel);
		List<String> list=new ArrayList<>();
		list=crdServiceInterface.getList();
		model.addAttribute("list", list);
		return new ModelAndView("Welcome");
	}
	
	
	@RequestMapping(value="Registration",params="delete")
	public ModelAndView delete(Model model,@ModelAttribute("register")crudEmployeeModel crudemployeemodel)
	{
		System.out.println("on insert Page");
		
		
		crdServiceInterface.getDeleteRecord(crudemployeemodel);
		List<String> list=new ArrayList<>();
		list=crdServiceInterface.getList();
		model.addAttribute("list", list);
		return new ModelAndView("Welcome");
		
		
	}
	

}

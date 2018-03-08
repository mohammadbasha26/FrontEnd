package com.niit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.DAO.CategoryDAO;
import com.niit.DAO.ProductDAO;
import com.niit.DAO.SupplierDAO;
import com.niit.model.Category;
import com.niit.model.Product;
import com.niit.model.Supplier;

@Controller
@RequestMapping("/admin")

public class AdminController {
	
	
	@Autowired
	ProductDAO productDAO;	
		
	
	
	 
	  @Autowired
		CategoryDAO categoryDAO;
	  
		@Autowired
		SupplierDAO supplierDAO;


	   @RequestMapping(value = "/product", method = RequestMethod.GET)
	   public String product(Model product) {
		   product.addAttribute("product", new Product());
		   
	      return "product";
	   }
		  @RequestMapping( value = "/saveProduct",method = RequestMethod.POST)
		   public ModelAndView product(@ModelAttribute Product cm){
		       ModelAndView ma=new ModelAndView();
		       productDAO.addProduct(cm);
		       ma.setViewName("redirect:/productlist");
		   return ma;

		   } 
		  @RequestMapping("/productlist")
			public ModelAndView productList() {
				ModelAndView ma = new ModelAndView();
				// User user = (User) session.getAttribute("user");
				 List<Product> plist=productDAO.getProducts();
				 
				 for (Product product : plist) {
					 System.out.println(product.getProductName()+"--------------------------------------------------------------------------");
					
				}
				 
				 ma.setViewName("productList");
				ma.addObject("productList",plist);
				return ma;
			}
		  
		  
		  
		  @RequestMapping("/deleteProduct/{ProductID}")
			public String delete(@PathVariable("ProductID") int ProductID) {
				// contactDAO.delete(contactId);
				productDAO.deleteProduct(ProductID);
				return "redirect:/productlist?del";
		  }
		  
		  
		  
		  @RequestMapping("/updateProduct/{ProductID}")
			public ModelAndView editView2(@PathVariable("ProductID") int ProductID) {
				ModelAndView ma = new ModelAndView();

				Product p = productDAO.getProduct(ProductID);
				// ModelAndView mav = new ModelAndView("category");
				// mav.addObject("supplier", new Supplier());
				ma.addObject("uproduct", p);// Domain as Command
		
				ma.setViewName("updateproduct");
				return ma;
			}
		  
		  
		  
		  @RequestMapping(value = "/saveUProduct", method = RequestMethod.POST)
			public ModelAndView updateProduct(@ModelAttribute("uproduct") Product uproduct) {
				
				System.out.println(uproduct.getProductID()+"--------------"+uproduct.getProductName()+"------------"+uproduct.getProductDesc());
				
				System.out.println("called");
				ModelAndView ma = new ModelAndView();
				productDAO.updateProduct(uproduct);

				ma.setViewName("redirect:/productlist?update");
			
				return ma;

			}
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		 
			@RequestMapping(value = "/category", method = RequestMethod.GET)
			public String category(Model category) {

				category.addAttribute("category", new Category());

				return "category";
			}

			@RequestMapping(value = "/saveCategory", method = RequestMethod.POST)
			public ModelAndView category(@ModelAttribute Category cate) {
				ModelAndView cat = new ModelAndView();
				categoryDAO.addCategory(cate);
				cat.setViewName("redirect:/categorylist");
				return cat;

			}

			@RequestMapping("/categorylist")
			public ModelAndView contactList() {
				ModelAndView cat = new ModelAndView();

				List<Category> clist = categoryDAO.getCategories();

				for (Category category : clist) {
					// System.out.println(category.getCategoryName()+"--------------------------------------------------------------------------");

				}

				cat.setViewName("categoryList");
				cat.addObject("categoryList", clist);
				return cat;
			}

			@RequestMapping("/deleteCategory/{categoryID}")
			public String deleteCategory(@PathVariable("categoryID") int categoryID) {
				// contactDAO.delete(contactId);
				categoryDAO.deleteCategory(categoryID);
				return "redirect:/categorylist?del";
			}

			@RequestMapping("/updateCategory/{categoryID}")
			public ModelAndView editView3(@PathVariable("categoryID") int categoryID) {
				ModelAndView mav = new ModelAndView();

				Category cat1 = categoryDAO.getCategory(categoryID);

				//cat.addObject("categorylist", categoryDAO.getCategories());

				mav.addObject("ucat", cat1);
				mav.setViewName("updatecategory");
				return mav;
			}

			@RequestMapping(value = "/updateSCategory", method = RequestMethod.POST)
			public ModelAndView updateCategory(@ModelAttribute("ucat") Category ucat) {
				
				System.out.println(ucat.getCategoryID()+"--------------"+ucat.getCategoryDesc()+"------------"+ucat.getCategoryName());
				
				System.out.println("called");
				ModelAndView mav = new ModelAndView();
				categoryDAO.updateCategory(ucat);

				mav.setViewName("redirect:/categorylist?update");
			
				return mav;

			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			

			
			
			 @RequestMapping(value = "/supplier", method = RequestMethod.GET)
			   public String supplier(Model supplier) {
				  
					   supplier.addAttribute("supplier", new Supplier());
					   
				   
			      return "supplier";
			   }
				  @RequestMapping( value = "/saveSupplier",method = RequestMethod.POST)
				   public ModelAndView supplier(@ModelAttribute Supplier sup){
				       ModelAndView su=new ModelAndView();
				       supplierDAO.addSupplier(sup);
				       su.setViewName("redirect:/supplierlist");
				   return su;

				   } 
				  
				  @RequestMapping("/supplierlist")
					public ModelAndView supplierList() {
						ModelAndView su = new ModelAndView();
						// User user = (User) session.getAttribute("user");
						 List<Supplier> slist=supplierDAO.getSuppliers();
						 
						 for (Supplier supplier : slist) {
							 System.out.println(supplier.getSupplierName()+"--------------------------------------------------------------------------");
							
						}
						 
						 su.setViewName("supplierList");
						su.addObject("supplierList",slist);
						return su;
					}
				  
				  @RequestMapping("/deleteSupplier/{SupplierID}")
					public String deleteSupplier(@PathVariable("SupplierID") int SupplierID) {
						// contactDAO.delete(contactId);
						supplierDAO.deleteSupplier(SupplierID);
						return "redirect:/supplierlist?del";
				  }
				 
				  
				  
				  
				  @RequestMapping("/updateSupplier/{SupplierID}")
					public ModelAndView editView(@PathVariable("SupplierID") int SupplierID) {
						ModelAndView su = new ModelAndView();

						Supplier s = supplierDAO.getSupplier(SupplierID);
						// ModelAndView mav = new ModelAndView("category");
						// mav.addObject("supplier", new Supplier());
						su.addObject("usupplier", s);// Domain as Command
				
						su.setViewName("updatesupplier");
						return su;
					}
				  
				  
				  
				  @RequestMapping(value = "/saveUSupplier", method = RequestMethod.POST)
						public ModelAndView updateSupplier(@ModelAttribute("usupplier") Supplier usupplier) {
							
							System.out.println(usupplier.getSupplierID()+"--------------"+usupplier.getSupplierName()+"------------"+usupplier.getSupplierAddress());
							
							System.out.println("called");
							ModelAndView su = new ModelAndView();
							supplierDAO.updateSupplier(usupplier);

							su.setViewName("redirect:/supplierlist?update");
						
							return su;

						}


}

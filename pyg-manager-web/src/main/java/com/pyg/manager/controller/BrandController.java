package com.pyg.manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pyg.pojo.Brand;
import com.pyg.sellergoods.service.BrandService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 品牌controller
 * @author QB_ZJ_A076
 * @time 2018/9/14
 */
@RestController
@RequestMapping("/brand")
public class BrandController {
	@Reference
	private BrandService brandService;

	@RequestMapping("/findAll")
	public List<Brand> findAll(){
		return brandService.findAll();
	}
}

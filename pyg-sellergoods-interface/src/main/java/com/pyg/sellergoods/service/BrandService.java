package com.pyg.sellergoods.service;

import com.pyg.pojo.Brand;

import java.util.List;

/**
 * 品牌服务层接口
 */
public interface BrandService {
	/**
	 * 返回全部列表
	 * @return
	 */
	List<Brand> findAll();
}

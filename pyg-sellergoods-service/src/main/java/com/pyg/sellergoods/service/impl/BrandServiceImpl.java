package com.pyg.sellergoods.service.impl;


import com.pyg.mapper.BrandMapper;
import com.pyg.pojo.Brand;
import com.pyg.sellergoods.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

/**
 * @author QB_ZJ_A076
 * @time 2018/9/14
 */
//@com.alibaba.dubbo.config.annotation.Service
//@org.springframework.stereotype.Service
public class BrandServiceImpl implements BrandService {

	@Autowired
	private BrandMapper brandMapper;

	@Override
	public List<Brand> findAll() {
		return brandMapper.selectByExample(null);
	}
}

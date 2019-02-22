package com.gmg.rpc.server;

import com.gmg.rpc.Product;
import com.gmg.rpc.api.ProductService;

/**
 * @author gmg
 * @Title:
 * @Package
 * @Description:
 * @date 2019/2/22  20:33
 */
public class ProductServiceImpl implements ProductService {
    @Override
    public Product queryById(long id) {
        Product product = new Product();
        product.setId(id);
        product.setName("张三");
        product.setPrice(1.0);
        return product;
    }
}
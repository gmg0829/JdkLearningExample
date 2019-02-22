package com.gmg.rpc.api;

import com.gmg.rpc.Product;

/**
 * @author gmg
 * @Title:
 * @Package
 * @Description:
 * @date 2019/2/22  20:28
 */
public interface ProductService {
    public Product queryById(long id);
}

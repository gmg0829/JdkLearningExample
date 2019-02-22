package com.gmg.rpc.client;

import com.gmg.rpc.Product;
import com.gmg.rpc.api.ProductService;
import com.gmg.rpc.StubProxy;

/**
 * @author gmg
 * @Title:
 * @Package
 * @Description:
 * @date 2019/2/22  20:29
 */
public class ProductClient {
    public static void main(String[] args) {
        ProductService service = (ProductService) StubProxy.rpc(ProductService.class);
        Product product = service.queryById(100);
        System.out.println(product);
    }

}

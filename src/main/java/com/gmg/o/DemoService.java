package com.gmg.o;

import java.util.List;

/**
 * @author gmg
 * @title: DemoService
 * @projectName JdkLearningExample
 * @description: TODO
 * @date 2019/10/8 15:50
 */
public interface DemoService<BO,PO,DTO,VO,DO> {
    void saveUpdateData(List<BO> boList);

}

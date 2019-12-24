package com.gmg.concurrent.batchInsert;

import java.util.List;

/**
 * @author gmg
 * @title: DataMapper
 * @projectName JdkLearningExample
 * @description: TODO
 * @date 2019/12/24 14:25
 */
public interface DataMapper {
    Long getTotal();
    void insertBatch( List<ItemData> list);
}

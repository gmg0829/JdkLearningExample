package com.gmg.concurrent.batchInsert;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @author gmg
 * @title: DataService
 * @projectName JdkLearningExample
 * @description: TODO
 * @date 2019/12/24 14:23
 */
public class DataService {

    private DataMapper itemDataMapper;

    public Set<String> pageLimitData(Long i,Long pageSize){
        return null;
    }

    //TODO:批量插入数据
//    @Async("taskDataExecutor")
    public void insertBatchData(Set<String> set){

        List<ItemData> list= new ArrayList<>();
        //TODO:真正的插入数据的业务逻辑
        set.forEach(s -> {
            ItemData data=new ItemData(1,s,"1");
            list.add(data);
        });
        //这是一个批量插入的方法
        itemDataMapper.insertBatch(list);
    }
    /**
     *
     <!--批量插入-->
     <insert id="insertBatch">
     insert into item_data (id, code, p_id)
     values

     <foreach collection="datas" item="data" separator="," >
     (null,#{data.code},#{data.pId})
     </foreach>

     </insert>
     */
}

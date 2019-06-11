package zsc.competition.dao;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import zsc.competition.domain.ItemModel;

import java.util.List;

@Repository
public interface ItemDao {

    //查看所有竞赛项目
    @Select("select * from item")
    public List<ItemModel> findAllItems();
}

package zsc.competition.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zsc.competition.dao.ItemDao;
import zsc.competition.domain.ItemModel;
import zsc.competition.service.ItemService;

import java.util.List;

@Service("ItemService")
public class ItemServiceImpl implements ItemService {
    @Autowired
    ItemDao itemDao;

    public List<ItemModel> findAllItems() {
        return itemDao.findAllItems();
    }
}

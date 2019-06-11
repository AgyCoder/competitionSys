package zsc.competition.test;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import zsc.competition.domain.ItemModel;
import zsc.competition.service.ItemService;

import java.util.List;

public class TestSpring {

    @Test
    public void run1(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

        ItemService itemService = (ItemService) ac.getBean("ItemService");
        List<ItemModel> allItems = itemService.findAllItems();
        System.out.println(allItems.size());
    }

}

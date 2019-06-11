package zsc.competition.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import zsc.competition.domain.ItemModel;
import zsc.competition.service.ItemService;

import java.util.List;

@Controller
@RequestMapping("/item")
public class ItemController {
    @Autowired
    private ItemService itemService;

    @RequestMapping("/findAllItems")
    public String findAllItems(Model model){
        List<ItemModel> allItems = itemService.findAllItems();
        model.addAttribute("list",allItems);
        return "size";

    }
}

package cn.e3.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.e3.manager.service.ItemService;
import cn.e3.pojo.TbItem;

@RestController
public class ItemController {
	@Autowired
	private ItemService itemService;
	
	@RequestMapping("list/{itemId}")
	public TbItem findItem(@PathVariable Long itemId){
		TbItem tbItem = itemService.findItemByItemId(itemId);
		return tbItem;
	}
	

}

package com.inventoryservice.inventoryservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InventoryService {

	List<Inventory> inventoryList = new ArrayList<Inventory>();

	@GetMapping("/inventory/details/{productId}")
	public Inventory getinventoryDetails(@PathVariable("productId") Long productid) {
		
		Inventory inventory = getInventory(productid);
		
		return inventory;
	}

	private Inventory getInventory(Long productid) {
		populatePriceList();
		for(Inventory p : inventoryList) {
			if(productid.equals(p.getProductId())) {
				return p;
			}
		}
		return null;
	}

	private void populatePriceList() {
		inventoryList.add(new Inventory(301L,101L,true));
		inventoryList.add(new Inventory(302L,102L,false));
		inventoryList.add(new Inventory(303L,103L,true));
	}
	
}

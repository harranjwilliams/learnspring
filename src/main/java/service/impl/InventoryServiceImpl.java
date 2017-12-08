package service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import data.repository.InventoryItemRepository;
import domain.Product;
import service.InventoryService;

@Service
public class InventoryServiceImpl implements InventoryService {
	
	private final InventoryItemRepository inventoryItemRepository;
	
	@Autowired
	public InventoryServiceImpl(InventoryItemRepository inventoryItemRepository) {
		this.inventoryItemRepository = inventoryItemRepository;
	}
	
	public Map<Product, Long> getTotalInventoryOnHand() {
		return null;
	}
	
	public long getQuantityOnHand(String itemId) {
		return 0;
	}
	
	public void adjustInventory(String itemId, long quantity) {
		
	}

}

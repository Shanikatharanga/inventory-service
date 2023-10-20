package com.inventoryservice.inventoryservice;

public class Inventory {

	private Long inventoryId;
	private Long productId;
	private Boolean isStock;

	public Long getInventoryId() {
		return inventoryId;
	}

	public void setInventoryId(Long inventoryId) {
		this.inventoryId = inventoryId;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Boolean getIsStock() {
		return isStock;
	}

	public void setIsStock(Boolean isStock) {
		this.isStock = isStock;
	}

	public Inventory(Long inventoryId, Long productId, Boolean isStock) {
		super();
		this.inventoryId = inventoryId;
		this.productId = productId;
		this.isStock = isStock;
	}

	public Inventory() {
		super();
	}

}

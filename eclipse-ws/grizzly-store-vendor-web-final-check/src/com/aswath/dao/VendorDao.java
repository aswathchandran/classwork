package com.aswath.dao;

import java.util.List;

import com.aswath.model.InventoryModel;
import com.aswath.model.VendorListModel;
import com.aswath.model.VendorModel;

public interface VendorDao {
	
	public int login(VendorModel vendor);
	
	public VendorModel fetchVendor(String username);
	
	public int addVendorList(VendorListModel vendorListModel);
	
	public List<InventoryModel> inventorylist();

}

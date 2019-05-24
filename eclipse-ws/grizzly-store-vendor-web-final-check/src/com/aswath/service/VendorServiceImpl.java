package com.aswath.service;

import java.util.List;

import com.aswath.dao.VendorDaoImpl;
import com.aswath.model.InventoryModel;
import com.aswath.model.VendorListModel;
import com.aswath.model.VendorModel;

public class VendorServiceImpl implements VendorService {

	@Override
	public int LoginService(VendorModel vendor) {
		
		return new VendorDaoImpl().login(vendor);
	}

	@Override
	public VendorModel fetchVendor(String username) {
		
		return new VendorDaoImpl().fetchVendor(username);
	}

	@Override
	public int addVendorList(VendorListModel vendorListModel) {
		
		return new VendorDaoImpl().addVendorList(vendorListModel);
	}

	@Override
	public List<InventoryModel> inventorylist() {
		
		return new VendorDaoImpl().inventorylist();
	}
	
	
	
	

}

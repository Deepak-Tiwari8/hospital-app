package com.ty.hospital_app.service.impl;

import java.util.List;

import com.ty.hospital_app.dao.BranchInterfaceDao;
import com.ty.hospital_app.dao.impl.BranchDaoimpl;
import com.ty.hospital_app.dto.Branch;

public class BranchServiceimpl implements BranchInterfaceDao
{
	BranchDaoimpl branchDaoimpl = new BranchDaoimpl();
	@Override
	public Branch saveBranch(Branch branch) {
		return branchDaoimpl.saveBranch(branch) ;
	}

	@Override
	public Branch getBranchById(int branchId) {
		// TODO Auto-generated method stub
		return branchDaoimpl.getBranchById(branchId);
	}

	@Override
	public Branch getBranchByName(String branchName) {
		// TODO Auto-generated method stub
		return branchDaoimpl.getBranchByName(branchName);
	}

	@Override
	public boolean deleteBranchById(int branchId) {
		// TODO Auto-generated method stub
		return branchDaoimpl.deleteBranchById(branchId);
	}

	@Override
	public Branch updateBranchById(int brancId, Branch branch) {
		// TODO Auto-generated method stub
		return branchDaoimpl.updateBranchById(brancId, branch);
	}

	@Override
	public List<Branch> getAllBranch() {
		// TODO Auto-generated method stub
		return branchDaoimpl.getAllBranch();
	}

}

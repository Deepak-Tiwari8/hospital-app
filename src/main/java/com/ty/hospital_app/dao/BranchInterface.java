package com.ty.hospital_app.dao;

import java.util.List;

import com.ty.hospital_app.dto.Branch;

public interface BranchInterface {

	public abstract Branch saveBranch(Branch branch);

	public abstract Branch getBranchById(int branchId);

	public abstract Branch getBranchByName(int branchId);

	public abstract boolean deleteBranchById(int branchId);

	public abstract Branch updateBranchById(int brancId, Branch branch);

	public abstract List<Branch> getAllBranch();
}

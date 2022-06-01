package com.ty.hospital_app.controller;

import com.ty.hospital_app.dto.Branch;
import com.ty.hospital_app.service.impl.BranchServiceimpl;

public class TestSaveBranch {

	public static void main(String[] args) {
		Branch branch = new Branch();
		branch.setBranchName("Btm life-care");
		branch.setAddress("saket nagar 10th cross bhopal");
		branch.setBranchEmail("www.lifecare.com");
		branch.setBranchPhone(99876);

		BranchServiceimpl branchServiceimpl = new BranchServiceimpl();
		branchServiceimpl.saveBranch(branch);
	}
}

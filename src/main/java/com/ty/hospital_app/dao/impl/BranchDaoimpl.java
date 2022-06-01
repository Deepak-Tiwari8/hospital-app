package com.ty.hospital_app.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospital_app.dao.BranchInterfaceDao;
import com.ty.hospital_app.dto.Branch;

public class BranchDaoimpl implements BranchInterfaceDao
{
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("deepak");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Branch saveBranch(Branch branch) {
		entityTransaction.begin();
		entityManager.persist(branch);
		entityTransaction.commit();
		return entityManager.find(Branch.class, branch.getBranchId());
	}

	public Branch getBranchById(int branchId) {
		return entityManager.find(Branch.class, branchId);
	}

	public Branch getBranchByName(String branchName) {
		return entityManager.find(Branch.class, branchName);
	}

	public boolean deleteBranchById(int branchId) {
		Branch branch = entityManager.find(Branch.class, branchId);
		if(branch!=null)
		{
		   entityTransaction.begin();
		   entityManager.remove(branch);
		   entityTransaction.commit();
		   return true;
		}
		return false;
	}

	public Branch updateBranchById(int branchId, Branch branch) {
		Branch branch2 = entityManager.find(Branch.class, branchId);
		if(branch2!=null)
		{
			branch2.setBranchId(branchId);
			entityTransaction.begin();
			entityManager.merge(branch2);
			entityTransaction.commit();
			return entityManager.find(Branch.class, branch2.getBranchId());
		}
		return null;
	}

	public List<Branch> getAllBranch() {
		String sql = "SELECT b FROM Branch b";
		Query query = entityManager.createQuery(sql);
		return query.getResultList();
	}

}

package com.crudDaoClass;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.crudDaoInterface.crudDaoInterface;
import com.crudModel.crudEmployeeModel;

@Repository
public class crudDaoClass implements crudDaoInterface{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void getInsertRecord(crudEmployeeModel crudemployeemodel) {
		sessionFactory.getCurrentSession().save(crudemployeemodel);
		
	}

	@Override
	public void getDeleteRecode(crudEmployeeModel crudemployeemodel) {
		// TODO Auto-generated method stub
		
		SQLQuery query=sessionFactory.getCurrentSession().createSQLQuery("delete from crudemployeemodel  where empId='"+crudemployeemodel.getEmpId()+"'");
		query.executeUpdate();
	}

	@Override
	public List<String> getList() {
		// TODO Auto-generated method stub
		
		List<String> list1=new ArrayList<>();
		SQLQuery query=sessionFactory.getCurrentSession().createSQLQuery("SELECT * FROM crudemployeemodel c");
		query.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
		list1=query.list();
		return list1;
	}

	@Override
	public void updateInfo(crudEmployeeModel crudemployeemodel) {
		// TODO Auto-generated method stub
		
		sessionFactory.getCurrentSession().update(crudemployeemodel);
		
	}

	@Override
	public void deleteInfo(crudEmployeeModel crudemployeemodel) {
		// TODO Auto-generated method stub
		SQLQuery query=sessionFactory.getCurrentSession().createSQLQuery("delete from crudemployeemodel where empId='"+crudemployeemodel.getEmpId()+"' ");
		query.executeUpdate();
	}

	



	
	
	

}

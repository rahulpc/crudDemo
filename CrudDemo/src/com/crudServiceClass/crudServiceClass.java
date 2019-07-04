package com.crudServiceClass;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.crudDaoInterface.crudDaoInterface;
import com.crudModel.crudEmployeeModel;
import com.crudserviceInterface.crudServiceInterface;
@Service
@Transactional
public class crudServiceClass implements crudServiceInterface {
	
	@Autowired
	private crudDaoInterface crdDaoInterface;

	@Override
	public void getInsertRecord(crudEmployeeModel crudemployeemodel) {
		// TODO Auto-generated method stub
		
		crdDaoInterface.getInsertRecord(crudemployeemodel);
		
	}

	@Override
	public void getDeleteRecord(crudEmployeeModel crudemployeemodel) {
		// TODO Auto-generated method stub
		
		crdDaoInterface.getDeleteRecode(crudemployeemodel);
		
	}

	@Override
	public List<String> getList() {
		// TODO Auto-generated method stub
		return crdDaoInterface.getList();
	}

	@Override
	public void updateInfo(crudEmployeeModel crudemployeemodel) {
		// TODO Auto-generated method stub
		
		crdDaoInterface.updateInfo(crudemployeemodel);
		
	}

	@Override
	public void deleteInfo(crudEmployeeModel crudemployeemodel) {
		// TODO Auto-generated method stub
		
		crdDaoInterface.deleteInfo(crudemployeemodel);
		
	}

	

	



	
	

}

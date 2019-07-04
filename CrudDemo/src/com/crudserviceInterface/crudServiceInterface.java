package com.crudserviceInterface;

import java.util.List;

import com.crudModel.crudEmployeeModel;

public interface crudServiceInterface  {

	public void getInsertRecord(crudEmployeeModel crudemployeemodel);

	public void getDeleteRecord(crudEmployeeModel crudemployeemodel);

	public List<String> getList();

	public void updateInfo(crudEmployeeModel crudemployeemodel);

	public void deleteInfo(crudEmployeeModel crudemployeemodel);

	

	

}

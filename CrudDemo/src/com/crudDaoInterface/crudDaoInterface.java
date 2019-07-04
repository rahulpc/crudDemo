package com.crudDaoInterface;

import java.util.List;

import com.crudModel.crudEmployeeModel;

public interface crudDaoInterface {

	public void getInsertRecord(crudEmployeeModel crudemployeemodel);

	public void getDeleteRecode(crudEmployeeModel crudemployeemodel);

	public List<String> getList();

	public void updateInfo(crudEmployeeModel crudemployeemodel);

	public void deleteInfo(crudEmployeeModel crudemployeemodel);

	

	

}

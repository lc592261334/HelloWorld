package com.daos.base;

import com.daos.base.impl.HibernateDaoSupportImpl;

public class BaseDao {
	private FacadeDAO facadeDAO;

	public void setFacadeDAO(FacadeDAO facadeDAO) {
		this.facadeDAO = facadeDAO;
	}

	public HibernateDaoSupportImpl getDataSource(String dataSourceName) {
		return facadeDAO.getDataSource(dataSourceName);
	}
}

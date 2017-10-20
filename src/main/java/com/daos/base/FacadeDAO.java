package com.daos.base;

import com.daos.base.impl.HibernateDaoSupportImpl;

public interface FacadeDAO {
	public abstract HibernateDaoSupportImpl getDataSource(String dataSourceName);
}
package com.daos.base.impl;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.hibernate.SessionFactory;

import com.daos.base.FacadeDAO;

public class FacadeDaoHibernateImpl implements FacadeDAO{
	private Map<String, HibernateDaoSupportImpl> rwDaos = new HashMap<String, HibernateDaoSupportImpl>();
	private Map<String, SessionFactory> sessionFactorys = new HashMap<String, SessionFactory>();
	public void setSessionFactorys(Map<String, SessionFactory> sessionFactorys) {
		this.sessionFactorys = sessionFactorys;
		for (Iterator<Entry<String, SessionFactory>> iterator = sessionFactorys
				.entrySet().iterator(); iterator.hasNext();) {
			Entry<String, SessionFactory> entry = iterator.next();
			String key = entry.getKey();
			HibernateDaoSupportImpl baseDao = new HibernateDaoSupportImpl(entry.getValue());
			rwDaos.put(key, baseDao);
		}
	}
	public void afterPropertiesSet() throws Exception {
		for (Iterator<Entry<String, SessionFactory>> iterator = sessionFactorys
				.entrySet().iterator(); iterator.hasNext();) {
			Entry<String, SessionFactory> entry = iterator.next();
			String key = entry.getKey();
			HibernateDaoSupportImpl baseDao = new HibernateDaoSupportImpl(entry.getValue());
			rwDaos.put(key, baseDao);
		}
	}
	public HibernateDaoSupportImpl getDataSource(String dataSourceName) {
		return rwDaos.get(dataSourceName);
	}
}

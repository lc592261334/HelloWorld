package com.daos.base.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

public class HibernateDaoSupportImpl extends HibernateDaoSupport{
	public HibernateDaoSupportImpl(SessionFactory sessionFactory) {
		super();
		this.setSessionFactory(sessionFactory);
	}
	/* 数据库查询方法 */
	@SuppressWarnings("deprecation")
	public String count(String sql,Object[] values){
		Session session = this.getSessionFactory().openSession();
		Query<?> queryObject = session.createSQLQuery(sql);
		for (int i = 0; i < values.length; i++) {
			queryObject.setParameter(i, values[i]);
		}
		String result = queryObject.list().get(0).toString();
		session.close();
		return result;
	}
}

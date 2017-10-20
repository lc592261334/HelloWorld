package com.daos.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

import com.daos.base.BaseDao;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;

@Component(value="dataSearch")
public class DataSearch extends BaseDao {
	@Autowired
	private MongoTemplate mongoTemplate;
	public String count(){
		String sql = new String("select count(*) from sbsm_user_logs m where m.type ='2' ");
		String result = this.getDataSource("info_rw").count(sql,new Object[]{});
		return result;
	}
	public String testMongoDB(){
		DBObject queryDBObject = new BasicDBObject();
		queryDBObject.put("_id", "1");
		long count = mongoTemplate.getCollection("sbsm").count(queryDBObject);
		return String.valueOf(count);
	}
}

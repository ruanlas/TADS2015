package dao;

import org.bson.Document;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import database.DBConnection;
import models.ELM327ReadSensors;

public class ELM327ReadSensorsDAO {
	private MongoCollection<Document> collection;
	
	public ELM327ReadSensorsDAO() {
		MongoDatabase database = DBConnection.getConnection();
		collection = database.getCollection("reading_sensors");
	}
	
	public void insertDB(ELM327ReadSensors readSensors) {
		Document bson = new Document();
//		inserir os dados aquiiii
//		bson.append("key", "value").append("key", "value");
		
		collection.insertOne(bson);
	}
	
	
}

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class TesteDBTCC {
	public static void main(String[] args) {
		MongoClient connect = new MongoClient("18.231.62.135", 27017);
		MongoDatabase database = connect.getDatabase("car_monitor");
		
		MongoCollection<Document> collection = database.getCollection("reading_sensors");
		
		Document bson = new Document();
		String rpm = "3300RMP";
		bson.append("rpm", rpm).
				append("pressao_motor", "54Kp/a").
				append("tipo_combustivel", "hybrid ethanol");
		
		collection.insertOne(bson);
		
		System.out.println("inserido!!");
	}
}
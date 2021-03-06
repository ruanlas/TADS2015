import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

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
				append("tipo_combustivel", "hybrid ethanol").
				append("date", LocalDateTime.now().toLocalDate().toString());
		
		collection.insertOne(bson);
		
		System.out.println("inserido!!");
//		System.out.println(LocalDateTime.now());
//		System.out.println(LocalDate.now().toString());
//		System.out.println(LocalDateTime.now().toLocalDate().toString());
//		System.out.println(LocalTime.now().toString());
//		System.out.println(LocalDateTime.now().toLocalTime().toString());
//		System.out.println( LocalTime.now().format(DateTimeFormatter.ISO_LOCAL_TIME));
		
	}
}

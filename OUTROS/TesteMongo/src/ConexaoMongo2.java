import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class ConexaoMongo2 {
	public static void main(String[] args) {
		MongoClient connect = new MongoClient("18.231.62.135", 27017);
		
		MongoDatabase database = connect.getDatabase("admin");
		
		MongoCollection<Document> collection = database.getCollection("usuarios");
		
//		System.out.println(collection.find());
		
		FindIterable<Document> result = collection.find(); //retorna todas as collections
		
		for (Document document : result) {
			System.out.println(document);
		}
		
//		System.out.println(result.iterator());
		
	////////////////////////////////////////////////////////////////	
		Document bson = new Document();
		
		bson.append("name", "Joaquim").append("password", "23112").append("ed", "fsdfs"); //cria um bson ("chave", "valor")
		
		collection.insertOne(bson);
		
//		System.out.println(collection.find());
		
		result = collection.find();
		
//		System.out.println(result.iterator());
		
		for (Document document : result) {
			System.out.println(document);
		}
	}
}

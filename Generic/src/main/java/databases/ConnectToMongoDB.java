package databases;
import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;
public class ConnectToMongoDB {
    public static MongoDatabase mongoDatabase = null;

    public static MongoDatabase connectToMongoDB() {
        MongoClient mongoClient = new MongoClient();
        mongoDatabase = mongoClient.getDatabase("students");
        System.out.println("Database Connected");

        return mongoDatabase;
    }

    public static String insertIntoToMongoDB(User user) {
        String profile = user.getStName();
        MongoDatabase mongoDatabase = connectToMongoDB();
        MongoCollection<Document> collection = mongoDatabase.getCollection("profile");
        Document document = new Document().append("stName", user.getStName()).append("stID", user.getStID()).
                append("stDOB", user.getStDOB());
        collection.insertOne(document);
        return profile + " has been registered";
    }


    public static List<User> readUserProfileFromMongoDB() {
        List<User> list = new ArrayList<User>();
        User user = new User();
        MongoDatabase mongoDatabase = connectToMongoDB();
        MongoCollection<Document> collection = mongoDatabase.getCollection("profile");
        BasicDBObject basicDBObject = new BasicDBObject();
        FindIterable<Document> iterable = collection.find(basicDBObject);
        for (Document doc : iterable) {
            String stName = (String) doc.get("stName");
            user.setStName(stName);
            String stID = (String) doc.get("stID");
            user.setStID(stID);
            String stDOB = (String) doc.get("stDOB");
            user.setStID(stDOB);
            user = new User(stName, stID, stDOB);
            list.add(user);
        }
        return list;
    }

    public static void main(String[] args) {
        insertIntoToMongoDB(new User("Naomi Chan", "4493", "07-1996"));
        List<User> user = readUserProfileFromMongoDB();
        for (User person : user) {
            System.out.println(person.getStName() + " " + person.getStID());
        }
    }

    public List<Object> readStudentListFromMongoDB(String profileName) {
        List<Object> list = new ArrayList<Object>();
        Object student = new Object();
        MongoDatabase mongoDatabase = connectToMongoDB();
        MongoCollection<Document> collection = mongoDatabase.getCollection(profileName);
        BasicDBObject basicDBObject = new BasicDBObject();
        FindIterable<Document> iterable = collection.find(basicDBObject);

        return list;
    }
}

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;

public class CreateTable {

	public static void main(String[] args) {
		Cluster cluster;
		Session session;

		String query = "CREATE TABLE IF NOT EXISTS employee(emp_id int PRIMARY KEY, name varchar, city varchar, salary int, phone int)";

		// Connection to the db
		cluster = Cluster.builder().addContactPoint("127.0.0.1").build();
		session = cluster.connect("ejemplo");

		// Executing the query
		session.execute(query);

		// Message of success
		System.out.println("Table created");

		// Close connection
		session.close();
		cluster.close();
	}

}

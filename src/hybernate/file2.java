package hybernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class file2 {
	public static void main(String[] args) {
			System.out.println("Project started...");
			
			Configuration cfg = new Configuration();
			cfg.configure("index.xml");
			SessionFactory sessionFactory = cfg.buildSessionFactory();
			
			File1 student = new File1();
			student.setName("arun");
			student.setRollNo(3);
			System.out.println(student);
			
			Session session = sessionFactory.openSession();
			
			Transaction tx = session.beginTransaction();
			
			session.save(student);
			
			tx.commit();
			
			session.close();
			


			
		}

	}



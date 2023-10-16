package hybernate;
import javax.persistence.Entity;

import javax.persistence.Table;
import javax.persistence.Id;
@Entity
@Table(name="hyberarun")
public class File1 {
	
	@Id
		private int rollNo;
		private String name;
		
 		public int getRollNo() 
		{
			return rollNo;
		}
			
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return +this.rollNo+" : " +this.name+"";
	}
	

	}




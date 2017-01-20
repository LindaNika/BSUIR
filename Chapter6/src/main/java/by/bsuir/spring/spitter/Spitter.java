package by.bsuir.spring.spitter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="spitters")
public class Spitter {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private long id;
	
	@Column(name="username", nullable=false, length=100)
	private String username;
	
	@Column(name="password", nullable=false, length=100)
	private String password;
	
	@Column(name="fullname", nullable=false, length=100)
	private String fullname;
	
	
	@Override
	public String toString() {
		return "Spitter [id=" + id + ", username=" + username + ", password=" + password + ", fullname=" + fullname
				+ "]";
	}
	public Spitter() {
		super();
	}
	public Spitter(String username, String password, String fullname) {
		super();
		this.username = username;
		this.password = password;
		this.fullname = fullname;
	}
	public Spitter(long id, String username, String password, String fullname) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.fullname = fullname;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	
	
	

}

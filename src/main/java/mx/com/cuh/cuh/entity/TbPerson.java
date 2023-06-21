package mx.com.cuh.cuh.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "person")
public class TbPerson {
	
	@Id
	@Column (name = "ID_PERSON")
	private Long idPerson;
	
	@Column (name = "LOGIN")

	private String login;
	
<<<<<<< HEAD

=======
	@Column (name = "NAME")

	private String name;
	
>>>>>>> origin/Flor_Adilene_Luna_Solano
	public Long getIdPerson() {
		return idPerson;
	}
	public void setIdPerson(Long idPerson) {
		this.idPerson = idPerson;
	}



	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}


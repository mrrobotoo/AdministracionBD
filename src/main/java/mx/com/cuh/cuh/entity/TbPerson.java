package mx.com.cuh.cuh.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "person")
public class TbPerson {
	
	@Id
	@Column(name = "ID_PERSON")
	private Long idPerson;
	
	@Column(name = "LOGIN")
	private String login;
	
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

}

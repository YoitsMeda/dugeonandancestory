package ycd.org.dungeonandancestry.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class ancestor 
{

	@Id
	@GeneratedValue
	
	@NotNull
	@Size(min=3, max=20)
	private String firstname;
	
	@NotNull
	@Size(min=3, max=20)
	private String lastname;
	
	@NotNull
	@Size(min=3)
	private String birthday;
	
	@NotNull
	@Size(min=3)
	private String bio;
	

	public String getFirstname() 
	{
		return firstname;
	}

	public void setFirstname(String firstname)
	{
		this.firstname = firstname;
	}

	public String getLastname() 
	{
		return lastname;
	}

	public void setLastname(String lastname) 
	{
		this.lastname = lastname;
	}

	public String getBirthday() 
	{
		return birthday;
	}

	public void setBirthday(String birthday) 
	{
		this.birthday = birthday;
	}

	public String getBio() 
	{
		return bio;
	}

	public void setBio(String bio) 
	{
		this.bio = bio;
	}
	
	
	@OneToMany
	@JoinColumn(name ="ancestor_id")
	private List<Ancestor> getAncestors()
	{
		return ancestors;
	}
	
	
	
	
}

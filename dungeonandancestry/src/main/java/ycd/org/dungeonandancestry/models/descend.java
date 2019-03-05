package ycd.org.dungeonandancestry.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class descend
{
	@Id
	@GeneratedValue
	private int id;

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
	private String backstory;

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

	public String getBackstory()
	{
		return backstory;
	}

	public void setBackstory(String backstory)
	{
		this.backstory = backstory;
	}

	public int getId()
	{
		return id;
	}








































}//END CLASS

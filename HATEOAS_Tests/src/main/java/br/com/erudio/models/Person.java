package br.com.erudio.models;
 
import java.io.Serializable;

import org.springframework.hateoas.ResourceSupport;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
 
public class Person extends ResourceSupport implements Serializable{
     
    private static final long serialVersionUID = 1L;
     
    private Long key;
    private String firstName;
    private String lastName;
    private String address;
    private String gender;
    
    public Person() {}
    
    @JsonCreator
    @JsonIgnoreProperties(ignoreUnknown=true)
	public Person(Long key, String firstName, String lastName, String address, String gender) {
		super();
		this.key = key;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.gender = gender;
	}



	public Long getKey() {
		return key;
	}

	public void setKey(Long key) {
		this.key = key;
	}

	public String getFirstName() {
        return firstName;
    }
     
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
     
    public String getLastName() {
        return lastName;
    }
     
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
     
    public String getAddress() {
        return address;
    }
     
    public void setAddress(String address) {
        this.address = address;
    }

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((key == null) ? 0 : key.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (key == null) {
			if (other.key != null)
				return false;
		} else if (!key.equals(other.key))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}
}
package lt.bit.service4hooman.s4h.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "providers")
public class Provider implements Serializable {

<<<<<<< Updated upstream
<<<<<<< Updated upstream
//	private static final long serialVersionUID = 1L;
=======
	private static final long serialVersionUID = 1L;
>>>>>>> Stashed changes
=======
	private static final long serialVersionUID = 1L;
>>>>>>> Stashed changes

	@Id
	@NotNull
	@GeneratedValue
	@Column(name = "id")
	private int id;

	@Column(name = "name", nullable = false)
	@NotBlank // " ", " ", "\n", null
<<<<<<< Updated upstream
<<<<<<< Updated upstream
	@Size(min = 4, max = 25)
=======
	@Size(min = 4, max = 100)
>>>>>>> Stashed changes
=======
	@Size(min = 4, max = 100)
>>>>>>> Stashed changes
	private String name;
	
	@Column(name = "passw", nullable = false)
	@Size(min = 4, max = 20)
	private String passw;

	@Size(min = 7, max = 12)
	private String phone;
	
	private int work;
	
	private LocalDate free;

	@Column(name = "rating")
	private byte rating;

<<<<<<< Updated upstream
<<<<<<< Updated upstream
	public Provider() {
		
	}
	
	public Provider(@NotNull int id, @NotBlank @Size(min = 4, max = 100) String name,
			@Size(min = 4, max = 20) String passw, @Size(min = 7, max = 12) String phone, int work) {
=======
=======
>>>>>>> Stashed changes
	
	
	public Provider(@NotNull int id, @NotBlank @Size(min = 4, max = 100) String name,
			@Size(min = 4, max = 20) String passw, @Size(min = 7, max = 12) String phone, int work) {
		super();
<<<<<<< Updated upstream
>>>>>>> Stashed changes
=======
>>>>>>> Stashed changes
		this.id = id;
		this.name = name;
		this.passw = passw;
		this.phone = phone;
		this.work = work;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassw() {
		return passw;
	}

	public void setPassw(String passw) {
		this.passw = passw;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getWork() {
		return work;
	}

	public void setWork(int work) {
		this.work = work;
	}

	public LocalDate getFree() {
		return free;
	}

	public void setFree(LocalDate free) {
		this.free = free;
	}

	public byte getRating() {
		return rating;
	}

	public void setRating(byte rating) {
		this.rating = rating;
	}

<<<<<<< Updated upstream
<<<<<<< Updated upstream
//	public static long getSerialversionuid() {
//		return serialVersionUID;
//	}
=======
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
>>>>>>> Stashed changes
=======
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
>>>>>>> Stashed changes

}

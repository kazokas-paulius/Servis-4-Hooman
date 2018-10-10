package lt.bit.service4hooman.s4h.provider;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "providers")
public class Provider implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@NotNull
	@Column(name = "id")
	private int id;

	@Column(name = "name", nullable = false)
	@NotBlank // " ", " ", "\n", null
	@Size(min = 4, max = 100)
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

}

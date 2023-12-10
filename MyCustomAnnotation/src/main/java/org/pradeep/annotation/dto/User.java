package org.pradeep.annotation.dto;
import org.pradeep.annotation.annotation.GenderValidation;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@NotBlank
	private String fname;
	private String lname;
	@GenderValidation
	private String gender;
	@Email
	@NotNull
	private String email;
	private long phone;

}

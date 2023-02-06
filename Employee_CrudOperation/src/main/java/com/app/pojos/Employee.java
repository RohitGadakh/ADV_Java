package com.app.pojos;

import java.time.LocalDate;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "Emp_tbl")
public class Employee extends BaseEntity{
    @Column(name = "first_name",length = 20)
	private String firstname;
    @Column(name = "last_name",length = 20)
	private String lastname;
    @Column(length = 30,unique =true)
	private String email;
    @Column(name = "join_Date",length = 20)
	private LocalDate joinDate;
	 @Enumerated(EnumType.STRING)
	private EmpRole role;
	private double salary;
	
	
	
}

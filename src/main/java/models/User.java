package models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import modelsEnum.Group;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {
	
	String nome;
	String username;
	String password;
	Group group;

}

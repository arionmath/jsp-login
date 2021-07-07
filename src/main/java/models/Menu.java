package models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Menu {

			private Integer id;
			private String titulo;
			private String descricao;
			private String url;
			private Integer ordem;

}

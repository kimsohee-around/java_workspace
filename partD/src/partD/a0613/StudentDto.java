package partD.a0613;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {
	private String stuno;
	private String name;
	private int age;
	private String address;
	private String email;
	
}

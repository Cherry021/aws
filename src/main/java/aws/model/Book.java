package aws.model;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Component
@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class Book {
	 private int id;
	 private String name;
	 private double price;

}

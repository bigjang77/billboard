package site.metacoding.billboard.domain.genre;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Genre {
	private Integer id;
	private String name;
	private Timestamp createdAt;
}

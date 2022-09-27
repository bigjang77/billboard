package site.metacoding.billboard.domain.singer;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Singer {
	private Integer id;
	private String name;
	private Integer age;
	private Integer genreId;
	private Integer agencyId;
	private Timestamp createdAt;
}

package site.metacoding.billboard.domain.agency;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Agency {
	private Integer id;
	private String name;
	private String location;
	private Timestamp createdAt;
}

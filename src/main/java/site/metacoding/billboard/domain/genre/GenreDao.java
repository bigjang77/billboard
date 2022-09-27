package site.metacoding.billboard.domain.genre;

import java.util.List;

public interface GenreDao {
	public List<Genre> findAll();
	public Genre findByid(Integer id);
	public void insert(Genre genre);
	public void update(Integer id, Genre genre);
	public void deleteById(Integer id);
}

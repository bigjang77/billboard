package site.metacoding.billboard.domain.singer;

import java.util.List;


public interface SingerDao {
	public List<Singer> findAll();
	public Singer findByid(Integer id);
	public void insert(Singer singer);
	public void update(Integer id, Singer singer);
	public void deleteById(Integer id);
}

package site.metacoding.billboard.domain.agency;

import java.util.List;


public interface AgecnyDao {
	public List<Agency> findAll();
	public Agency findByid(Integer id);
	public void insert(Agency agency);
	public void update(Integer id, Agency agency);
	public void deleteById(Integer id);
}

package net.rah.osbackend.dao;

import java.util.List;

import net.rah.osbackend.dto.Category;

public interface CategoryDAO {

	boolean add(Category category);
	boolean update(Category category);
	boolean delete(Category category);
	
	List<Category> list();
	Category get(int id);
	
	
}

package net.rah.osbackend.dao;

import java.util.List;

import net.rah.osbackend.dto.Category;

public interface CategoryDAO {

	List<Category> list();

	Category get(int id);
	
	
}

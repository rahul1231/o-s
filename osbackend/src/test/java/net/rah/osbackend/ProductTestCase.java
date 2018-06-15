package net.rah.osbackend;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.rah.osbackend.dao.ProductDAO;
import net.rah.osbackend.dto.Product;

public class ProductTestCase {

	private static AnnotationConfigApplicationContext context;

	private static ProductDAO productDAO;

	private Product product;

	@BeforeClass
	public static void init() {

		context = new AnnotationConfigApplicationContext();
		context.scan("net.rah.osbackend.*");
		context.refresh();

		productDAO = (ProductDAO) context.getBean("productDAO");

	}

	/*
	 * @Test public void testCRUDProduct() {
	 * 
	 * //create operation product=new Product();
	 * 
	 * product.setName("Oppo Selfie S53"); product.setBrand("Oppo");
	 * product.setDescription("This is some description for oppo mobile phones!"
	 * ); product.setUnitPrice(25000); product.setActive(true);
	 * product.setCategoryId(3); product.setSupplierId(3);
	 * 
	 * assertEquals("Failure!!!",true,productDAO.add(product));
	 * 
	 * //reading and updating the category product=productDAO.get(2);
	 * product.setName("Samsung Galaxy S7");
	 * 
	 * assertEquals("Failure",true,productDAO.update(product));
	 * 
	 * assertEquals("Failure",true,productDAO.delete(product));
	 * 
	 * //list assertEquals("Failure",6,productDAO.list().size());
	 * 
	 */

	/*
	@Test
	public void testListActiveProducts() {

		assertEquals("Failure",5,productDAO.listActiveProducts().size());
		
	}
	*/
	
	/*
	@Test
	public void testListActiveProductsByCategory() {

		assertEquals("Failure",3,productDAO.listActiveProductsByCategory(3).size());
		assertEquals("Failure",2,productDAO.listActiveProductsByCategory(1).size());
		
	}
	*/
	
	
	@Test
	public void testGetLatestActiveProducts() {

		assertEquals("Failure",3,productDAO.getLatestActiveProducts(3).size());
		
		
	}
	
}

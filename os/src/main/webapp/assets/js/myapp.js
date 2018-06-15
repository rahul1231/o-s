$(function() {
	
	switch(menu) {
	
	case 'About Us':
		$('#about').addClass('active');
		break;
	case 'Contact Us':
		$('#contact').addClass('active');
		break;
	case 'All Products':
		$('#listProducts').addClass('active');
		break;
	default:
		$('#a_'+menu).addClass('active');
		break;
	}
	
	// code for jquery dataTable
	// create a dataset
	var products=[
		
		['1','ABC'],
		['2','ABC'],
		['3','ABC'],
		['4','ABC'],
		['5','ABC'],
		['6','ABC'],
		['7','ABC'],
		['8','ABC']
	];
	
	
	var $table=$('#productListTable');
	
	//execute the below code only where we have this table
	if($table.length) {
		
		//console.log('Inside the table');
		$table.DataTable({
			
			lengthMenu:[[3,5,10,-1],['3 Records','5 Records','10 Records','ALL']],
			pageLength:5,
			data:products
			
		});
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
});
/**
 * 
 */
 $('document').ready(function() {
	
	$('.table .btn').on('click',function(event){
		
		event.preventDefault();
		
		var href= $(this).attr('href');
		
		$.get(href, function(client, status){
			$('#codeEdit').val(client.code);
			$('#nomEdit').val(client.nom);
			$('#emailEdit').val(client.email);

		});	
		
		$('#editModal').modal();
		
	});
	
	
	$('.table #deleteButton').on('click',function(event) {
		event.preventDefault();
		var href = $(this).attr('href');
		$('#deleteModal #delRef').attr('href', href);
		$('#deleteModal').modal();
		
	});
	
	
});

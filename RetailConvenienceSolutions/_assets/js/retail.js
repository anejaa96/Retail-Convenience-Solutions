$(document).ready(function()
{
	var loginSubmitForm = ""; //url for login
	var resetPassword = ""; //url for reset password
	
	$("#submitlogin").submit(function(e) {
		//prevent events from propogation.
		e.preventDefault();
		
		$.ajax ({
			type: "POST",
			url: loginSubmitForm, 
			data: $(this).serialize(),
			dataType : 'json',
			//data : formData,
			success: function(data) 
			{
				if(data === true)
				{
					//redirect to main page
				}
				else
				{
					$('#inputPassword').addClass('animated bounceOutLeft');
				}
		    },
			error: function(data){
				$('#inputPassword').addClass('animated bounceOutLeft');
			}
		});
	})
	
	$("resetPassword").submit(function(e){
		e.preventDefault();
		
		$.ajax ({
			type: "POST",
			url: resetPassword, 
			data: $(this).serialize(),
			success: function(data) 
			{
				if(data === true)
				{
					//redirect to main page
				}
				else
				{
					$('#inputPassword').addClass('animated bounceOutLeft');
				}
		    },
			error: function(data){
				$('#inputPassword').addClass('animated bounceOutLeft');
			}
		});
	});
	
	
});

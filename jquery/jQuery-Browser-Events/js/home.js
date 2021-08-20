function hideAllPages(){
	$('#mainInfoDiv').hide();
	$('#akronInfoDiv').hide();
	$('#minneapolisInfoDiv').hide();
	$('#louisvilleInfoDiv').hide();
	$('#akronWeather').hide();
	$('#minneapolisWeather').hide();
	$('#louisvilleWeather').hide();
}

$(document).ready(function () {
    
	// Page load - only display main section content
	hideAllPages();
	$('#mainInfoDiv').show();
	
	// Navigation Button Behavior
	// Only display Akron content when Akron button is clicked
	// Hide weather info for Akron initially
	// Similar behavior for Minneapolis and Louisville
	$('#akronButton').on('click', function(){
		hideAllPages();
		$('#akronInfoDiv').show();
	});
	$('#minneapolisButton').on('click', function(){
		hideAllPages();
		$('#minneapolisInfoDiv').show();
	});
	$('#louisvilleButton').on('click', function(){
		hideAllPages();
		$('#louisvilleInfoDiv').show();
	});
	$('#mainButton').on('click', function(){
		hideAllPages();
		$('#mainInfoDiv').show();
	});
	
	// Show/Hide Weather Behavior
	// When button is clicked, toggle weather info. Default to Hidden
	$('#akronWeatherButton').on('click', function(){
		$('#akronWeather').toggle();
	});
	$('#minneapolisWeatherButton').on('click', function(){
		$('#minneapolisWeather').toggle();
	});
	$('#louisvilleWeatherButton').on('click', function(){
		$('#louisvilleWeather').toggle();
	});
	
	// Table Row Behavior
	// BG color of table row = "WhiteSmoke" when hovering
	// BG color of table row = "White" when not hovering
	// Does not apply to header row
	$('.table').hover(
		function(){
			$(this).css("background-color", "WhiteSmoke");
		},
		function(){
			$(this).css("background-color", "White");
		}
	);
	
});
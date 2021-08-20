$(document).ready(function () {
	
	// Center all H1 elements
    $("H1").addClass('text-center');
	
	// Center all H2 elements
	$("H2").addClass('text-center');

	// Replace class on "Team Up!" element with class page-header
	$(".myBannerHeading").addClass("page-header");
	$(".myBannerHeading").removeClass("myBannerHeading");
	
	// Change text of "The Squad" to "Yellow Team"
	$("#yellowHeading").text("Yellow Team");
	
	// Change background color for each team to match name of team
	$("#orangeTeamList").css('background-color', 'orange');
	$("#blueTeamList").css('background-color', 'blue');
	$("#redTeamList").css('background-color', 'red');
	$("#yellowTeamList").css('background-color', 'yellow');
	
	// Add Joseph Banks and Simon Jones to Yellow Team list
	$("#yellowTeamList").append('<li>Joseph Banks</li>');
	$("#yellowTeamList").append('<li>Simon Jones</li>');
	
	// Hide element containing "Hide Me"
	$("#oops").hide();
	
	// Remove element containing "Bogus Contact Info"
	$("#footerPlaceholder").remove();
	
	// Add paragraph element with my name and email to footer in Courier font and 24px in height
	$('#footer').append('<p>Austin Wong austinwongdev@gmail.com</p>');
	$('#footer').css({'font-family':'Courier', 'font-size': '24px'});

});
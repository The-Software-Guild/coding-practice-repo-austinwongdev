$(document).ready( function(){
	showMainPage();
	loadDvds();
	returnToMainPage();
})

function loadDvds(){
	clearDvdTable();
	var contentRows = $('#contentRows');
	
	$.ajax({
		type: 'GET',
		url: 'https://tsg-dvds.herokuapp.com/dvds',
		success: function(dvdArray){
			$.each(dvdArray, function(index, dvd){
				var title = dvd.title;
				var releaseYear = dvd.releaseYear;
				var dvdId = dvd.id;
				var director = dvd.director;
				var rating = dvd.rating;
				
				var row = '<tr>';
				row += '<td><button type="button" class="btn btn-link" onclick="viewDvd(' + dvdId + ')">' + title + '</button></td>';
				row += '<td>' + releaseYear + '</td>';
				row += '<td>' + director +'</td>';
				row += '<td>' + rating + '</td>';
				row += '<td>';
				row += '<button type="button" class="btn btn-link" onclick="showEditForm(' + dvdId + ')">Edit</button>';
				row += ' | ';
				row += '<button type="button" class="btn btn-link" onclick="deleteDvd(' + dvdId + ')">Delete</button>';
				row += '</td>';
				row += '</tr>';
				
				contentRows.append(row);
			})
		},
		error: function(){
			$('#errorMessages')
				.append($('<li>')
				.attr({class: 'list-group-item list-group-item-danger'})
				.text('Error calling web service. Please try again later.'));
		}
	})
}

function clearDvdTable(){
	$('#contentRows').empty();
}

function showEditForm(dvdId){
	
}

function deleteDvd(dvdId){
	
}

function showMainPage(){
	$('#mainPage').show();
	$('#viewDvdPage').hide();
}

function hideMainPage(){
	$('#mainPage').hide();
}

function returnToMainPage(){
	
	$('#backToMainPageButton').click(function(event){
		loadDvds();
		showMainPage();
	})
	
}

function viewDvd(dvdId){
	$('#errorMessages').empty();
	
	$.ajax({
		
		type: 'GET',
		url: 'https://tsg-dvds.herokuapp.com/dvd/' + dvdId,
		success: function(data, status){
			$('#viewDvdHeading').text(data.title);
			$('#viewDvdReleaseYear').text(data.releaseYear);
			$('#viewDvdDirector').text(data.director);
			$('#viewDvdRating').text(data.rating);
			$('#viewDvdNotes').text(data.notes);
		},
		error: function(){
			$('#errorMessages')
				.append($('<li>')
				.attr({class: 'list-group-item list-group-item-danger'})
				.text('Error calling web service. Please try again later.'));
		}
	})
	
	hideMainPage();
	$('#viewDvdPage').show();
}
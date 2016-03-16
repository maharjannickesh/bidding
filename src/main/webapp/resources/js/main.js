$(document).ready(function() {
	var baseUrl = "/" + window.location.pathname.split('/')[1];

	$("#bidButton").click(function(e) {
		e.preventDefault();
		var currentUrl = window.location.href;
		var res = currentUrl.split("/");
		var send = JSON.stringify(serializeObject('#bidNow'));
		console.log(send);
		var sendParse = JSON.parse(send);
		console.log(sendParse);
		$.ajax({
			url : baseUrl + '/bid/details/' + res[res.length - 1],
			type : "POST",
			contentType : "application/json",
			dataType : "json",
			data : send,
			beforeSend: function(request) {
				request.setRequestHeader("Content-Type", "application/json");
			},
			success : function() {
				alert("done");
			},
			error : function() {
				alert("erroe");
			}

		});

	});
	
	function serializeObject(formId) {
		var formElements = $(formId).serializeArray();
		var obj = {};
		for(var i=0; i<formElements.length; i++) {
			var elName = formElements[i]["name"];
			var elValue = formElements[i]["value"];
			obj[elName] = elValue;
		}
		return obj;
	};

});
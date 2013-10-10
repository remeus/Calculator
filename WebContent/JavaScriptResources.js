
 
	$(document).ready(function () {
	$("#expForm").submit(function (e) {
		e.preventDefault();
		var expression = $("#expArea").val();
		
		//var operators = /[\+\-\*\%\/]/;
		//var variables = /[a-j]*/i;
		//var digits = /\d/;
		//var invalid = /[^0-9a-j\+\-\*\/\%]/i;
		
		var list = expression.split(" ");
		
		for(var i = 0; i < list.lenght; i++) {
			
			alert(list[i]);
			
			if(invalid.test(list[i])) {
				alert("Invalid Character");
			}
			
			else if(variables.test(list[i])) {
				alert("add variables");
			}
			
			
		} 
		
		alert("Everything fine : " + expression);
		
		
		
		$.post("index.jsp", { }, "text"); ///{varname that code expects : variabledata}
	});
});

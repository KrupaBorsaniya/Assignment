function checkFname() 
	{
		var v=document.index.fname.value;
		var r=/^[A-Za-z]+$/;
		if (v=="") 
		{
			document.getElementById("fname").innerHTML="Please Enter First Name";
		} 
		else if (!r.test(v)) 
		{
			document.getElementById("fname").innerHTML="Please Enter Only Alphabets";
		}
		else 
		{
			document.getElementById("fname").innerHTML="";
		}
	}
	function checkLname() 
	{
		var v=document.index.lname.value;
		var r=/^[A-Za-z]+$/;
		if (v=="") 
		{
			document.getElementById("lname").innerHTML="Please Enter Last Name";
		} 
		else if (!r.test(v)) 
		{
			document.getElementById("lname").innerHTML="Please Enter Only Alphabets";
		}
		else 
		{
			document.getElementById("lname").innerHTML="";
		}
	}
	function Email() 
	{
		var v=document.index.email.value;
		var r= /^[a-zA-Z0-9-_.@#$%&*]+@[A-Za-z]+\.[A-Za-z]{2,4}$/;
		if (v=="") 
		{
			document.getElementById("email").innerHTML="Please Enter Email";
		} 
		else if (!r.test(v)) 
		{
			document.getElementById("email").innerHTML="Please Enter valid Email";
		}
		else 
		{
			document.getElementById("email").innerHTML="";
		}
	}
	function Mobile() 
	{
		var v=document.index.mobile.value;
		var r= /^\d$/;
		if (v=="") 
		{
			document.getElementById("mobile").innerHTML="Please Enter Mobile No";
		} 
		else if (!r.test(v)) 
		{
			document.getElementById("mobile").innerHTML="Please Enter 10-Digit Mobile No";
		}
		else 
		{
			document.getElementById("mobile").innerHTML="";
		}
	}
	
	
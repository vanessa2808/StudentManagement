
<!DOCTYP html>
<html>
	<head>
		<title>Calculator</title>
		<?php
			$error = ''; $number1 = ''; $number2 = ''; $result = '';
			if(isset($_POST['number1']) && isset($_POST['number2'])) {
				if($_POST['number1'] == '') {
					$error = 'Please enter the number';
				} else {
					$error = '';
				}
				if($_POST['number2'] == '') {
					$error = 'Please enter the number';
				} else {
					$error = '';
				} 
			
			}
			$number1 = $_POST['number1'];
			$number1 = $_POST['number2'];

			function  calculator($number1, $number2){
				$result = '';
			switch ($operator) {
				case 'add':
					$result = ($number1) + ($number2);
					break;
				case 'minus':
					$result = ($number1) - ($number2);
					break;
				case 'multi':
					$result = ($number1) * ($number2);
					break;
				case 'div':
					$result = ($number1) / ($number2);
					break;
				
				default:
					break;
			}
			$result = calculator($number1, $number2);
			return $result;

		}

		


		?>
		
	</head>
	<body>
		
		<form action="#" method="POST">
		<table border="1" align="center">
			<tr>
				<th>Your Result</th>
				<th><input type="number" id="result" readonly="readonly"  disabled="disabled" value="<?php echo $result ?>"/></th>
			</tr> 
			
			<tr>
				<th>Enter your first number</th>
				<th><input type="number" name="number1" id="number1" value="<?php  echo $number1 ?>"/></th>
				<p class="error"><?php echo $error; ?></p></p>
			</tr> 

			<tr>
				<th>Enter your second num</th>
				<th><input type="number" name="number2" id="number2" value="<?php echo $number2 ?> "/></th>
				<p class="error"><?php echo $error; ?></p></p>

			</tr>
			
			<input type="submit" name="operator" value="add"/>
			<input type="submit" name="operator" value="minus"/>
			<input type="submit" name="operator" value="multi"/>
			<input type="submit" name="operator" value="div"/>
		</table>
		</form>
	</body>
</html>

// 1
// LocalDate localDate = LocalDate.now();
// // The LocalDate representing a specific day, month and year can be obtained using the “of” method or by using the “parse” method. For example the below code snippets represents the LocalDate for 20 February 2015:

// 1
// 2
// 3
// LocalDate.of(2015, 02, 20);
 
// LocalDate.parse("2015-02-20");

	
// LocalDateTime.now();
// // The below code samples explain how to create an instance using the factory “of” and “parse” methods. The result would be a LocalDateTime instance representing 20 February 2015, 06:30 AM:

// 1
// LocalDateTime.of(2015, Month.FEBRUARY, 20, 06, 30);
// 1
// LocalDateTime.parse("2015-02-20T06:30:00");


// System.currentTimeMillis().
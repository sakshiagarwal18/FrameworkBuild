Use the log method because it uses the addScreenCapture method of Extent Test class to get a screenshot and add it to the Extent Report.

test.log(LogStatus.FAIL,test.addScreenCapture(capture(driver))+ "Test Failed");
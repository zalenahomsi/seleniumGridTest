cd c:\SELENIUM\
java -Dwebdriver.chrome.driver="C:\\AUTO\\chromedriver.exe" -jar selenium-server-standalone-3.141.59.jar -role nodes -hub http://192.168.137.1:444/grid/register -port 5566
pause
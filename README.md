Java Case Study
# Pre-Requesites 
      java 1.8 
      Spring Boot 2.x 
      Maven 2.x
      Junit 
      h2 in memory Database 
 
 API End point Details 
 ------------------------------------
 URL: http://localhost:5050/banktransfer
 Method: POST 
 Request BOdy :  {
  "sourceAccountNumber":  "123456", 
  "targetAccountNumber":  "4567389", 
  "transferAmount": "50.00"
}
      
**********************************      
 H2 DB table TBL_Account     
**********************************      
      
SELECT * FROM TBL_ACCOUNT;
ID  	ACCOUNTNUMBER  	AMOUNT  
1	123456	150
2	456789	150

Error handling 
400 BadRequest in case of account details  incorrect 
400 badrequest in case of insufficent funds for transfer request 

#Covered  smoketest and endpionttest case validation through TDD.
      
      

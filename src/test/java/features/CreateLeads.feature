Feature: Leaftaps Creation of Lead
Scenario: creating the new Lead
Given Go to the Chrome browser
And Navigate to the url
And maximise the browser
And set the timeout
And Enter the username as Demosalesmanager
And enter the password as crmsfa
When Click on login button
Then Verify the login success
Then Click on crmsfa link
Then Click on Leads
Then Click on CreateLeads 
Then Enter the firstname as "Abhijeet"
And enter the lastname as "kumar"
And Enter the companyname as "Infosys12"
Then Click on createLeads button






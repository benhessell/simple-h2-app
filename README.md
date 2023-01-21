# SimpleH2App

### Description
This app allows you to see your employees, and then add new employees. Refresh page and you'll see

### Set Up
Go to Backend and read README.md for BE set up
Go to Frontend and read README.md for FE set up

BE will be running on localhost:5000. Go to localhost:5000/api/employees to ensure its working
FE will be running on localhost:3000.

Or test in terminal with:
curl -v localhost:5000/api/employees/1
curl -X POST localhost:5000/api/employees -H 'Content-type:application/json -d '{"name": "ted", "role": "chef"}'
curl -X POST localhost:5000/api/employees/2 -H 'Content-type:application/json -d '{"name": "Luigi", "role": "chef"}'
curl -X DELETE loclhost:5000/api/employees/3
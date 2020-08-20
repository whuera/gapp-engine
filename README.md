# gapp-engine
gcloud app integration


para probar los servicios usar postman

	http://35.188.165.39:8090/votes
	http://35.188.165.39:8090/areas/listAreas
	http://35.188.165.39:8090/employees
	http://35.188.165.39:8090/employees/listEmployees
	http://35.188.165.39:8090/votes/listVotesForEmployee
	http://35.188.165.39:8090/voteperiods/
	
  estructuras json:
  employee:
   {
        "id": 0,
        "code": "01",
        "nameEmployee": "Pedrito",
        "lastNameEmployee": "Perez",
        "rol": "tester",
        "mail": "pperez@test.com"
    }
    
    votePeriods:
     {
        "idVotePeriods": "1",
        "namePeriod": "Periodo Agosto",
        "dateStart" : "01/08/2020",
        "dateEnd" : "31/08/2020"
    }
    area:
     {
        "nameArea": "GERENCIA",
        "observationArea": "N/A"
    }
    vote:
     {
        "codeEmployee": "001",
        "idVote": 0,
        "voteForEmplooyee": "001",
        "commentsForVote": "mi primer voto"
    }
  

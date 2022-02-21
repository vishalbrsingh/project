POSTMAN

*********************************************************
QUESTIONNAIRES
*********************************************************
    
1. Find question by questionId
	http://localhost:1234/question/2")
   
2. Show all questions
	http://localhost:1234/allQuestions

3. Add question in JSON format in POSTMAN
	http://localhost:1234/addQuestion
{
        "questionId": 1,
        "question": "I have felt cheerful and in good spirits",
        "picId": {
            "id": 1
        },
        "options": [
            {
                "value": 0,
                "response": "At no time"
            },
            {
                "value": 1,
                "response": "Some of the time"
            },
            {
                "value": 2,
                "response": "Less than half of the time"
            },
            {
                "value": 3,
                "response": "More than half of the time"
            },
            {
                "value": 4,
                "response": "Most of the time"
            },
            {
                "value": 5,
                "response": "At all the time"
            }
        ],
        "answer": ""
    }



*********************************************************
USER'S RESPONSES
*********************************************************

1. Show all user's responses
	http://localhost:1234/allResponses

2. Find user's responses by userId
	http://localhost:1234/userResponses/102"
  
3. Add responses in JSON format in POSTMAN
	http://localhost:1234/addUserResponses
 {
        "userId": 101,
        "responses": [
            {
                "value": 5,
                "response": "At all the time"
            },
            {
                "value": 0,
                "response": "At no time"
            },
            {
                "value": 4,
                "response": "Most of the time"
            },
            {
                "value": 2,
                "response": "Less than half of the time"
            },
            {
                "value": 3,
                "response": "More than half of the time"
            }
        ]
    }


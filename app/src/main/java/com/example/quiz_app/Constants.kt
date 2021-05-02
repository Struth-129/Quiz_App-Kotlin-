package com.example.quiz_app

object Constants{
    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()
        val que1 = Question(1,
            "What country does this flag belong to?",
             R.drawable.ic_flag,
            "India",
            "America",
            "NewZealand",
            "Srilanka",
            1
            )
        val que2 = Question(2,
            "What country does this flag belong to?",
            R.drawable.ic_flag,
            "India",
            "America",
            "NewZealand",
            "Srilanka",
            1
        )

        questionsList.add(que1)
        questionsList.add(que2)


        return questionsList
    }
}
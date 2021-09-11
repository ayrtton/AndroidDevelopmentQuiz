package com.example.androiddevelopmentquiz

object Constants {

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val question01 = Question(
            1,
            "What is a program?",
            "A specific task",
            "A tool that helps you write Kotlin code",
            "A series of instructions that a computer system executes to accomplish some action",
            "A defined set of instructions that tells your computer to print \"Happy Birthday!\"",
            3
        )
        questionsList.add(question01)

        return questionsList
    }

}
package com.example.project_term

class animal(var name: String, var score: Float) {
    companion object {
        fun getSampleStudentData(size: Int): ArrayList<animal> {
            val student: ArrayList<animal> = ArrayList()
            for (i in 0 until size) {
                student.add(animal("animal $i", Math.random().toFloat() * 100))
            }
            return student
        }
    }

}
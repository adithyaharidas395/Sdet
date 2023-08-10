class Student:
    def __init__(self,name,grade,age):
        self.name=name
        self.grade=grade
        self.age=age

    def display(self):
        print("Name",self.name)
        print("Grade", self.grade)
        print("Age", self.age)

class School(Student):
    def school_student_Display(self):
        self.display()

student=Student("Adithya","6th",18)
student.display()

school_student=School("Arjun","10th",17)
school_student.school_student_Display()

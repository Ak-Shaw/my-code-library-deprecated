# Object Oriented programing
# for begginer in python 3
# and advanced in python 

class Student:
    def __init__(self, name, age, grade):
        self.name = name
        self.age = age
        self.grade = grade # 0- 100

    def get_grade(self):
        return self.grade


class Coures:
    def __init__(self, name, max_students):
        self.name = name
        self.max_students = max_students
        self.students = []

    def add_student(self, student):
        if len(self.students) < self.max_students:
            self.students.append(student)
            return True
        return False

    def get_average_grade(self):
        value = 0
        for student in self.students:
            value += student.get_grade()

        return value / len(self.students)
        
s1 = Student("Tim", 19, 95)
s2 = Student("Aaryan", 19, 100)
s3 = Student("Hayden", 19, 75)



c1 = Coures("Science", 2)
c1.add_student(s2)
print(c1.add_student(s3))
print(c1.get_average_grade())

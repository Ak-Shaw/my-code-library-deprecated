class Car:

	def __init__(self, brand, stepney):

		self.wheels = 4

		self.brand = brand

		# stepney will be a boolean variable
		self.stepney = stepney


car1 = Car("Mercedes", True)
car2 = Car("Bugati", False)

print(car1.wheels)
print(car1.brand)
print(car1.stepney)

print(car2.wheels)
print(car2.brand)
print(car2.stepney)


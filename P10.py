import math

# FIGURA
class Figure:
    def __init__(self, color):
        self.color = color

    def getColor(self):
        return self.color

    def perimeter(self):
        pass

    def area(self):
        pass

# TRIANGULO
class Triangle(Figure):
    def __init__(self, color, side1, side2, side3):
        super().__init__(color)
        self.side1 = side1
        self.side2 = side2
        self.side3 = side3

    def perimeter(self):
        return self.side1 + self.side2 + self.side3

    def area(self):
        s = self.perimeter() / 2
        return math.sqrt(s * (s - self.side1) * (s - self.side2) * (s - self.side3))

# CIRCULO
class Circle(Figure):
    def __init__(self, color, radius):
        super().__init__(color)
        self.radius = radius

    def perimeter(self):
        return 2 * math.pi * self.radius

    def area(self):
        return math.pi * self.radius ** 2

# RECTANGULO
class Rectangle(Figure):
    def __init__(self, color, width, height):
        super().__init__(color)
        self.width = width
        self.height = height

    def perimeter(self):
        return 2 * (self.width + self.height)

    def area(self):
        return self.width * self.height

# HEXAGONO
class Hexagon(Figure):
    def __init__(self, color, side):
        super().__init__(color)
        self.side = side

    def perimeter(self):
        return 6 * self.side

    def area(self):
        return (3 * math.sqrt(3) * self.side ** 2) / 2

def demonstrate_polymorphism(figures):
    for figure in figures:
        print(f"Color: {figure.getColor()}")
        print(f"Perimeter: {figure.perimeter()}")
        print(f"Area: {figure.area()}\n")

triangle = Triangle("Red", 3, 4, 5)
circle = Circle("Blue", 7)
rectangle = Rectangle("Green", 5, 10)
hexagon = Hexagon("Yellow", 6)

figures = [triangle, circle, rectangle, hexagon]

demonstrate_polymorphism(figures)


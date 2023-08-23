'''Turtle Graphic'''
def color_graphic():
    '''เต่าเล่นสี'''
    import colorsys
    import turtle

    tur = turtle.Turtle()
    screen = turtle.Screen()

    screen.bgcolor("black")
    tur.speed(0)

    n = 36
    h = 0

    for _ in range(460):
        color_plate = colorsys.hsv_to_rgb(h, 1, 0.8)
        h += 1
        tur.color(color_plate)
        tur.left(145)

        for _ in range(5):
            tur.forward(300)
            tur.left(150)
color_graphic()

let Tiempo = 0
let Distancia = 0
basic.forever(function () {
    Tiempo = 0
    // Sensor de Presencia
    Distancia = sonar.ping(
    DigitalPin.P0,
    DigitalPin.P3,
    PingUnit.Centimeters
    )
    if (Distancia < 5) {
        basic.showString("Coloque baso de agua")
        while (Tiempo < 5) {
            // Agua
            pins.digitalWritePin(DigitalPin.P0, 1)
            Tiempo += 1
            basic.showNumber(Tiempo)
            basic.pause(1000)
        }
        
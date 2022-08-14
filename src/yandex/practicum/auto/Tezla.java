package yandex.practicum.auto;

class Tezla extends Automobile {
    protected double autoPilotMaxSpeed;
    protected double autoPilotAcceleration;

    public Tezla() {
        autoPilotMaxSpeed = 60;
        autoPilotAcceleration = 11;
    }

    public void accelerateByAutopilot() {
        if (speed < autoPilotMaxSpeed) {
            speed += autoPilotAcceleration;
            // исправьте метод для ускорения при автопилоте
        }
        else speed = autoPilotMaxSpeed;
    }
@Override
    public void accelerate() {
        if (speed < maxSpeed) {
            speed += acceleration;
        }
        else speed = maxSpeed;
    }
    @Override
    public void brake() {
        if (speed > 0) {
            speed -= brakingSpeed;
            if (speed < 0){
                speed = 0;
            }
        }

    }

    // переопределите метод для ускорения

    // переопределите метод для торможения
}
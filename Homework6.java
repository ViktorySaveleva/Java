class Homework6 {
    public static void main(String[] args) {
        InAnimal[] animals = {
                new Cats("Барсик", 100, 0),
                new Cats("Мурзик",201, 10),
                new Dogs("Шарик",490, 9),
                new Dogs("Бим",490, 10),
                new Dogs("Полкан",505, 15)

        };
        for (InAnimal animal : animals) {
            System.out.println(animal);
            System.out.println(animal.run());
            System.out.println(animal.swim());
            System.out.println();
        }
    }
}

interface InAnimal {
    String run();
    String swim();
}

abstract class Animals implements InAnimal {
    protected String name;
    protected int runDistance;
    protected int swimDistance;

    Animals(String name, int runDistance, int swimDistance) {
        this.name = name;
        this.runDistance = runDistance;
        this.swimDistance = swimDistance;
    }
}

class Cats extends Animals {
    Cats(String name, int runDistance, int swimDistance) {
        super(name, runDistance, swimDistance);
    }

    public int getSwimDistance() {
        return swimDistance;
    }

    public int getRunDistance() {
        return runDistance;
    }

    @Override
    public String run() {
        if (runDistance < 200 && runDistance > 0) {
            return name + " пробежал " + runDistance + "м";
        } else {
            return "Коты столько не бегают!";
        }
    }

    @Override
    public String swim() {
        return "Коты не умеют плавать!";
    }

    @Override
    public String toString() {
        return name + " " + runDistance + ", " + swimDistance;
    }
}

class Dogs extends Animals {
    Dogs(String name, int runDistance, int swimDistance) {
        super(name, runDistance, swimDistance);
    }
        public int getSwimDistance() {
        return swimDistance;
    }

    public int getRunDistance() {
        return runDistance;
    }


    @Override
    public String run() {
        if (runDistance < 500 && runDistance > 0) {
            return name + " пробежал " + runDistance + "м";
        } else {
            return "Собаки столько не бегают!";
        }
    }

    @Override
    public String swim() {
        if (swimDistance < 10 && swimDistance > 0) {
            return name + " проплыл " + swimDistance + "м";
        } else {
            return  "Собаки столько не плавают!";
        }
    }
    @Override
    public String toString() {
        return name + " " + runDistance + ", " + swimDistance;
    }
}








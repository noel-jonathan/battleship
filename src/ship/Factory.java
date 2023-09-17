package ship;

public abstract class Factory {
    public static Ship [] createShips(){
        return new Ship[]{
                createCarrier(),
                createBattleship(),
                createDestroyer(),
                createSubmarine(),
                createPatrolBoat()
        };
    }
    public static Ship createCarrier() {
        return new Ship(5, "Carrier");
    }
    public static Ship createBattleship() {
        return new Ship(4, "Battleship");
    }
    public static Ship createDestroyer() {
        return new Ship(3, "Destroyer");
    }
    public static Ship createSubmarine() {
        return new Ship(3, "Submarine");
    }
    public static Ship createPatrolBoat() {
        return new Ship(2, "PatrolBoat");
    }

}

package practice10_ex2;

public interface AbstractChairFactory {
    VictorianChair createVictorianChair();
    FunctionalChair createFunctionalChair();
    MagicChair createMagicChair();
}

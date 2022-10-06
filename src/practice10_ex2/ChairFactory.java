package practice10_ex2;

public class ChairFactory implements AbstractChairFactory{
    @Override
    public VictorianChair createVictorianChair() {
        return new VictorianChair(100);
    }
    @Override
    public FunctionalChair createFunctionalChair() {
        return new FunctionalChair();
    }
    @Override
    public MagicChair createMagicChair() {
        return new MagicChair();
    }
}

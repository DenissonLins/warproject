package territorios.europa;

import territorios.Territorio;

public final class Moscou extends Territorio {
    
    private final static Moscou instance = new Moscou();
    
    @Override
    public Territorio[] getVizinhos() {
        return new Territorio[]{Suecia.getInstance(), Polonia.getInstance()/*, OrienteMedio.getInstance(), Aral.getInstance(), Onsk.getInstance()*/};
    }

    public static Territorio getInstance() {
        return instance;
    }

    @Override
    public Territorio getTerritorio() {
        return Moscou.getInstance();
    }

    @Override
    public String toString() {
        return "Moscou";
    }
    
}
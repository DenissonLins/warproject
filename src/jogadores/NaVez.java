package jogadores;

public class NaVez extends Estado{
    
    private volatile static NaVez instance;
    private Jogador jogador;
    
    private NaVez(){}
    
    public static NaVez getInstance(){
        NaVez innerInstance = NaVez.instance;
        if(innerInstance == null){
            synchronized(NaVez.class){
                innerInstance = NaVez.instance;
                if(innerInstance == null){
                    NaVez.instance = innerInstance = new NaVez();
                } 
            }
        }
        return innerInstance;
    }
    
    //Padrão de projeto: Template Method
    public void jogar() {
        distribuirExercitos();
        atacar();
        moverExercitos();
        //mudarJogador(Partida.getNextJogador());
    }
    
    private void distribuirExercitos() {
        
    }
    
    private void atacar() {
        
    }
    
    private void moverExercitos() {
        
    }
    
    private static Jogador mudarJogador(Jogador jogador) {
        return jogador;
    }
    
    
}

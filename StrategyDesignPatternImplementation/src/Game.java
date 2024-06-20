import strategies.winningstrategy.WinningStrategy;

public class Game {

    private WinningStrategy _winningStrategy;
    
    public Game(WinningStrategy WinningStrategy){
        _winningStrategy = WinningStrategy;
    }
    
    public void play(){
        System.out.println("Let the game begins");
        _winningStrategy.checkWinner();
    }
}

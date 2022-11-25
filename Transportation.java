package transport;


public abstract class Transportation {
    int acceleration;//속도 변경
    int num;//번호
    int currentGas = 100;//주유량
    String status;//상태

    // 승객탑승		승객			목적지		거리
    abstract void board(int pass, String dest, int dis);

    // 주유량
    abstract void refuel();

    abstract int refuel(int gas) ;

    abstract int board(int pass) ;

}



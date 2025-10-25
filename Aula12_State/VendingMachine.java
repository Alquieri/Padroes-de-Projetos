package Aula12_State;

public class VendingMachine {
    private IState state;

    public VendingMachine(IState state){
        this.state = state;
    }

    public void  setState(IState state){
        this.state = state;
    }
    public void insertCoin() {
        this.state.insertCoin();
    }

    public void ejectCoin() {
        this.state.ejectCoin();
    }

    public void selectProduct() {
        this.state.selectProduct();
    }
}

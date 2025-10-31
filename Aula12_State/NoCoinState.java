package Aula12_State;

public class NoCoinState implements IState {

    //Injeção de dependencia com a maquina
    private VendingMachine context;
    public NoCoinState(VendingMachine context){
        this.context = context;
    }

    @Override
    public void insertCoin() {
        System.out.println("Moeda Inserida");
        this.context.setState(null);
    }

    @Override
    public void ejectCoin() {
       System.out.println("Sem Moeda");
    }

    @Override
    public void selectProduct() {
        System.out.println("Insira uma moeda");
        // this.context.selectProduct(new NoCoinState(context));
    }
  
    
}

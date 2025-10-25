package Aula12_State;

public class HasCoinState implements IState{

       //Injeção de dependencia com a maquina
       private VendingMachine context;
       public HasCoinState(VendingMachine context){
              this.context = context;
       }


       @Override
       public void insertCoin() {
              System.out.println("Ja ha moeda na maquina");
       }

       @Override
       public void ejectCoin() {
              System.out.println("Moeda devolvida");
              this.context.setState(new NoCoinState(context));
       }

       @Override
       public void selectProduct() {
                     System.out.println("Produto Entregue");
       }
    
}

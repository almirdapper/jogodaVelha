package Factory;
import Classes.*;
import View.Xou0;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class JogandoFac {
    ArrayList<Jogando>dadosJogadores = new ArrayList<Jogando>();
    Jogando jogando ;
    String jogador01;
    String jogador02;
    int valorX;
    int valor0;
    
     private int[][] tabela= new int[3][3];
    
    public void JogandoFac(){
        
    }
    
      public void zerarTabela(){
        for(int linha=0 ; linha<3 ; linha++)
            for(int coluna=0 ; coluna<3 ; coluna++)
                tabela[linha][coluna]=0;
    }
      
      public void cadastroJogadores(String jogador1, String jogador2){
        Jogando jogando = new Jogando();
         jogando.setNomeJogador(jogador1);
         jogando.setNomeJogador2(jogador2);
         jogador01 = jogador1;
         jogador02 = jogador2;
         
         
         
         
               
       
      }
      
      public void escolhaXou0 (int x, int o){
        
          
          if(x == 1){
              valorX =1;
              valor0 =-1;
             jogando.setEscolhaX(jogador01);
             jogando.setEscolha0(jogador02);
      }else{
         jogando.setEscolha0(jogador01);
         jogando.setEscolhaX(jogador02);
              valorX =-1;
              valor0 =1;
            }
      }
      
      
      public void jogando(){
          String jj = jogando.getEscolha0();
          JOptionPane.showMessageDialog(null, jj);
          int jog=1;
          for (int i  = 1; i<=8 ; i++){
              if(jog ==1){
                  JOptionPane.showMessageDialog(null, "Sua Vez de Jogar: "+ jogador01);
                  jog = jog+1;
              }else if(jog ==2){
                  JOptionPane.showMessageDialog(null, "Sua Vez de Jogar: "+ jogador02);
                  jog = jog-1;
              }
          }
          
          //return dadosJogadores;
      }
      
      
      
      public int checaLinhas(){
        for(int linha=0 ; linha<3 ; linha++){

            if( (tabela[linha][0] + tabela[linha][1] + tabela[linha][2]) == -3)
                return -1;
            if( (tabela[linha][0] + tabela[linha][1] + tabela[linha][2]) == 3)
                return 1;
        }
        
        return 0;
                
    }
    
    public int checaColunas(){
        for(int coluna=0 ; coluna<3 ; coluna++){

            if( (tabela[0][coluna] + tabela[1][coluna] + tabela[2][coluna]) == -3)
                return -1;
            if( (tabela[0][coluna] + tabela[1][coluna] + tabela[2][coluna]) == 3)
                return 1;
        }
        
        return 0;
                
    }
    
    public int checaDiagonais(){
        if( (tabela[0][0] + tabela[1][1] + tabela[2][2]) == -3)
            return -1;
        if( (tabela[0][0] + tabela[1][1] + tabela[2][2]) == 3)
            return 1;
        if( (tabela[0][2] + tabela[1][1] + tabela[2][0]) == -3)
            return -1;
        if( (tabela[0][2] + tabela[1][1] + tabela[2][0]) == 3)
            return 1;
        
        return 0;
    }

       public boolean tabelaCompleto(){
        for(int linha=0 ; linha<3 ; linha++)
            for(int coluna=0 ; coluna<3 ; coluna++)
                if( tabela[linha][coluna]==0 )
                    return false;
        return true;
    }
}

package Factory;
import Classes.*;


public class JogandoFac {
    Jogando jogando = new Jogando();
    
     private int[][] tabela= new int[3][3];
    
    public void JogandoFac(){
        
    }
    
      public void zerarTabela(){
        for(int linha=0 ; linha<3 ; linha++)
            for(int coluna=0 ; coluna<3 ; coluna++)
                tabela[linha][coluna]=0;
    }
      
      public void cadastroJogadores(String jogador1, String jogador2){
          jogando.setNomeJogador(jogador1);
          jogando.setNomeJogador2(jogador2);
      }
      
      public void escolhaXou0 (String x, String o){
          jogando.setEscolha0(o);
          jogando.setEscolhaX(x);
          
          String j1;
          String j2;
          
          if (j1==jogando.getEscolha0()){
              jogando.getNomeJogador()
          }
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

}

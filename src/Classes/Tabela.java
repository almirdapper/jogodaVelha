package Classes;


public class Tabela {
    private int[][] tabela= new int[3][3];
    
    public Tabela(){
        zerarTabela();
    }
    
    public void zerarTabela(){
        for(int linha=0 ; linha<3 ; linha++)
            for(int coluna=0 ; coluna<3 ; coluna++)
                tabela[linha][coluna]=0;
    }
    
   public void exibeTabela(){
        System.out.println();
        for(int linha=0 ; linha<3 ; linha++){
        
            for(int coluna=0 ; coluna<3 ; coluna++){
                
                if(tabela[linha][coluna]==-1){
                    System.out.print(" X ");
                }
                if(tabela[linha][coluna]==1){
                    System.out.print(" O ");
                }
                if(tabela[linha][coluna]==0){
                    System.out.print("   ");
                }
                
                if(coluna==0 || coluna==1)
                    System.out.print("|");
            }
            System.out.println();
        }
                
    }

    public int getPosicao(int[] tentativa){
        return tabela[tentativa[0]][tentativa[1]];
    }
    
    public void setPosicao(int[] tentativa, int jogador){
        if(jogador == 1)
            tabela[tentativa[0]][tentativa[1]] = -1;
        else
            tabela[tentativa[0]][tentativa[1]] = 1;
        
        exibeTabela();
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

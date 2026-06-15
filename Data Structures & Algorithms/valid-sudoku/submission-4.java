class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> set = new HashSet<>();

        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                char num = board[i][j];

                if(num != '.'){
                    boolean a = set.add(i + "row" + num);
                    boolean b = set.add(j + "col" + num);
                    boolean c = set.add(i/3 + "xd" + j/3 + "box" + num);

                    if(!a || !b || !c){
                        return false;
                    }
                }
            }
        }

        return true;
    }
}

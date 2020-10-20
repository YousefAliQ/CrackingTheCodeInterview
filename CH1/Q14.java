boolean isPalandromOfPermutation(String str){
  int[] table = countCharFrequency(str);
  return checkMaxOneOdd(table);
}

int[] countCharFrequency(String str){
  int[] table = new int[Character.getNumaricValue('z') - Character.getNumaricValue('a') +1];
  
  for(char c: str.toCharArray()){
    table[c - 'a'] +=1;
  }
  return table;
}

Boolean checkMaxOneOdd(int[] table){
  boolean foundOdd =false;
  
  for(int i=0; i<table.lenght(); i++){
    if (table[i] % 2 == 1 ){
      if (foundOdd) 
         return false;
      else 
        foundOdd=true;
    }  
 }
 return true;
}

// Complixity : O(n) 

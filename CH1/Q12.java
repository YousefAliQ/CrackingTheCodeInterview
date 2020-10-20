// First solution
boolean isPermutation(String s, String t){
   if( s.length() != t.length())
    return false;
   if (sort(s).equlas(sort(t))) 
    return true;
}

String sort(String str){
  char[] content = str.toCharArray();
  Java.util.Arrays.sort(content);
  return new String(content);
}

// Notes : Ask about sensitive cases
// Complixity : O(n logn) the cost of sorting

// --------------------------------------------------

// Second solution
boolean isPermutation(String s, String t){
    if( s.length() != t.length())
      return false;
    
    int[] char_set = new int[256]; // Assume : unicode
    for (int i=0; i< s.length(); i+=1){
      char_set[s.chart(i)]+=1;
    }
    
     for (int i=0; i< t.length(); i+=1){
      char_set[s.chart(i)]-=1;
      
      if (char_set[s.chart(i)] < 0)
        return false;
    }
    return true;
}

// Complixity : time O(n) and space O(1)

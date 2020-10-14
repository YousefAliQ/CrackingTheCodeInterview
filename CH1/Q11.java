boolean isStringUnique(String str){

boolean[] content = new boolean[256] // Assume : ASCII

for(int i=0; i<str.length(); i++){
if (content[str.charAt(i)] == true)
  return false;
else
  content[str.charAt(i)] = true;
}

return true;
}

// Complixity : O(n) or O(1) since we know the input is maximum is 265!

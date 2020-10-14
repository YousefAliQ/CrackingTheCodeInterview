String URLify(String str, int trueLength){
  int count = findCount(str, 0, trueLength, ' ');
  int newIndex = trueLength-1 + count*2 
  
  str.chatAt(newIndex+1) = '\n'; ...
  
  for(int oldIndex = trueLenght-1; oldIndex >=0; oldIndex-=1){
    if (str[oldIndex] == ' '){
      str[newIndex] = '0';
      str[newIndex-1] = '2';
      str[newIndex-2] = '%';
      index-=3;
    }
    else{
      str[newIndex] = str.charAt(oldIndex);
      newIndex -=1;
    }
  }
  return str;
}

int findCount(String str, start, end, target){
int count =0;
  for(int i=0; i<end-1; i++){
    if (str[i] == target)
      count +=1;
  }
  return count;
}

package com.Generics;
class Pair<T,T1>
{
    T key;  
    T1 value; 
  
    
    Pair(T obj1, T1 obj2)
    {
        this.key = obj1;
        this.value = obj2;
    }
  
    // To print objects of T and U
    public void print()
    {
        System.out.println(key);
        System.out.println(value);
    }
}
  
// Driver class to test above
class Question4
{
    public static void main (String[] args)
    {
        Pair <String,String> obj =
            new Pair<>("1","ashwini");
  
        obj.print();
     //   Pair <String, java.util.Date> obj1 =
       //         new Pair<String,java.util.Date>(null, null)();
    }
}


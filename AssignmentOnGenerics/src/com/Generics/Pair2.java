package com.Generics;
class Pair1<T,java.util.Date()>
{
    T key;  
    T1 value; 
  
    
    Pair1(T obj1, T1 obj2)
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
        Pair <String,java.util.Date()> obj =
            new Pair<>("1","23-1-2022");
  
        obj.print();
import java.util.*;
public class three6th
{
    public class A
    {
        public void f()
        {
            for (int i = 65; i < 91; i++)
            {
                System.out.print((char) i + " ");
                
            }
            System.out.println();
        }
    }

    public class B extends A
    {
        public void g()
        {
            char greekLetters[] =
            { 'α', 'β', 'γ', 'δ', 'ε', 'ζ', 'η', 'θ', 'ι', 'κ', 'λ', 'μ', 'ν', 'ξ', 'ο', 'π', 'ρ', 'σ', 'τ', 'υ', 'φ',
                    'χ', 'ψ', 'ω' };
            for (int i = 0; i < greekLetters.length; i++)
            {
                System.out.print(greekLetters[i]+" ");
            }
        }
    }
    public static void main(String[] args)
    {
        three6th t = new three6th();
        A a = t.new A();
        B b = t.new B();
        a.f();
        b.g();
    }
    
}

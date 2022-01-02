// (a) pa=a; => legal statement
// (b) pa=&a[0]; => legal statement
// (c) pa++; => legal statement
// (d) a=pa => illegal statement
// (e) a++ => illegal statement
// (f) is pa[i] identical to *(pa+i)? => legal statement
// (g) is &a[i] identical to (a+i)? => legal statement
// (h) is a[i] identical to *(a+i)? => legal statement
// (i) is pa[i] identical to a[i]? => illegal statement
// (j) is void f(char str[]){...}identical to void f(char *str){...}? => legal statement
// (k) If a is an array, is f(&a[2]) identical to f(a+2); => illegal statement
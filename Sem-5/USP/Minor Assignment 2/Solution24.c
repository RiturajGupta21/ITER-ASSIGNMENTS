#include <stdio.h>
void add(double a,double b){
    printf("%.1lf + %.1lf = %.1lf", a, b, a + b);
}
void sub(double a,double b){
    printf("%.1lf + %.1lf = %.1lf", a, b, a + b);
}
void mul(double a,double b){
    printf("%.1lf + %.1lf = %.1lf", a, b, a + b);
}
void div(double a,double b){
    printf("%.1lf + %.1lf = %.1lf", a, b, a + b);
}
int main() {
  char ch;
  double a, b;
  void (*add_ptr)(double,double)=&add;
  void (*sub_ptr)(double,double)=&sub;
  void (*mul_ptr)(double,double)=&mul;
  void (*div_ptr)(double,double)=&div;
  printf("Enter operator (+, -, *, /): ");
  scanf("%c", &ch);
  printf("Enter a and b: ");
  scanf("%lf %lf", &a, &b);
  switch (ch) {
    case '+':
      (*add_ptr)(a,b);
      break;
    case '-':
      (*sub_ptr)(a,b);
      break;
    case '*':
      (*mul_ptr)(a,b);
      break;
    case '/':
      (*div_ptr)(a,b);
      break;
    default:
      printf("Operator is not correct");
  }
  return 0;
}

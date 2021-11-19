#include <stdio.h>
int main()
{
    FILE *inp;
    FILE *outp;
    double score, sum = 0;
    int input_status;
    inp = fopen("input.txt", "r");
    outp = fopen("output.txt", "w");
    int c_a = 0, c_b = 0, c_c = 0, c_f = 0, co = 0;
    input_status = fscanf(inp, "%lf", &score);
    while (input_status == 1)
    {
        if (score >= 0 && score <= 100)
        {
            if (score >= 80)
            {
                c_a++;
            }
            else if (score >= 65)
            {
                c_b++;
            }
            else if (score >= 40)
            {
                c_c++;
            }
            else
            {
                c_f++;
            }
            co++;
            sum += score;
        }
        input_status = fscanf(inp, "%lf", &score);
    }
    fprintf(outp, "A -> %d\nB -> %d\nC -> %d\nF -> %d", c_a, c_b, c_c, c_f);
    fclose(inp);
    fclose(outp);
    printf("Average = %lf", sum / 28);
    return (0);
}
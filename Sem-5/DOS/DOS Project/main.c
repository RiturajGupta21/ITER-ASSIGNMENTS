#include <stdio.h>
#include <stdlib.h>
#include "FCFS.h"
#include "SJF.h"
#include "SRTF.h"
#include "RR.h"
int main()
{
    int choice;
    printf("CPU scheduler for simulating a few CPU scheduling policies.\n");
    while (1)
    {
        printf("\nChosse Option\n1->FCFS\n2->SJF\n3->SRTF\n4->RR\n5->Exit\n");
        scanf("%d", &choice);
        switch (choice)
        {
        case 1:
            FCFS();
            break;
        case 2:
            SFJ();
            break;
        case 3:
            SRTF();
            break;
        case 4:
            RR();
            break;
        case 5:
            exit(0);
        default:
            printf("Wrong Input\n");
            break;
        }
    }
}
#include <stdio.h>
#include "SJF.h"
struct time
{
       int p, art, but, wtt, tat, st;
};
int process(struct time a[], int pro, int t)
{
       int i, minpro, mintime = 999;
       for (i = 0; i < pro; i++)
       {
              if (a[i].art <= t && a[i].st == 0)
              {
                     if (mintime > a[i].but)
                     {
                            mintime = a[i].but;
                            minpro = i;
                     }
              }
       }
       a[minpro].st = 1;
       return minpro;
}
void ganttchart(struct time a[], int gc[], int pro)
{
       int i, x = 0;
       printf("Gantt Chart\n");
       printf("0");
       for (i = 0; i < pro; i++)
       {
              x = x + a[gc[i]].but;
              printf(" -> [P%d] <- %d", a[gc[i]].p, x);
       }
       printf("\n");
       return;
}
void SFJ()
{
       int i, pro, curpro, t = 0, gc[100];
       struct time a[100];
       float avgwt = 0, avgtt = 0;
       printf("Shortest-Job-First (SJF) Scheduling\n");
       printf("Enter Number of Processes\n");
       scanf("%d", &pro);
       for (i = 0; i < pro; i++)
       {
              printf("Enter Arrival Time & Burst Time for Process P%d\n", i);
              a[i].p = i;
              scanf("%d%d", &a[i].art, &a[i].but);
              a[i].st = 0;
       }
       for (i = 0; i < pro; i++)
       {
              curpro = process(a, pro, t);
              a[curpro].wtt = t - a[curpro].art;
              a[curpro].tat = a[curpro].art + a[curpro].but;
              t = t + a[curpro].but;
              avgwt = avgwt + a[curpro].wtt;
              avgtt = avgtt + a[curpro].tat;
              gc[i] = curpro;
       }
       printf("\n<-------------------------------------------------  START ------------------------------------->\n");
       printf("***************************************\n");
       ganttchart(a, gc, pro);
       printf("***************************************\n");
       printf("\n\n\nProcess Details:\n");
       printf("***************************************\n");
       printf("Pro\tArTi\tBuTi\tTaTi\tWtTi\n");
       printf("***************************************\n");
       for (i = 0; i < pro; i++)
       {
              printf("%d\t%d\t%d\t%d\t%d\n", a[i].p, a[i].art, a[i].but, a[i].tat, a[i].wtt);
       }
       avgwt = avgwt / pro;
       avgtt = avgtt / pro;
       printf("\n\n\nOverall Details:\n");
       printf("Average Waiting Time : %.2f\n", avgwt);
       printf("Average Turnaround Time : %.2f\n", avgtt);
       printf("\n<-------------------------------------------------  END ------------------------------------->\n");
}

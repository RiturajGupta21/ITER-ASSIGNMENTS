#include <stdio.h>
#include <stdlib.h>
int **create_matrix(int r, int c) {
int i;
int **m = malloc(r * sizeof(*m));
if (m != NULL) {
for (i = 0; i < r; i++) {
m[i] = malloc(c * sizeof(*m[i]));
if (m[i] == NULL) {
while (i-- > 0) {
free(m[i]);
}
free(m);
return NULL;
}
}
}
return m;
}

void free_matrix(int **m, int r, int c) {
int i;
if (m) {
for (i = 0; i < r; i++) {
free(m[i]);
}
free(m);
}
}

int fill_matrix(int **m, int r, int c, const char *file) {
int i, j;
FILE *temp_file = fopen(file, "r");
if (temp_file == NULL)
return -1;
for (i = 0; i < r; i++) {
for (j = 0; j < c; j++) {
if (fscanf(temp_file, "%d", &m[i][j]) != 1) {
fclose(temp_file);
return -1;
}
}
}
fclose(temp_file);
return 0;
}

int print_matrix(int **m, int r, int c, const char *file) {
int i, j;
FILE *temp_file = fopen(file, "w");
for (i = 0; i < 5; ++i){
int temp = m[i][0];
m[i][0] = m[i][1];
m[i][1] = temp;
}
if (temp_file == NULL)
return -1;
for (i = 0; i < r; i++) {
for (j = 0; j < c; j++) {
fprintf(temp_file, "%d%c", m[i][j], " \n"[j == c - 1]);
}
}
fclose(temp_file);
return 0;
}
int main(void) {
int rows=5, columns=2;
int **matrix = create_matrix(rows, columns);
if (matrix != NULL) {
if (!fill_matrix(matrix, rows, columns, "input.txt")) {
print_matrix(matrix, rows, columns, "output.txt");
}
free_matrix(matrix, rows, columns);
}
return 0;
}


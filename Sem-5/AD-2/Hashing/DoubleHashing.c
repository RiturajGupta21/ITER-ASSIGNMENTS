#include <stdio.h>
#include<stdlib.h>

#define TABLE_SIZE 10

int hashTable[TABLE_SIZE];

void define(){
    for(int i=0;i<TABLE_SIZE;i++){
        hashTable[i]=-1;
    }
}

void insert(){
    int key,index,i,flag=0,hashkey,hashkey2;
    printf("\nEnter a value to insert into hash table\n");
    scanf("%d",&key);
    hashkey=key%TABLE_SIZE;
    hashkey2=1+(key%7);
    for(i=0;i<TABLE_SIZE;i++){
        index=(hashkey+i*hashkey2)%TABLE_SIZE;
        if(hashTable[index] == -1){
            hashTable[index]=key;
            break;
        }
    }
    if(i == TABLE_SIZE)
        printf("\nElement cannot be inserted\n");
}

void search(){
    int key,index,i,flag=0,hashkey,hashkey2;
    printf("\nEnter element to search\n");
    scanf("%d",&key);
    hashkey=key%TABLE_SIZE;
    hashkey2=1+(key %7);
    for(i=0;i<TABLE_SIZE; i++){
        index=(hashkey+i*hashkey2)%TABLE_SIZE;
        if(hashTable[index]==key){
            printf("Value found at index %d",index);
            break;
        }
    }
    if(i == TABLE_SIZE)
        printf("\n Value not found\n");
}

void display(){
     int i;
     printf("Hash Table Elements are \n");
     for(i=0;i< TABLE_SIZE; i++)
         printf("\nAt index %d value =  %d",i,hashTable[i]);
}

int main(){
    define();
    int choice,i;
    while(1){
        printf("\nPress\n1.Insert\n2.Display\n3.Search\n4.Exit\n");
        scanf("%d",&choice);
        switch(choice){
            case 1:
                insert();
                break;
            case 2:
                display();
                break;
            case 3:
                search();
                break;
            case 4:exit(0);
        }
    }
}

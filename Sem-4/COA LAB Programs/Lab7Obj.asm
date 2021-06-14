org 100h
mov ax,1000h
mov ds,ax
mov al,[3000h]
ror al,4 
mov [3001h],al
hlt
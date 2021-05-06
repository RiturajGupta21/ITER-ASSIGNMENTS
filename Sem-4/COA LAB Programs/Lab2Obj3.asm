org 100h
mov ax,0000h
mov ds,ax
mov ax,[3000h]
mov bx,[3002h]
mul bx
mov [3004h],ax
mov [3006h],dx
hlt
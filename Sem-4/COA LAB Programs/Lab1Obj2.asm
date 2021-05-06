org 100h
mov ax,3000h
mov ds,ax
mov ax,[1000h]
mov bx,[1002h]
add ax,bx
mov [1004h],ax
hlt
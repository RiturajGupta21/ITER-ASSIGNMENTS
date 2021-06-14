org 100h
mov ax,1000h
mov ds,ax
mov ax,[3000h]
not ax
mov [3002h],ax
inc ax
mov [3004h],ax
hlt
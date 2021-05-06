org 100h
mov ax,0000h
mov ds,ax
mov ax,[1000h]
mov bx,[1002h]
and ax,bx
mov [1004h],ax
mov ax,[1000h]
or ax,bx
mov [1006h],ax
mov ax,[1000h]
not ax        
mov [1008h],ax
mov ax,[1000h]
xor ax,bx     
mov [100ah],ax
hlt
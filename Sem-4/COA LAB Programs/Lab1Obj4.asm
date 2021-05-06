org 100h
mov ax,1000h
mov ds,ax
mov si,0700h
mov ax,[si]
mov bx,[si+2]
add ax,bx
mov [si+4],ax
hlt
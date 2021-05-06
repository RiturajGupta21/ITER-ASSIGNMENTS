org 100h
mov ax,2000h
mov ds,ax
mov si,600h
mov bx,500h
mov ax,[bx+si]
inc si
inc si
mov cx,[bx+si]
add ax,cx     
inc si
inc si
mov [bx+si],ax
hlt

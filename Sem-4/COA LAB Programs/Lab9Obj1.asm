org 100h
mov ax,1000h
mov ds,ax
mov si,1500h
mov di,1600h
mov cl,[si]
inc si
mov al,[si]
dec cl
l1: inc si
    mov bl,[si]  
    cmp al,bl
    jnc again
    mov al,bl
again: dec cl
       jnz l1
mov [di],al
hlt

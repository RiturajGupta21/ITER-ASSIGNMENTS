org 100h
mov ax,1000h
mov ds,ax
mov si,1500h
mov di,1510h
mov ax,0000h
mov cl,[si]
mov bl,cl
inc si
loop: add al,[si]
adc ah,00
inc si
dec cl
jnz loop
div bl
mov [di],ax
hlt

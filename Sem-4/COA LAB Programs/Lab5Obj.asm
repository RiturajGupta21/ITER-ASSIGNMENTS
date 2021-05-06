org 100h
mov ax,1000h
mov ds,ax
mov al,[1000h]
mov bl,[1002h]
add al,bl
daa
mov [1004h],al
mov al,[1001h]
mov bl,[1003h]
adc al,bl
daa
mov [1005h],al
mov al,00h
adc al,al
mov [1006h],al
hlt
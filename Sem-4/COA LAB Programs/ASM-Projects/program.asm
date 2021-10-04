dosseg
.model small
.stack 100h
.data

.code
main proc
mov ax, @data
mov ds, ax

MOV AX,0600H    ;06 TO SCROLL & 00 FOR FULLJ SCREEN
MOV BH,0h    ;ATTRIBUTE 7 FOR BACKGROUND AND 1 FOR FOREGROUND
MOV CX,0000H    ;STARTING COORDINATES
MOV DX,184FH    ;ENDING COORDINATES
INT 10H        ;FOR VIDEO DISPLAY



;end fragment from forum
xor ah, ah
int 16h

mov ax, 3
int 10h   ; go to text mode


l1:
mov ah, 1
int 21h
cmp al,13
je EndProgram
mov dl,al
mov ah, 2
int 21h
jmp l1


EndProgram:
mov ah, 4ch
int 21h

	
main endp
end main
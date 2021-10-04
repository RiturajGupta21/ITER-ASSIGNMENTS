dosseg
.model small
.stack 100h
.data

string db 10 dup('$')
msg1 db 'Enter String: $'
msg2 db 'Maximum of length is Reached $'
msg3 db 'Enter a character to find $'
msgFound db 'Character is found at $'
msgNotFound db 'Character is not found $'
msgEven db 'Even $'
msgOdd db 'Odd $'



.code
main proc
mov ax, @data
mov ds, ax

mov bl, 1    ; counts the length of string


mov dx, offset msg1
mov ah, 9
int 21h


mov si, offset string
l1:
mov ah, 1
int 21h


cmp al, 13
je EnterKeyPressed

cmp bl, 10
je LengthReached


mov [si], al

inc si
inc bl
jmp l1


LengthReached:

call enterbutton
mov ah, 9
mov dx, offset msg2
int 21h

call enterbutton


mov dx, offset msgEven
mov ah, 9
int 21h



jmp AskCharacter

EnterKeyPressed:

call evenodd

jmp AskCharacter


AskCharacter:
call enterbutton
mov dx, offset msg3
mov ah, 9
int 21h


mov ah, 1
int 21h

mov bl, 1
mov si, offset string
l2:
cmp [si],al
je PrintFound

cmp bl, 10
je NotFound

inc bl
inc si
jmp l2



PrintFound:
call enterbutton
mov dx, offset msgFound
mov ah, 9
int 21h

mov dx, 0

mov dl, bl
add dl, 48
mov ah, 2
int 21h

call enterbutton

mov ah, 4ch
int 21h

NotFound:
call enterbutton
mov dx, offset msgNotFound
mov ah, 9
int 21h

mov ah, 4ch
int 21h

	
main endp

enterbutton proc
mov ah, 2
mov dl, 13
int 21h

mov ah, 2
mov dl, 10
int 21h

ret
enterbutton endp



evenodd proc
dec bl
mov ah, 0
mov al, bl
mov bl, 2

div bl

cmp ah,0

je IsEven


mov dx, offset msgOdd
mov ah, 9
int 21h

ret


IsEven:
mov dx, offset msgEven
mov ah, 9
int 21h

ret


evenodd endp






end main
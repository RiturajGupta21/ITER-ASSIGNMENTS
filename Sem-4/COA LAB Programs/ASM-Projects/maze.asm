title project(EXE)

;****************************************************************************;
;*********************	MACRO TO SCROLL SPECIFIC ROWS to SPECIFIC	*********************;

SetResolution macro srow,scol,erow,ecol,attrib 
	mov ah,06h
	mov al,0h
	mov bh,attrib
	mov ch,srow
	mov cl,scol
	mov dh,erow
	mov dl,ecol
	int 10h

endm 

;****************************************************************************;
;*********************	MACRO TO Copy two Elements into another	*********************;

copy macro row1,oldrow,col1,oldcol

	mov bl,row1
	mov oldrow,bl
	mov bl,col1
	mov oldcol,bl

endm

;****************************************************************************;
;*********************	MACRO TO Print a String	*********************;



print macro string 

mov ah,09h
mov dx,offset string
int 21h
endm

;****************************************************************************************************;
;*********************	MACRO TO write specific element with specific attributes*********************;


write macro  elem,attrib
mov ah,09h
mov bh,0h
mov cx,01h
mov bl,attrib
mov al,elem
int 10h
endm
;****************************************************************************;
;****************************************************************************;

;****************************************************************************************************;
;*******************	MACRO TO SET THE CURSOR POSITION at SPECIFIC Row and column	*****************;

setCursor macro row,col

	mov ah,02
	mov bh,0h
	mov dh,row
	mov dl,col
	int 10h

endm

;****************************************************************************;
;****************************************************************************;


.model small	;define the model of the programe to small
.stack 64h	;reserve 64 h places reserve in Stack for variables

.data
row1 db 23		;row of player
col1 db 37		;column of player
oldrow db 23	;old row of player
oldcol db 37	;old column of player
youwin db 'Well done man you have won the game $'	;string to print the indicator of win
intro db '      Welcome to the MAZE Game $'	;string to print the starting text
spoint db 'Pink point Indicate the starting point $'	;string to print the starting text
epoint db 'Red Point indicate the Ending Point $'	;string to print the starting text
press db 'Press Any Key to Continue $'	;string to print the starting text
ulabel db '^ $'
maze db '   Maze Game   $'

lrlabel db 'Controls are :         < + > $'
dlabel db 'v $'

llabel db 'OOps You Hit the ememy $'
;********************************************************************************


;************* 	rows and columns of enemy 1	*******************
e1col db 49
e1row db 3
e1oldcol db 49
e1oldrow db 3

;************* 	rows and columns of enemy 2	*******************

e2row db 15
e2col db 25
e2oldrow db 15
e2oldcol db 25


;*************************************************************************************


.code

main proc far
jmp gamestart

;*****************	up down left and right labels for player	************************
go_up:
		dec row1
jmp back

go_down:
		inc row1
jmp back

go_left:
		dec col1
jmp back

go_right:
		inc col1
jmp back

;****************************************************************************************

gamestart:	;label indicating that the game is start
mov ax,@data
mov ds,ax


mov ch , 32		;hides the cursor
mov ah , 1
int 10h

call IniFrame
call GameFrame


;**************************************************************
;*************write the @ at starting point
setCursor 23,37	
write '@',0A0h


alive:
	call ENEMY	;call the enemy for the movements of ememies
	
	copy row1,oldrow,col1,oldcol

	
	mov ah,08h	;read the input from the user 
	int 21h
	
	;************************************************************************
	;************* comparisn for the player movement with arrow keys ascii***
	
	cmp al,75		;left
	je go_left
	
	cmp al,72		;up
	je go_up
	
	cmp al,	77	;right
	je go_right
	
	cmp al,80	;down
	je go_down
	
	CMP al,27
	je exit
	
	;**************************************************************************
	
	
	back:	;label after setting up the player row and column
		CALL GameFrame	;draw the game frame
		setCursor row1,col1	;set cursor at row1 and column1
		call GetAttribute	;get the attribute and store it in ah
		cmp ah,0CCh	; compare the ah with the red colour which indicate the winning point
		je win	
		cmp ah,0E0h	;compare the ah with the 0E0h which indicate the enemy
		je lose
		cmp ah,099h	;compare the ah with 099h which indicate the colour of the walls
		jne move_cursor	;jump to move if the colour is not blue
;		cmp ah,099h
		je go_back	;else jump to go back to same position
		
compare:
		cmp al,'+'		;compare the + the hotkey to stop the loop
		jne alive
;**********************************************************************************;
;**************************** label indicatiing the winning goal*******************;
;**********************************************************************************;
win:	
	SetResolution 0,0,24,79,07h
	setCursor 10,23
	print youwin
	mov ah,01h
	int 21h
	jmp exit
	
;**********************************************************************************;
;****************************label indicatiing the loosing goal*******************;
;**********************************************************************************;
lose:

	SetResolution 0,0,24,79,07h
	setCursor 10,23
	print llabel
	mov ah,01h
	int 21h
;**********************************************************************************;
;***************************label indicatiing the exit point*********************************;
;**********************************************************************************;

exit:
	SetResolution 0,0,24,79,07h
	mov ax,4c00h
	int 21h
;**********************************************************************************;
;**********************************************************************************;

move_cursor:	;label to write @ at the cursor positin
		write '@',0A0h


jmp compare



go_back:	;if there is a wal then go back to the previus position

		mov bl,oldrow
		mov row1,bl
		mov bl,oldcol
		mov col1,bl
		setCursor row1,col1
jmp move_cursor



main endp




IniFrame proc near	;procedure to set the front page of the screen

	SetResolution 0,0,24,79,55h		;to clear the screen
	SetResolution 7,19,15,60,0eh
	setCursor 8,21
	print intro
	setCursor 9,21
	print spoint
	setCursor 10,21
	print epoint
	setCursor 11,46
	print ulabel
	setCursor 12,21
	print lrlabel
	setCursor 13,46
	print dlabel
	
	setCursor 14,25
	print press
	
	mov ah,01h
	int 21h
	ret

IniFrame endp 


GameFrame proc near	;procedure to set the frame of the game

SetResolution 0,0,24,79,77h		;to clear the screen
	
	SetResolution 0,0,1,79,99h
	SetResolution 0,0,23,2,99h
	SetResolution 23,0,24,79,99h
	SetResolution 1,77,24,79,99h
	SetResolution 23,36,23,38,0DDh

	SetResolution 10,29,16,50,99h
	SetResolution 13,43,16,44,77h
	SetResolution 13,33,13,44,77h

	SetResolution 14,33,14,34,077h
	SetResolution 15,33,15,34,0CCh

	SetResolution 17,39,22,42,099h

	SetResolution 19,9,20,39,099h
	SetResolution 4,6,20,9,099h

	SetResolution 4,14,5,40,099h
	SetResolution 2,33,5,36,099h

	SetResolution 8,14,16,16,099h
	SetResolution 15,14,16,24,099h

	SetResolution 4,40,7,43,099h
	SetResolution 6,21,14,24,099h
	SetResolution 4,48,9,50,099h
	SetResolution 6,51,7,63,099h	
	SetResolution 10,55,15,57,099h
	SetResolution 6,68,20,71,099h
	SetResolution 18,45,20,71,099h
	
	SetResolution 19,45,20,71,099h
	SetResolution 20,45,23,47,099h
	SetResolution 12,57,13,68,099h
	SetResolution 11,32,11,48,03eh
	setCursor 11,33
	print maze
	setCursor e1row,e1col
	write 'E',0E0h
	setCursor e2row,e2col
	write 'E',0E0h
	
	ret

GameFrame endp

GetAttribute proc near ;procedure to get the attribute of the cursor position

mov ah,08h
mov bh,0h
int 10h
ret
GetAttribute endP


random proc near	;procedure to get a random number

   MOV AH, 00h  ; interrupts to get system time        
   INT 1AH      ; CX:DX now hold number of clock ticks since midnight      

   mov  ax, dx
   xor  dx, dx
   mov  cx, 4    
   div  cx       ; here dx contains the remainder of the division - from 0 to 9
   add  dl, '0'  ; to ascii from '0' to '9'
   ret
random endP


ENEMY proc near	;procedure to control the movements of the ememies 
jmp start1	;jump to go to the starting instruction of the procedure

;labels for enemy 1 movements

e1_up:
	dec e1row 
	
	setCursor e1row,e1col
jmp e1done


e1_down:
	inc e1row 
	
	setCursor e1row,e1col
jmp e1done



e1move:
jmp e1moved

start1:
	copy e1row,e1oldrow,e1col,e1oldcol
	
	call random		;call the procedure random
	
	;**********************************************************************************;
	;****************************set the position acccording to the random number******;
	;**********************************************************************************;

	cmp dl,'0'
	je e1_up
	
		
	
	cmp dl,'1'
	je e1_down
	
	
	cmp dl,'2'
	je e1_right
	cmp dl,'3'
	je e1_left
	e1done:
	call GetAttribute
	cmp ah,0B0h
	je e1_goback
	cmp ah,099h
	jne e1move
	cmp ah,099h
	je e1_goback
	
	
	e1moved:	
	
	jmp enemy1Ind
	
;*****************	up down left and right labels for ememy 1	************************
	e1_left:
	dec e1col 
	
	setCursor e1row,e1col
	jmp e1done
	e1_right:
		inc e1row 
		
		setCursor e1row,e1col
	jmp e1done
	e1_goback:
		copy e1oldrow,e1row,e1oldcol,e1col 
		
		setCursor e1row,e1col
	jmp e1move
	copy e2row,e2oldrow,e2col,e2oldcol
	
	enemy1Ind:
	call random
	cmp dl,'0'
	je e2_up
	cmp dl,'1'
	je e2_down
	cmp dl,'2'
	je e2_right
	cmp dl,'3'
	je e2_left
	
	e2done:
	call GetAttribute
	cmp ah,099h
	jne e2move
	
	cmp ah,099h
	je e2_goback
	
	cmp ah,0B0h
	je e2_goback
	
	e2moved:	
	ret
	
;*****************	up down left and right labels for enemy 2	************************
	e2_up:
	dec e2row
	 setCursor e2row,e2col
		 
	jmp e2done


	e2_down:
		inc e2row
		 setCursor e2row,e2col
		 
	jmp e2done
	e2_left:
		dec e2col
		 setCursor e2row,e2col
		 
	jmp e2done
	e2_right:
		inc e2row
		 setCursor e2row,e2col
		 
	jmp e2done
	e2_goback:
		copy e2oldrow,e2row,e2oldcol,e2col		;use the macro copy to copy the values
		 setCursor e2row,e2col
		jmp e2move
	jmp e2done


	e2move:
	;write 'E',0E0h
	jmp e2moved
ENEMY endp


end main
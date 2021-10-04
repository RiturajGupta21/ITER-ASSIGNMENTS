;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;                        ___   ___   ___    __                                   ;;
;;                       / _ \ / _ \ / _ \  / /                                   ;;
;;                      | (_) | | | | (_) |/ /_                                   ;;
;;                       > _ <| | | |> _ <| '_ \                                  ;;
;;                      | (_) | |_| | (_) | (_) |                                 ;;
;;                       \___/ \___/ \___/ \___/ 		                  ;;
;;         _    _          _   _  _____ __  __          _   _                     ;;
;;        | |  | |   /\   | \ | |/ ____|  \/  |   /\   | \ | |                    ;;
;;        | |__| |  /  \  |  \| | |  __| \  / |  /  \  |  \| |                    ;;
;;        |  __  | / /\ \ | . ` | | |_ | |\/| | / /\ \ | . ` |                    ;;
;;        | |  | |/ ____ \| |\  | |__| | |  | |/ ____ \| |\  |                    ;;
;;        |_|  |_/_/    \_\_| \_|\_____|_|  |_/_/    \_\_| \_|                    ;;
;;                    _____          __  __ ______			          ;;
;;                   / ____|   /\   |  \/  |  ____|			          ;;
;;                  | |  __   /  \  | \  / | |__  			          ;;
;;                  | | |_ | / /\ \ | |\/| |  __| 				  ;;
;;                  | |__| |/ ____ \| |  | | |____ 				  ;;
;;                   \_____/_/    \_\_|  |_|______|				  ;;
;;										  ;;								      										              ;;
;;	 Copyright (C) 2017 Alex Serodio Goncalves				  ;;
;;	 Copyright (C) 2017 Bruna Caroline Russi				  ;;
;;	 Copyright (C) 2017 Guilherme dos Santos Pinto				  ;;
;;                                                                                ;;
;;       This program is free software: you can redistribute it and/or modify     ;;
;;       it under the terms of the GNU General Public License as published by     ;;
;;	 the Free Software Foundation, either version 3 of the License, or        ;;
;;	 (at your option) any later version.                                      ;;
;;                                                                                ;;
;;	 This program is distributed in the hope that it will be useful,          ;;
;;	 but WITHOUT ANY WARRANTY; without even the implied warranty of           ;;
;;	 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the            ;;
;;	 GNU General Public License for more details.                             ;;
;;                                                                                ;;
;;	 You should have received a copy of the GNU General Public License        ;;
;;	 along with this program.  If not, see <http://www.gnu.org/licenses/>.    ;;
;;                                                                                ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

data segment

	hang_ve    		db  11110000b
								db  11110000b
								db  11110000b
								db  11110000b
								db  11110000b
								db  11110000b
								db  11110000b
								db  11110000b
								db  "$"

	hang_ho    		db  00000000b
								db  00000000b
								db  00000000b
								db  00000000b
								db  11111111b
								db  11111111b
								db  11111111b
								db  11111111b
								db  "$"

	rope      		db  00011000b
								db  00011000b
								db  00011000b
								db  00011000b
								db  00011000b
								db  00011000b
								db  00011000b
								db  00011000b
								db	"$"

	head      		db	00011000b
								db	00111100b
								db	01000010b
								db	10100101b
								db	10000001b
								db	01000010b
								db	00111100b
								db	00011000b
								db	"$"

	body_1     		db 	00111100b
								db	00111100b
								db	00111100b
								db	00111100b
								db	00111100b
								db	00111100b
								db	00111100b
								db	00111100b
								db	"$"

	body_2     		db 	00111100b
								db	11111100b
								db	10111100b
								db	10111100b
								db	10111100b
								db	10111100b
								db	10111100b
								db	00111100b
								db	"$"

	body_3     		db 	00111100b
								db	11111111b
								db	10111101b
								db	10111101b
								db	10111101b
								db	10111101b
								db	10111101b
								db	00111100b
								db	"$"

	leg_1     		db 	01100000b
								db	01100000b
								db	01100000b
								db	01100000b
								db	01100000b
								db	01100000b
								db	01100000b
								db	11100000b
								db	"$"

	leg_2   			db 	01100110b
								db	01100110b
								db	01100110b
								db	01100110b
								db	01100110b
								db	01100110b
								db	01100110b
								db	11100111b
								db	"$"


	line   						  dw 00
	column_a  					dw 00

	letter_a     				db 0x0c, 0x1e, 0x33, 0x33, 0x3f, 0x33, 0x33, 0x00, "$"
	letter_b     				db 0xfc, 0x66, 0x66, 0x7c, 0x66, 0x66, 0xfc, 0x00, "$"
	letter_c     				db 0x3c, 0x66, 0xc0, 0xc0, 0xc0, 0x66, 0x3c, 0x00, "$"
	letter_d     				db 0xf8, 0x6c, 0x66, 0x66, 0x66, 0x6c, 0xf8, 0x00, "$"
	letter_e     				db 0xfe, 0x62, 0x68, 0x78, 0x68, 0x62, 0xfe, 0x00, "$"
	letter_f     				db 0xfe, 0x62, 0x68, 0x78, 0x68, 0x60, 0xf0, 0x00, "$"
	letter_g     				db 0x3c, 0x66, 0xc0, 0xc0, 0xce, 0x66, 0x3e, 0x00, "$"
	letter_h     				db 0x33, 0x33, 0x33, 0x3f, 0x33, 0x33, 0x33, 0x00, "$"
	letter_i     				db 0x3c, 0x18, 0x18, 0x18, 0x18, 0x18, 0x3c, 0x00, "$"
	letter_j     				db 0x1e, 0x0c, 0x0c, 0x0c, 0xcc, 0xcc, 0x78, 0x00, "$"
	letter_k     				db 0xe6, 0x66, 0x6c, 0x78, 0x6c, 0x66, 0xe6, 0x00, "$"
	letter_l     				db 0xf0, 0x60, 0x60, 0x60, 0x62, 0x66, 0xfe, 0x00, "$"
	letter_m     				db 0x63, 0x77, 0x7f, 0x7f, 0x6b, 0x63, 0x63, 0x00, "$"
	letter_n     				db 0xc6, 0xe6, 0xf6, 0xde, 0xce, 0xc6, 0xc6, 0x00, "$"
	letter_o     				db 0x1c, 0x36, 0x63, 0x63, 0x63, 0x36, 0x1c, 0x00, "$"
	letter_p     				db 0xfc, 0x66, 0x66, 0x7c, 0x60, 0x60, 0xf0, 0x00, "$"
	letter_q     				db 0x78, 0xcc, 0xcc, 0xcc, 0xdc, 0x78, 0x1c, 0x00, "$"
	letter_r     				db 0xfc, 0x66, 0x66, 0x7c, 0x6c, 0x66, 0xe6, 0x00, "$"
	letter_s     				db 0x78, 0xcc, 0xe0, 0x70, 0x1c, 0xcc, 0x78, 0x00, "$"
	letter_t     				db 0x3f, 0x2d, 0x0c, 0x0c, 0x0c, 0x0c, 0x1e, 0x00, "$"
	letter_u     				db 0x33, 0x33, 0x33, 0x33, 0x33, 0x33, 0x3f, 0x00, "$"
	letter_v     				db 0x33, 0x33, 0x33, 0x33, 0x33, 0x1e, 0x0c, 0x00, "$"
	letter_w     				db 0x63, 0x63, 0x63, 0x6b, 0x7f, 0x77, 0x63, 0x00, "$"
	letter_x     				db 0x63, 0x63, 0x36, 0x1c, 0x1c, 0x36, 0x63, 0x00, "$"
	letter_y     				db 0x33, 0x33, 0x33, 0x1e, 0x0c, 0x0c, 0x1e, 0x00, "$"
	letter_z     				db 0xfe, 0xc6, 0x8c, 0x18, 0x32, 0x66, 0xfe, 0x00, "$"

	str_colon    				db 0x00, 0x30, 0x30, 0x00, 0x00, 0x30, 0x30, 0x00, "$"
	exclamation_mark  				db 0x18, 0x3c, 0x3c, 0x18, 0x18, 0x00, 0x18, 0x00, "$"

	space_line      			db 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, "$"

	str_line       				db 11111111b
	str_empty       			db 00000000b

	str_word         			db "HELLO WORLD$"
	size_none         			db 0
	size_none_minor   			db 0
	mistakes           			db 0
	str_guess   				db 26  dup("$")
	success_guess_counter   	db 0
	alphabet_validation  		db "ABCDEFGHIJKLMNOPQRSTUVWXYZ$"

	msg_restart			dw "PRESS ANY KEY$"
	msg_won					dw "YOU WON$"
	msg_lost				dw "YOU LOSE$"
	already_guessed	dw "ALREADY GUESSED$"
	invalid_char		dw "INVALID CHARACTER$"
	msg_top					dw "THE HANGMAN GAME$"

	alphabet    	dw letter_a
								dw letter_b
								dw letter_c
								dw letter_d
								dw letter_e
								dw letter_f
								dw letter_g
								dw letter_h
								dw letter_i
								dw letter_j
								dw letter_k
								dw letter_l
								dw letter_m
								dw letter_n
								dw letter_o
								dw letter_p
								dw letter_q
								dw letter_r
								dw letter_s
								dw letter_t
								dw letter_u
								dw letter_v
								dw letter_w
								dw letter_x
								dw letter_y
								dw letter_z
								dw "$"

	alplhabet_index      		dw 0
	index_str_word        		dw 0

	str_lines      				db ?

ends

stack segment
    dw   128  dup(0)
ends

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; start ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

code segment
start:

    mov ax, data
    mov ds, ax
    mov es, ax

    mov ah, 0
    mov al, 0dh
    int 10h

    mov si, 0a000h
    mov es, si

the_beginning:

    xor bx, bx
    xor ax, ax
    xor cx, cx
    xor dx, dx
    xor si, si
    xor di, di

    mov mistakes, 0
    mov success_guess_counter, 0

    mov column_a, 2
    mov line, 9

shows_hang_vertical:
		lea si, hang_ve

		cmp bl, 8
		je shows_hang_horizontal

		call shows_letter

		inc bl
		inc line
		jmp shows_hang_vertical

shows_hang_horizontal:

		mov bx, 0
		mov column_a, 2
		mov line, 9
repeat_hang_horizontal:

		lea si, hang_ho

		cmp bl, 4
		je shows_rope

		call shows_letter

		inc bl
		inc column_a
		jmp repeat_hang_horizontal

shows_rope:
		mov column_a, 5
		mov line, 10
		lea si, rope
		call shows_letter

begin:
		mov bx, 0

fills_str_lines:
		cmp str_word[bx],"$"
		je  continues

		cmp str_word[bx]," "
		je  str_spaceline

		mov al,str_line
		mov str_lines[bx], al

		inc bx

		jmp fills_str_lines

str_spaceline:
		mov al,str_empty
		mov str_lines[bx], al
		inc bx
		jmp fills_str_lines

continues:
		mov bx,offset size_none
		sub bx,offset str_word
		sub bx, 1
		mov size_none,bl

		mov bx, 0
		mov dl, size_none
		mov size_none_minor, dl

counts_space_lines:
        cmp str_word[bx], 32
        je discard_space_lines
        cmp str_word[bx], "$"
        je continues_two

        inc bx
        jmp counts_space_lines

discard_space_lines:
        inc bx
        sub size_none_minor, 1
        jmp counts_space_lines

continues_two:
		mov line,14
		mov column_a,16
		mov bx,0
		mov cl,0
		jmp shows_str_lines

shows_str_lines:
		lea si,str_lines[bx]

		cmp cl,size_none
		je  show_msg_top

		cmp column_a, 38
		je  new_line

		call calculate_line_and_column

		mov al,[si]
		mov es:[di], al

		inc bx
		inc cl
		add column_a,2

		jmp shows_str_lines

new_line:
		mov column_a,16
		add line, 2
		jmp shows_str_lines

show_msg_top:
	mov line, 1
	mov column_a, 13
	lea si, msg_top
	call ascii_to_bitmap
	jmp guess

guess:
	mov ah, 08
	int 21h

  call nobreak
  call limpa_line
  push di

  cmp al,96
  ja uppercase

  jmp guess_validation

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; the end ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

uppercase:
    sub al,20h
    jmp guess_validation

nobreak:
    pop  bx
    push bx
    mov  bx,0
    ret

list_alphabet_validation:
    mov str_guess[di],al
    mov str_guess[di+1],"$"
    ret

validated:
    call nobreak
    jmp  ascii

guess_validation:
    mov  di,bx
    cmp  str_guess[bx],al
    je shows_text_two
    cmp  str_guess[bx],"$"
    je   validated

    inc  bx
    jmp  guess_validation

shows_text_two:
  mov line, 5
	mov column_a, 13
	lea si, already_guessed
	call ascii_to_bitmap
	jmp guess

ascii:
    cmp  alphabet_validation[bx],al
    je   eascii
    cmp  alphabet_validation[bx],"$"
    je shows_text_three

    inc  bx
    jmp  ascii

shows_text_three:
  mov line, 5
	mov column_a, 12
	lea si, invalid_char
	call ascii_to_bitmap
	jmp guess

eascii:
    mov  alplhabet_index,bx
    call nobreak
    jmp  comparing

comparing:
    cmp  str_word[bx], al
    je   got_it
    cmp  str_word[bx], "$"
    je   u_wrong

    inc  bx
    jmp  comparing
    mov  index_str_word, bx

got_it:
    call list_alphabet_validation
    mov  index_str_word, bx
    pop  di
    pop  bx

    call letter_bitmap

    call nobreak

    mov  bl, size_none_minor
    cmp  success_guess_counter, bl
    je gameover

    jmp  guess

u_wrong:
    call list_alphabet_validation

    pop  bx
    pop  di

    inc  mistakes
    call verify_mistakes
    cmp  mistakes,6
    je gameover

    jmp  guess

limpa_line:
    mov line, 5
	mov column_a, 8
	repeat_limpa_line:

	lea si, space_line

	cmp column_a, 35
	je returns

	call shows_letter
	add column_a, 1

	jmp repeat_limpa_line

letter_bitmap:
    inc success_guess_counter

    mov cx, ax

    mov  dx, 2
    mov  ax, alplhabet_index
    mul  dx
    mov  di, ax

    mov  si, alphabet[di]
    mov  line, 13
    mov column_a,16

    mov  dx, index_str_word
    add  column_a, dx
    add  column_a, dx

    cmp dx, 54
    jg  line_six
    cmp dx, 43
    jg  line_five
    cmp dx, 32
    jg  line_four
    cmp dx, 21
    jg  line_three
    cmp dx, 10
    jg  line_two

a:
    call shows_letter

    mov ax, cx

    mov bx, index_str_word
    add bx, 1
    add index_str_word, 1

repeat_letter:
    cmp str_word[bx], al
    je  letter_bitmap
    cmp str_word[bx], "$"
    je returns
    inc bx
    add index_str_word, 1
    jmp repeat_letter

line_two:
    add line, 2
    mov column_a, 16
    add column_a, dx
    add column_a, dx
    sub column_a, 22
    jmp a

line_three:
    add line, 4
    mov column_a, 16
    add column_a, dx
    add column_a, dx
    sub column_a, 44
    jmp a

line_four:
    add line, 6
    mov column_a, 16
    add column_a, dx
    add column_a, dx
    sub column_a, 66
    jmp a

line_five:
    add line, 8
    mov column_a, 16
    add column_a, dx
    add column_a, dx
    sub column_a, 88
    jmp a

line_six:
    add line, 10
    mov column_a, 16
    add column_a, dx
    add column_a, dx
    sub column_a, 110
    jmp a

gameover:
    cmp mistakes,6
    je  shows_msg_failure

    jmp shows_msg_success

the_end:
    mov ax, 4c00h
    int 21h

shows_msg_success:
  call clean_screen
  mov line, 10
  mov column_a, 17
	lea si, msg_won
	call ascii_to_bitmap
	jmp shows_msg_restart

shows_msg_failure:
  call clean_screen
  mov line, 10
	mov column_a, 16
	lea si, msg_lost
	call ascii_to_bitmap
	jmp shows_msg_restart

shows_msg_restart:
  mov line, 12
	mov column_a, 14
	lea si, msg_restart
	call ascii_to_bitmap
	jmp restart

clean_screen:
	mov ax,0a000h
  mov es,ax
  xor di,di
  xor ax,ax
  mov cx,32000d
  cld
  rep stosw
  ret

verify_mistakes:
    cmp mistakes, 1
    je shows_head

    cmp mistakes, 2
    je shows_body

    cmp mistakes, 3
    je shows_arm

    cmp mistakes, 4
    je shows_body_complete

    cmp mistakes, 5
    je shows_leg

    cmp mistakes, 6
    je shows_guy_complete

shows_head:
	mov column_a, 5
	mov line, 11
	lea si, head
	call shows_letter
	ret

shows_body:
    mov column_a, 5
	mov line, 11
	lea si, head
	call shows_letter

	mov line, 12
	lea si, body_1
	call shows_letter
	ret

shows_arm:
    mov column_a, 5
	mov line, 11
	lea si, head
	call shows_letter

	mov line, 12
	lea si, body_2
	call shows_letter
	ret

shows_body_complete:
	mov column_a, 5
	mov line, 11
	lea si, head
	call shows_letter

	mov line, 12
	lea si, body_3
	call shows_letter
	ret

shows_leg:
	mov column_a, 5
	mov line, 11
	lea si, head
	call shows_letter

	mov line, 12
	lea si, body_3
	call shows_letter

	mov line, 13
	lea si, leg_1
	call shows_letter
	ret

shows_guy_complete:
	mov column_a, 5
	mov line, 11
	lea si, head
	call shows_letter

	mov line, 12
	lea si, body_3
	call shows_letter

	mov line, 13
	lea si, leg_2
	call shows_letter
	ret

calculate_line_and_column:
	push line
	push column_a
	push ax
	push bx

	mov di, 0

	mov ax, line
	mov bx, 40
	mul bx

	mov bx, 08
	mul bx

	mov line, ax

	add di, column_a
	add di, line

	pop bx
	pop ax
	pop column_a
	pop line

	ret

shows_letter:
	call calculate_line_and_column
writes:
	mov dl, [si]
	cmp dl, "$"
	je returns

	mov es:[di], dl

	add di, 40
	inc si
	jmp writes

returns:
	ret

shows_str_line:

	call calculate_line_and_column

	mov al, [si]
	mov es:[di], al

	ret

clean_guess:
    mov di, 0

repeat_lmp_palp:
    mov str_guess[di], "$"

    cmp di, 25
    je clean_done

    inc di

    jmp repeat_lmp_palp

restart:
    mov ah, 08
    int 21h

    push ax
    call clean_screen
    pop ax

    push di
    call clean_guess

clean_done:
    pop di
    jmp the_end

ascii_to_bitmap:
  push ax
  push bx
  push dx
  push di

repeat_ascii_to_bitmap:
  mov ah, 0
  mov al, [si]
  sub al, 65
  mov dl, 2
  mul dl

  cmp [si], "$"
	je word_finished
	cmp [si], " "
	je empty_space

  mov di, ax

  push si
	mov si, alphabet[di]
	call shows_letter
	pop si

empty_space:
	inc column_a
	inc si

	jmp repeat_ascii_to_bitmap

word_finished:
  pop ax
  pop bx
  pop dx
  pop di
	ret

ends
end start

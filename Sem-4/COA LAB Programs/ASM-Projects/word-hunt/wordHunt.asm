; by Ali Hassan Soomro, +923442230949
; 8086 Assembly, emu8086

data segment
    ; add your data here!
    seed dw 2332h
    rndnum dw 0  
    
    line db 0
    column db 0
    page_number db 0   
    
    word_1 db "ROBERTO$"
    word_2 db "HOUSE$"
    word_3 db "SCHOOL$"
    word_4 db "COMPUTER$"
    word_5 db "FRIEND$"
    
    word_pointer dw dup 5 (?)
ends

stack segment
    dw   128  dup(0)
ends

code segment
start:
    ; set segment registers:
    mov     ax, data
    mov     ds, ax
    mov     es, ax

main_loop:               
    call    set_word_pointer
    call    print_board
    
    mov     cx, 5  
    mov     si, 0 ; index for word_pointer  
    mov     di, 0 ; word direction
    word_print_loop:
    
    ; column
    mov     dh, 30
    mov     al, 00011111b
    call    sort_number    
    
    ; sort only 30 first columns and multuply by 2, the result is only even columns   
    mov     al, dl
    mov     bl, 2
    mul     bl
    mov     dl, al
    
    mov     column, dl
                  
    ; line
    mov     dh, 14       
    mov     al, 00011111b
    call    sort_number
    mov     line, dl              
                      
    ; print              
    call    print_word
    
    xor     di, 00000001b
    add     si, 2
    loop    word_print_loop
    
    call    end_check 
    call    clear_screen
    jmp     main_loop  
      
      
fim:            
    mov     ax, 4c00h ; exit to operating system.
    int     21h    


sort_number:    ; sort a number between 0 and DH; XOR with AL; store in dl
    call    random
    mov     dl, byte ptr rndnum    
    and     dl, al
    
    cmp     dl, dh
    jg      sort_number 
    
    ret


print_word: ; print word stored in SI; DI:0 = vertical, DI:1 = horizontal    
    pushf
    push    ax
    push    dx
    push    si
    push    di

    call    set_cursor
    mov     si, word_pointer[si]
    do_print_word:            
    
    mov     ax, ds:[si]
    cmp     al, "$"
    je      end_print_word
    
    call    print_custon_character   
    inc     si
        
    cmp     di, 0     
    je      inc_line
    cmp     di, 1
    je      inc_column 
    return_check_position:
    
    call    set_cursor 
    
    ; if is horizontal, print blanck space    
    cmp     di, 1
    je      print_blanck_space       
    return_print_blanck_space:
    
    jmp     do_print_word
    
    end_print_word: 
    
    pop     di
    pop     si
    pop     dx
    pop     ax
    popf
    ret 
              
    inc_line:
        inc     line
        jmp     return_check_position
    
    inc_column:
        inc     column        
        jmp     return_check_position 
        
    print_blanck_space:
    mov     al, " "      
    call    print_custon_character
    inc     column
    call    set_cursor
    jmp     return_print_blanck_space
    
 
end_check:  
    pushf
    push    ax
    
    mov     ah, 1
    int     21h
    cmp     al, "E"
    je      fim
    cmp     al, "e"
    je      fim
    
    pop     ax
    popf
    ret
       
       
clear_screen:   ; get and set video mode 
    pushf
    push    ax
    
    mov     ah, 0fh
    int     10h   
    
    mov     ah, 0
    int     10h
    
    pop     ax
    popf
    ret

 
set_word_pointer:
    mov     word_pointer[0], offset word_1
    mov     word_pointer[2], offset word_2
    mov     word_pointer[4], offset word_3
    mov     word_pointer[6], offset word_4
    mov     word_pointer[8], offset word_5
    ret 
 
       
print_custon_character:      ; print content stored in AL   
    pushf
    push    ax
    push    bx
    push    cx

    mov     ah, 09h
    mov     bh, page_number   
    mov     bl, 10 ; color
    mov     cx, 1 ;number of times to print
    int     10h 
    
    pop     cx
    pop     bx
    pop     ax
    popf
    ret
    

print_board:
    pushf
    push    cx
    push    dx

    mov     cx, 24 * 40
    
    print_board_loop:
    ; get new letter
    call    random
    mov     dl, byte ptr rndnum    
    and     dl, 00011111b
    add     dl, "A"
    
    ; check if is letter
    cmp     dl, "A"
    jl      print_board_loop
    cmp     dl, "Z"
    jg      print_board_loop   
    
    ; print letter   
    call    print_character     
    mov     dl, " "        
    call    print_character
    
    loop    print_board_loop 
    
    pop     dx
    pop     cx
    popf        
    ret
    

print_character:    ; print character stored in DL  
    pushf
    push    ax
    
    mov     ah, 2
    int     21h     
    
    pop     ax
    popf
    ret
                   
                 
random:
    pushf    
    push    ax
    push    cx
	push    dx
	
	mov     ah, 2ch
	int     21h
	; segundos em dh
	; usa tambem cx
		
	mov     ax, seed ; ax = seed
	
	add     al, dh

	mov     dx, 8405h ; dx = 8405h
	mul     dx ; mul (8405h * seed) into dword dx:ax

	cmp     ax, seed
	jnz     gotseed ; if new seed = old seed, alter seed
	mov     ah, dl
	inc     ax
    
    gotseed:
	mov     seed, ax ; we have a new seed, so store it
	mov     ax, dx ; al = random number
	mov     rndnum, ax  
	
	pop     dx    
	pop     cx
	pop     ax  
	popf
    ret
      
      
set_cursor:
    pushf
    push    ax
    push    bx
    push    dx
                  
    mov     ah, 2
    mov     bh, page_number
    mov     dh, line
    mov     dl, column
    int     10h
    
    pop     dx
    pop     bx
    pop     ax
    popf    
    ret        
    
    
ends

end start

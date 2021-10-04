; Ali Hassan Soomro +923442230949
; 8086 Assembly, emu8086

data segment
    zero    db "     000000000     ", 10
            db "   00:::::::::00   ", 10
            db " 00:::::::::::::00 ", 10
            db "0:::::::000:::::::0", 10
            db "0::::::0   0::::::0", 10
            db "0:::::0     0:::::0", 10
            db "0:::::0     0:::::0", 10
            db "0:::::0 000 0:::::0", 10
            db "0:::::0 000 0:::::0", 10
            db "0:::::0     0:::::0", 10
            db "0:::::0     0:::::0", 10
            db "0::::::0   0::::::0", 10
            db "0:::::::000:::::::0", 10
            db " 00:::::::::::::00 ", 10
            db "   00:::::::::00   ", 10
            db "     000000000     ", 10, "$"
            
    one     db "  1111111   ", 10
            db " 1::::::1   ", 10
            db "1:::::::1   ", 10
            db "111:::::1   ", 10
            db "   1::::1   ", 10
            db "   1::::1   ", 10
            db "   1::::1   ", 10
            db "   1::::l   ", 10
            db "   1::::l   ", 10
            db "   1::::l   ", 10
            db "   1::::l   ", 10
            db "   1::::l   ", 10
            db "111::::::111", 10
            db "1::::::::::1", 10
            db "1::::::::::1", 10
            db "111111111111", 10, "$"
            
    two     db " 222222222222222    ", 10
            db "2:::::::::::::::22  ", 10
            db "2::::::222222:::::2 ", 10
            db "2222222     2:::::2 ", 10
            db "            2:::::2 ", 10
            db "            2:::::2 ", 10
            db "         2222::::2  ", 10
            db "    22222::::::22   ", 10
            db "  22::::::::222     ", 10
            db " 2:::::22222        ", 10
            db "2:::::2             ", 10
            db "2:::::2             ", 10
            db "2:::::2       222222", 10
            db "2::::::2222222:::::2", 10
            db "2::::::::::::::::::2", 10
            db "22222222222222222222", 10, "$"
            
    three   db " 333333333333333   ", 10
            db "3:::::::::::::::33 ", 10
            db "3::::::33333::::::3", 10
            db "3333333     3:::::3", 10
            db "            3:::::3", 10
            db "            3:::::3", 10
            db "    33333333:::::3 ", 10
            db "    3:::::::::::3  ", 10
            db "    33333333:::::3 ", 10
            db "            3:::::3", 10
            db "            3:::::3", 10
            db "            3:::::3", 10
            db "3333333     3:::::3", 10
            db "3::::::33333::::::3", 10
            db "3:::::::::::::::33 ", 10
            db " 333333333333333   ", 10, "$"
            
    four    db "       444444444  ", 10
            db "      4::::::::4  ", 10
            db "     4:::::::::4  ", 10
            db "    4::::44::::4  ", 10
            db "   4::::4 4::::4  ", 10
            db "  4::::4  4::::4  ", 10
            db " 4::::4   4::::4  ", 10
            db "4::::444444::::444", 10
            db "4::::::::::::::::4", 10
            db "4444444444:::::444", 10
            db "          4::::4  ", 10
            db "          4::::4  ", 10
            db "          4::::4  ", 10
            db "        44::::::44", 10
            db "        4::::::::4", 10
            db "        4444444444", 10, "$"
            
    five    db "555555555555555555 ", 10
            db "5::::::::::::::::5 ", 10
            db "5::::::::::::::::5 ", 10
            db "5:::::555555555555 ", 10
            db "5:::::5            ", 10
            db "5:::::5            ", 10
            db "5:::::5555555555   ", 10
            db "5:::::::::::::::5  ", 10
            db "555555555555:::::5 ", 10
            db "            5:::::5", 10
            db "            5:::::5", 10
            db "5555555     5:::::5", 10
            db "5::::::55555::::::5", 10
            db " 55:::::::::::::55 ", 10
            db "   55:::::::::55   ", 10
            db "     555555555     ", 10, "$"
            
    six     db "        66666666   ", 10
            db "       6::::::6    ", 10
            db "      6::::::6     ", 10
            db "     6::::::6      ", 10
            db "    6::::::6       ", 10
            db "   6::::::6        ", 10
            db "  6::::::6         ", 10
            db " 6::::::::66666    ", 10
            db "6::::::::::::::66  ", 10
            db "6::::::66666:::::6 ", 10
            db "6:::::6     6:::::6", 10
            db "6:::::6     6:::::6", 10
            db "6::::::66666::::::6", 10
            db " 66:::::::::::::66 ", 10
            db "   66:::::::::66   ", 10
            db "     666666666     ", 10, "$"
            
    seven   db "77777777777777777777", 10
            db "7::::::::::::::::::7", 10
            db "7::::::::::::::::::7", 10
            db "777777777777:::::::7", 10
            db "           7::::::7 ", 10
            db "          7::::::7  ", 10
            db "         7::::::7   ", 10
            db "        7::::::7    ", 10
            db "       7::::::7     ", 10
            db "      7::::::7      ", 10
            db "     7::::::7       ", 10
            db "    7::::::7        ", 10
            db "   7::::::7         ", 10
            db "  7::::::7          ", 10
            db " 7::::::7           ", 10
            db "77777777            ", 10, "$"
            
    eight   db "     888888888     ", 10
            db "   88:::::::::88   ", 10
            db " 88:::::::::::::88 ", 10
            db "8::::::88888::::::8", 10
            db "8:::::8     8:::::8", 10
            db "8:::::8     8:::::8", 10
            db " 8:::::88888:::::8 ", 10
            db "  8:::::::::::::8  ", 10
            db " 8:::::88888:::::8 ", 10
            db "8:::::8     8:::::8", 10
            db "8:::::8     8:::::8", 10
            db "8:::::8     8:::::8", 10
            db "8::::::88888::::::8", 10
            db " 88:::::::::::::88 ", 10
            db "   88:::::::::88   ", 10
            db "     888888888     ", 10, "$"
            
    nine    db "     999999999     ", 10
            db "   99:::::::::99   ", 10
            db " 99:::::::::::::99 ", 10
            db "9::::::99999::::::9", 10
            db "9:::::9     9:::::9", 10
            db "9:::::9     9:::::9", 10
            db " 9:::::99999::::::9", 10
            db "  99::::::::::::::9", 10
            db "    99999::::::::9 ", 10
            db "         9::::::9  ", 10
            db "        9::::::9   ", 10
            db "       9::::::9    ", 10
            db "      9::::::9     ", 10
            db "     9::::::9      ", 10
            db "    9::::::9       ", 10
            db "   99999999        ", 10, "$"    
                                             
    line db 0
    column db 0   
    page_number db 0 
    digit_unit db 0
    digit_ten db 0  
    time db 0      
    minute db 0
    second db 0
    current_minute db 0
    current_second db 0    
    
    digit_pointer dw 10 dup(?)                                   
                                             
ends

stack segment
    dw   128  dup(?)
ends         

extra segment
    
ends

code segment
start:
    ; set segment registers:
    mov     ax, data
    mov     ds, ax
    mov     ax, extra
    mov     es, ax

    call    set_digit_pointer
    
    
main_loop:        
    call    load_time 
    
    mov     al, current_second    
    cmp     second, al
    jne     do_print    
                                  
    mov     al, current_minute                                      
    cmp     minute, al
    jne     do_print
       
    jmp     main_loop
                 
    do_print:   
    mov     al, current_minute
    mov     minute, al                        
    mov     al, current_second                
    mov     second, al
    
    call    clear_screen    
    call    print                           
    jmp     main_loop    
       
    jmp     fim
    
    
print:
    ; print minute ----- 
    mov     al, current_minute
    mov     time, al
    call    parse_time
    
    ; hour ten
    mov     al, digit_ten
    call    set_digit
    
    mov     column, 0
    call    print_digit     
    
    ; hour unit                                                                              
    mov     al, digit_unit
    call    set_digit
    
    mov     column, 20
    call    print_digit 
       
    ; print second -----    
    mov     al, current_second
    mov     time, al
    call    parse_time
    
    ; minute ten
    mov     al, digit_ten
    call    set_digit
    
    mov     column, 40
    call    print_digit     
                  
    ; minute unit
    mov     al, digit_unit
    call    set_digit
    
    mov     column, 60
    call    print_digit      
     
    ret
 
 
clear_screen:   ; get and set video mode
    mov     ah, 0fh
    int     10h   
    
    mov     ah, 0
    int     10h
    
    ret
    
    
load_time:      ; save CH = hour, CL = minute, DH = second 
    mov     ah, 2Ch
    int     21h 
    
    mov     current_minute, cl
    mov     current_second, dh
    
    ret
 
set_digit_pointer:
    mov     digit_pointer[0], offset zero
    mov     digit_pointer[2], offset one     
    mov     digit_pointer[4], offset two
    mov     digit_pointer[6], offset three
    mov     digit_pointer[8], offset four
    mov     digit_pointer[10], offset five
    mov     digit_pointer[12], offset six
    mov     digit_pointer[14], offset seven
    mov     digit_pointer[16], offset eight
    mov     digit_pointer[18], offset nine
    
    ret
    
       
set_digit:  ; set digit from al to si
    mov     bl, 2
    mul     bl
    
    mov     si, ax
    mov     si, digit_pointer[si]
    
    ret     
    

parse_time:     ;parse time in "time", loading "digit_ten" and "digit_unit"        
    mov     ah, 0
    mov     al, time
    mov     bl, 10
    div     bl
    mov     digit_ten, al
    mov     digit_unit, ah
    
    ret

 
print_digit:    ;print digit in SI until find "$", set line = 4 and column = column   
    mov     line, 4   
    call    set_cursor
               
    print_main:    
    mov     dh, 0                        
    mov     dl, ds:[si]
    
    cmp     dx, "$"
    je      end_print
    
    cmp     dx, 10
    je      new_line              
          
    mov     ah, 2
    int     21h  
    
    inc     si
    jmp     print_main                    
    
    new_line:
    inc     line
    call    set_cursor 
    inc     si 
    jmp     print_main
    
    end_print:
    ret               
  
                   
set_cursor:              
    mov     ah, 2
    mov     bh, page_number
    mov     dh, line
    mov     dl, column
    int     10h
    
    ret      
    

fim:                
    mov     ax, 4c00h ; exit to operating system.
    int     21h       

      
code ends

end start

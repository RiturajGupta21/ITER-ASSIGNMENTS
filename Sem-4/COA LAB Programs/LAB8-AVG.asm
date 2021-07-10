;ORG 0100H     ; Define the directive
MOV AX, 0000H ;AM
MOV DS, AX    ;AM
MOV SI, 3000H ;Define the source pointer [input location]
MOV DI, 4000H
MOV AX, 0000H
MOV CL, [SI]
MOV BL, CL
INC SI
L1: ADD AL, [SI]
ADC AH, 00H
INC SI
DEC CL
JNZ L1
DIV BL
MOV [DI], AX
HLT
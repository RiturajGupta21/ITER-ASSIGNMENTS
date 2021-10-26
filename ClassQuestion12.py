def moderate(marks,passMarks):
    if marks == passMarks-1 or marks == passMarks-2:
        marks=passMarks
    return marks
def main():
    passMark=40
    marks=input("Enter marks: ")
    intmarks=int(marks)
    moderateMarks=moderate(intmarks,passMark)
    print("Moderated marks: ",moderateMarks)
if __name__ =='__main__':
    main()
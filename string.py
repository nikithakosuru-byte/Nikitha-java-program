def convert(string):
   if len(string)>10:
        first=string[0]
        last=string[-1]
        middle=str(len(string)-2)
        return first+middle+last
        return string
string=input()
print(convert(string))
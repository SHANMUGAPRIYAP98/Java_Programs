class DigitsCount
{
public static void main(String args[])
{
int len=args.length;
int count=0;
System.out.println("Length : "+len);
for(int i=0;i<len;i++)
{
if(args[i].matches("^[0-9]+$"))
{
count++;
}
}
System.out.println("Count of Digits : "+count);
}
}
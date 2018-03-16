#include<stdio.h>
#include<string.h>

int main()
{
    char s[100];
    gets(s);
    int i, len;
    len=strlen(s);
    for(i=len;i>=0;i--)
     printf("%c",s[i]);
    return(0);
}

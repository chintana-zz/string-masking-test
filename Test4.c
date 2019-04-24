#include <stdio.h>
#include <limits.h>

void replace_chars(char []);

int main()
{
        int i;
        char token[] = "898fe51c-f07e-36fa-aed6-8080305772cf"; 
        
        for (i = 0; i < INT_MAX; ++i)
                replace_chars(token);
        return 0;
}

void replace_chars(char token[])
{
        int i;
        for (i = 0; token[i] != '\0'; i++)
                if (i >= 4)
                        token[i] = '*';
}

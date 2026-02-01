#include "two_fer.h"
#include <stddef.h>
#include <string.h>

void two_fer(char *buffer, const char *name)
{
    buffer[0] = '\0';
    if(name != NULL && strlen(name) > 0)
    {
        strcat(buffer, "One for ");
        strcat(buffer, name);
        strcat(buffer, ", one for me.");
        return;
    }
    strcat(buffer, "One for you, one for me.");
}

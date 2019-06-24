#include <stdio.h>
#include "redis.h"

int main() {
    Module *module = Module_new();
    Module_init(module);

    Batch *batch = Batch_new();
    Connection *connection = Connection_new("127.0.0.1:6379");
    Executor *executor = Executor_new();


    return 0;
}
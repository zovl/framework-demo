cmake_minimum_required(VERSION 3.10)
project(c_redis_client_demo C)

set(CMAKE_C_STANDARD 99)

add_executable(c_redis_client_demo main.c)

link_libraries(libredis.so)
add_library(libredis SHARED libredis)
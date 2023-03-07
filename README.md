# Singleton Pattern

This has two examples of the singleton pattern. One is the basic version that will be fine if no multi-threading is going on. If there is Multi-threading, it can still be used using `synchronized` for the `getInstance()` static method, but that is very expensive so not advised if performance is an issue.

The Multi-thread safe option uses "Double-checked locking" to reduce the use of synchronization. It only sets class to `synchonized` if instance hasn't been created yet.

## definition
Allows only one instance of class to be created
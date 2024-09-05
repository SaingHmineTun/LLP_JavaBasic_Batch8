package it.saimao.L59_SealedClass;
/*
1. Sealed class must have child class
2. Permitted classes must extend sealed class
3. And it has to be final class
 */
public sealed class Animal permits Dog {
}

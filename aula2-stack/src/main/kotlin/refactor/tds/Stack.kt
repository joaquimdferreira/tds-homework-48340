package refactor.tds

interface Stack<T> {
    fun push(value : T)
    fun pop(): T
    fun isEmpty(): Boolean
    fun peek(): T
}
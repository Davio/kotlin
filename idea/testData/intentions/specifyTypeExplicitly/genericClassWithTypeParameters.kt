// WITH_RUNTIME
inline fun <reified T> foo<caret>() = of(T::class.java)

class Foo<F>
fun <F> of(c: Class<F>): Foo<Foo<F>> = Foo()
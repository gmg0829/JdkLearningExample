Predicate -- 传入一个参数，返回一个bool结果， 方法为boolean test(T t)
Consumer -- 传入一个参数，无返回值，纯消费。 方法为void accept(T t)
Function -- 传入一个参数，返回一个结果，方法为R apply(T t)
Supplier -- 无参数传入，返回一个结果，方法为T get()
UnaryOperator -- 一元操作符， 继承Function,传入参数的类型和返回类型相同。
BinaryOperator -- 二元操作符， 传入的两个参数的类型和返回类型相同， 继承BiFunction
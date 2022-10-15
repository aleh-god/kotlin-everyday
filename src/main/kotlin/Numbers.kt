/**
 * Test Kotlin task
 */
interface Numbers {

    fun sum(): Int

    /**
     * @param number1 - first number for sum
     * @param number2 - second number for sum
     * @return Numbers - main interface
     */
    class Base(
        private val number1: Int,
        private val number2: Int
    ) : Numbers {

        /**
         * @return Int - two numbers sum
         */
        override fun sum(): Int {
            return number1 + number2
        }
    }
}
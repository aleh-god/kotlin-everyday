interface RansomNote {

    fun run(note: String, magazine: String): Boolean

    class Solution() : RansomNote {

        override fun run(note: String, magazine: String): Boolean {

            val dictNote = mutableMapOf<Char, Int>()
            val dictMagazine = mutableMapOf<Char, Int>()

            for (char in note) {
                dictNote[char] = dictNote.getOrDefault(char, 0) + 1
            }

            for (char in magazine) {
                dictMagazine[char] = dictMagazine.getOrDefault(char, 0) + 1
            }

            for (pair in dictNote) {
                if (!dictMagazine.containsKey(pair.key)) return false
                if (pair.value > (dictMagazine[pair.key] ?: 0)) return false
            }
            return true
        }
    }
}

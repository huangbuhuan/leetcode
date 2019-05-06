import (
	"unicode"
)


func camelMatch(queries []string, pattern string) []bool {
	result := make([]bool, len(queries))
	patternWords := []rune(pattern)
	wordsLength := len(patternWords)
	fmt.Println("words", len(patternWords))
	for i, e := range queries {
		runes := []rune(e)
		flag := true
		k := 0
		for _, v := range runes {
			if k < wordsLength && patternWords[k] == v {
				k++
				continue
			}
			if unicode.IsLower(v) {
				continue
			} else {
				flag = false
				break
			}

		}
		if flag && k == wordsLength {
			result[i] = true
		}
	}

	return result
}

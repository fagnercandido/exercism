// Package twofer provides a execution of twofer example.
package twofer

// TwoFer mix the name with another string.
func TwoFer(name string) string {
	if name == "" {
		name = "you"
	}

	return "One for " + name + ", one for me."
}

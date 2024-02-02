
def one_set(l: list) -> bool:
	print(l)

	s = set()

	for number in l:
		if number in s:
			return True
		s.add(number)

	return False

if __name__ == "__main__":
	print(one_set([1,1,3,4]))
//1 .Fizz Buzz — Given n, create an array from 1 to n. Put "FizzBuzz" for numbers divisible by both 3 and 5, "Fizz" for those divisible by 3, "Buzz" for those divisible by 5, and the number itself as a string otherwise.
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                answer.add("FizzBuzz");
            } else if (i % 3 == 0) {
                answer.add("Fizz");
            } else if (i % 5 == 0) {
                answer.add("Buzz");
            } else {
                answer.add(String.valueOf(i));
            }
        }
        return answer;
    }}

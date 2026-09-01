# Java Pattern & Series Question Bank
### 60 Problems to Build Fundamental Programming Logic
*Compiled for a first-semester "Logic & Foundations" lab — MIT-style rigor, no shortcuts allowed.*

---

## How to Use This Bank

These questions are deliberately **not** about knowing Java syntax — they are about seeing structure before you type a single line. For every question, before writing code, a student should be able to answer:

1. **What varies, and what stays fixed?** (rows, columns, direction, symbol)
2. **What is the relationship between the row index and what gets printed?**
3. **Can I do this in O(n²) time and O(1) extra space, or does it genuinely need more?**

Questions are graded **Easy (E) / Medium (M) / Hard (H) / Challenge (C)**. Nested loops are the expected tool for Sections A–C; Sections D–F increasingly punish brute force and reward *closed-form thinking* — deriving a formula instead of simulating.

A rule for the classroom: **no student may look at a solution before spending 15 minutes on paper deriving the row-by-row logic.** The goal is not the code — it's the derivation.

---

## Section A — Star & Character Patterns (Foundations) [E–M]

For each, `n` is the number of rows, taken as input.

1. **(E)** Right Triangle of Stars
   ```
   *
   * *
   * * *
   * * * *
   ```
2. **(E)** Inverted Right Triangle of Stars (mirror of Q1 vertically)
3. **(E)** Left-Aligned Triangle Using Numbers Instead of Stars
   ```
   1
   1 2
   1 2 3
   ```
4. **(M)** Pyramid (Centered Triangle)
   ```
       *
      * *
     * * *
    * * * *
   ```
5. **(M)** Inverted Pyramid
6. **(M)** Diamond Pattern (pyramid + inverted pyramid stitched at the base)
7. **(M)** Hollow Square (border of `*`, interior blank)
8. **(M)** Hollow Right Triangle
9. **(M)** Hollow Diamond
10. **(M)** Butterfly Pattern
    ```
    *        *
    * *    * *
    * * *  * * *
    * * ** * * *
    * * *  * * *
    * *    * *
    *        *
    ```
11. **(M)** Sandglass / Hourglass Pattern (inverted pyramid + pyramid stacked)
12. **(E)** Right Triangle Using Alphabets
    ```
    A
    A B
    A B C
    ```
13. **(M)** Alphabet Pyramid, repeating the same letter per row
    ```
        A
       B B
      C C C
     D D D D
    ```
14. **(M)** Pascal's Triangle (via `nCr`, not via addition — force them to derive the formula)
15. **(H)** Floyd's Triangle with alternating characters/numbers on each row
16. **(H)** Zig-Zag / Wave Pattern across 3 rows for `n` columns
    ```
     *   *   *
    * * * * * *
       *   *
    ```
17. **(H)** Spiral Number Pattern in an `n x n` Matrix (fill 1…n² spiraling inward)
18. **(H)** Diamond of Numbers where each ring holds a single increasing value (like a target)
19. **(M)** Checkerboard Pattern of `n x n` using two symbols
20. **(H)** Rhombus (parallelogram) Pattern, right-shifted per row

---

## Section B — Numeric & Digit-Driven Patterns [M]

21. **(M)** Pattern where each row repeats the row number:
    ```
    1
    2 2
    3 3 3
    ```
22. **(M)** Reverse Number Pyramid (numbers count down within each row)
    ```
    4 3 2 1
    3 2 1
    2 1
    1
    ```
23. **(M)** Palindromic Number Pyramid
    ```
        1
       2 1 2
      3 2 1 2 3
    ```
24. **(M)** 100 to 1 Pattern — print `100, 97, 94...` (arithmetic step) until below 0, formatted 10-per-line
25. **(M)** Multiplication Table Pattern as a Right Triangle (row `i` prints `i*1 ... i*i`)
26. **(H)** Diamond of Even Numbers only
27. **(H)** Binary Triangle — each row alternates starting bit
    ```
    1
    0 1
    1 0 1
    0 1 0 1
    ```
28. **(H)** Print a Matrix in Boustrophedon (snake) order — left-to-right, then right-to-left alternately
29. **(H)** Diagonal Matrix Pattern — non-zero only on the diagonal, rest `0`
30. **(H)** Print all elements of an `n x n` matrix in anti-diagonal order (top-right to bottom-left bands)

---

## Section C — Arithmetic, Geometric & Classic Series [E–M]

*State the closed-form for the sum before writing loop code.*

31. **(E)** Sum of first `n` natural numbers — write it **iteratively**, then again using Gauss's formula. Compare.
32. **(E)** Sum of squares of first `n` natural numbers, iteratively and via formula `n(n+1)(2n+1)/6`
33. **(E)** Sum of cubes of first `n` natural numbers — verify the identity `(sum of n)² = sum of cubes`
34. **(M)** Sum of an Arithmetic Progression given `a`, `d`, `n` — without a loop
35. **(M)** Sum of a Geometric Progression given `a`, `r`, `n` — handle `r = 1` as an edge case
36. **(M)** Sum of the Harmonic Series `1 + 1/2 + 1/3 + ... + 1/n`
37. **(M)** Alternating Series: `1 - 2 + 3 - 4 + 5 - ...` up to `n` terms
38. **(M)** Series: `1/1! + 2/2! + 3/3! + ...` up to `n` terms
39. **(M)** Taylor Series approximation of `e^x` up to `n` terms (test their understanding of factorial + power together)
40. **(H)** Series: `1 + (1+2) + (1+2+3) + ... + (1+2+...+n)` — derive closed form, don't just nest loops

---

## Section D — Number Theory Series [M–H]

*(This is where "just loop it" starts to break down for large n. Push for efficient checks.)*

41. **(M)** Print the first `n` Prime Numbers — then optimize the primality check to `O(√n)`
42. **(M)** Print the first `n` Fibonacci Numbers iteratively; then require a **O(1) space** version (no array)
43. **(H)** Print the first `n` Fibonacci Numbers using **memoized recursion**, and compare call-count against naive recursion for `n = 40`
44. **(M)** Print all Perfect Numbers up to `n` (e.g., 6, 28, 496) — a number equal to the sum of its proper divisors
45. **(M)** Print all Armstrong Numbers up to `n` (e.g., 153 = 1³+5³+3³)
46. **(H)** Print the first `n` Twin Prime pairs `(p, p+2)`
47. **(M)** Print all Palindromic Numbers between two given ranges
48. **(H)** Generate the first `n` terms of the Collatz sequence starting from a given number, and report the sequence length (the "hailstone" problem)
49. **(H)** Print the first `n` Catalan Numbers — first via the recursive definition, then via the direct binomial formula, and have students **prove** the two are equivalent
50. **(H)** Print the first `n` terms of the Lucas Sequence and identify the relationship to Fibonacci (`L(n) = F(n-1) + F(n+1)`)
51. **(M)** Sum of digits repeated until a single digit remains (digital root) — solve iteratively, then via the `1 + (n-1) % 9` shortcut
52. **(H)** Generate Pythagorean Triplets `(a, b, c)` where `a² + b² = c²` for `a, b, c ≤ n` — brute force first, then optimize to avoid the innermost loop using Euclid's formula

---

## Section E — Matrix-Based Pattern Logic [H]

53. **(H)** Rotate an `n x n` matrix 90° clockwise **in-place** (no extra matrix)
54. **(H)** Print the boundary elements of a matrix in clockwise order, layer by layer (like peeling an onion)
55. **(H)** Given an `n x n` matrix, print it in a diagonal zig-zag order (as used in JPEG compression)
56. **(H)** Fill an `n x n` matrix with numbers in a clockwise spiral **starting from the center**, outward
57. **(H)** Given an `m x n` matrix, transpose it in-place *without* using a second matrix (square case), and explain why the non-square case forces extra space

---

## Section F — Challenge Tier: Efficiency Is the Question, Not the Pattern [C]

*These are meant to expose the difference between a student who can "make it print right" and one who can "make it print right fast." Ask them to state Big-O of their first attempt, then improve it.*

58. **(C)** Given `n` up to 10⁷, print the count of primes below `n` using the **Sieve of Eratosthenes**, and require them to justify why trial division per number is infeasible at this scale.
59. **(C)** Given `n` up to 90, compute the `n`th Fibonacci number using **fast doubling** (`O(log n)`) instead of the naive `O(n)` loop, and have them explain the recurrence `F(2k) = F(k)[2F(k+1) − F(k)]`.
60. **(C)** Construct Pascal's Triangle up to row `n` (n up to 30) using only **O(n) auxiliary space** (one rolling row updated right-to-left) instead of an `O(n²)` 2D array.
61. **(C)** Print the diagonal traversal of a large sparse matrix (mostly zeroes, given as a list of non-zero coordinates) without allocating the full `n x n` grid.
62. **(C)** Given a target sum `S` and limit `n`, find all subsets of `{1, ..., n}` whose elements form a "staircase pattern sum" (i.e., sum of a contiguous number range equals `S`) — solve via nested loops first (`O(n²)`), then via a **sliding window** (`O(n)`), and have the student articulate exactly why the window can be maintained without recomputation.

---

## Suggested Grading Rubric (per question)

| Criterion | Weight |
|---|---|
| Correct output for given `n` | 30% |
| Edge case handling (n=0, n=1, negative input) | 15% |
| Time/space complexity stated correctly | 20% |
| Code clarity — meaningful loop variables, no magic numbers | 15% |
| Ability to explain the *derivation* verbally, not just recite code | 20% |

**A student who gets Section A perfect but cannot explain *why* the inner loop bound is `2*i - 1` in the diamond pattern has memorized, not understood — do not pass them on pattern recognition alone.**

---

## Suggested Session Structure (for a 90-minute lab)

- **0–15 min:** Cold-call 2–3 students to derive (on the whiteboard, no code) the row/column relationship for a Section A problem they haven't seen.
- **15–60 min:** Timed solo coding — assign 4 problems spanning Sections A, C, D, and one from E/F, scaled to skill level.
- **60–80 min:** Pair review — each student explains their neighbor's code back to them, out loud, before checking correctness.
- **80–90 min:** Reveal the O(n log n) or O(log n) version of one "obvious O(n²)" problem from the set (e.g., Q58 or Q59) as a teaser for the next lab on algorithmic thinking.
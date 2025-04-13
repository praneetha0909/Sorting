# 📊 Sorting Algorithms Comparison & Visualization
---

## 📌 Overview

This project focuses on implementing and comparing the performance of seven widely known sorting algorithms. The comparison is based on run-time performance across different input sizes. A **web-based GUI** is also developed using **HTML** and **JavaScript** to allow user interaction, algorithm selection, and dynamic performance comparison.

---

## 🔢 Implemented Sorting Algorithms

Each algorithm is implemented in JavaScript with corresponding runtime analysis:

- 🔁 **Bubble Sort** – Simple comparison sort (O(n²))
- 🧲 **Selection Sort** – Selects the minimum each pass (O(n²))
- 📥 **Insertion Sort** – Inserts elements into their correct position (O(n²))
- ⚡ **Quick Sort** – Divide and conquer using pivot (O(n log n) avg, O(n²) worst)
- 🧬 **Merge Sort** – Recursive divide and merge (O(n log n))
- 🏗️ **Heap Sort** – Binary heap-based sorting (O(n log n))
- 🎯 **Three-Way Quick Sort** – Optimized for duplicate-heavy datasets (O(n log n))

---

## 🧪 Methodology

- Input arrays of various sizes were generated.
- The runtime of each algorithm was measured using `System.nanoTime()` in Java.
- For GUI, the user selects algorithms and input size; results are logged in the browser console.
- Performance is displayed in **bar charts** for better visual understanding.

---

## 🖥️ GUI Features

- Built using **HTML + JavaScript**
- Input field for custom array size
- Drop-down selection for 3 algorithms
- Comparison output printed to **browser console**
- Launch by opening `index.html` in any browser

### Example Use:

1. Open in Chrome/Edge
2. Enter input size (e.g., 1000)
3. Select 3 algorithms to compare
4. Click **Compare** and view performance logs in the browser console

---

## 📊 Performance Comparison

### Runtime Trends

| Algorithm           | Best Use Case                     | Time Complexity |
|---------------------|-----------------------------------|-----------------|
| Bubble Sort         | Small datasets                    | O(n²)           |
| Selection Sort      | Small datasets                    | O(n²)           |
| Insertion Sort      | Nearly sorted or small datasets   | O(n²)           |
| Quick Sort          | General-purpose                   | O(n log n)      |
| Merge Sort          | Stable sorting, large datasets    | O(n log n)      |
| Heap Sort           | In-place, consistent performance  | O(n log n)      |
| Three-Way Quick Sort| Duplicate-heavy arrays            | O(n log n)      |

Charts were generated for input sizes of 1000 and 5000, highlighting performance differences visually.

---
## 📈 Runtime Performance Comparison

The bar charts below show the execution time (in nanoseconds) for each sorting algorithm based on different input sizes.

### 🔹 Input Size: 1000

![Runtime Comparison (1000)](assets/size-1000.jpg)

### 🔹 Input Size: 5000

![Runtime Comparison (5000)](assets/size-5000.jpg)

---

## 💡 Lessons Learned

- 🧠 Choosing the right sorting algorithm matters — both theoretically and practically.
- 🧪 Runtime measurements provide real-world insights into algorithm efficiency.
- 🌐 Front-end integration helps bridge algorithmic logic and user experience.

---

## 🙌 Acknowledgements

- Special thanks to **CSE 5311 Faculty** at UTA for guidance and encouragement.
- This project enriched understanding of time complexity, recursion, heap structure, and GUI development.

---

## 📎 Future Enhancements

- Add visualization of step-by-step sorting.
- Include more sorting algorithms like Radix Sort or Shell Sort.
- Improve GUI styling and enable download of comparison charts.

---

## 🚀 How to Run

1. Clone this repo:
```bash
git clone https://github.com/yourusername/sorting-algorithms-comparison.git



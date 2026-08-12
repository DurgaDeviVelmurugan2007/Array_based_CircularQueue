# Circular Queue – Airport Check-In System

## 📌 Description

=> This project implements an **array-based Circular Queue in Java** to simulate an airport check-in counter.
=> Passengers are processed in **FIFO (First In, First Out)** order, with circular movement of the `front` and `rear` positions.

## 🎯 Objective

To implement and demonstrate the operations of a circular queue using an array, including:

* Enqueue
* Dequeue
* Queue Overflow
* Circular movement of `front` and `rear`

## 📝 Problem Statement

An airport check-in counter processes passengers using a circular queue. The queue size is limited to **4 passengers** due to staff shortage.

Passengers arrive in the order:

`P1, P2, P3, P4, P5`

* Enqueue all passengers and demonstrate overflow when P5 arrives.
* Dequeue two passengers.
* Enqueue P6 and P7.
* Display the queue along with `front` and `rear` updates.

## ⚙️ Operations Performed

| Operation  | Result                        |
| ---------- | ----------------------------- |
| P1 Enqueue | Added to queue                |
| P2 Enqueue | Added to queue                |
| P3 Enqueue | Added to queue                |
| P4 Enqueue | Added to queue                |
| P5 Enqueue | Queue Overflow                |
| P1 Dequeue | Removed                       |
| P2 Dequeue | Removed                       |
| P6 Enqueue | Added using circular position |
| P7 Enqueue | Added using circular position |

## 💻 Technologies Used

* **Language:** Java
* **Data Structure:** Circular Queue
* **Implementation:** Array

## 🔄 Circular Queue Concept

A circular queue connects the last position of the array back to the first position.

```text
Index:   0    1    2    3
         ↑             ↓
         └─────────────┘
```

When `rear` reaches the last index, it moves back to index `0` using:

```java
rear = (rear + 1) % size;
```

Similarly, `front` moves circularly using:

```java
front = (front + 1) % size;
```

## 📤 Sample Output

```text
P1 ENQUEUED
Queue : P1
Front = 0 Rear = 0

P2 ENQUEUED
Queue : P1 <- P2
Front = 0 Rear = 1

P3 ENQUEUED
Queue : P1 <- P2 <- P3
Front = 0 Rear = 2

P4 ENQUEUED
Queue : P1 <- P2 <- P3 <- P4
Front = 0 Rear = 3

P5 cannot be added queue overflow!

P1 DEQUEUED
Queue : P2 <- P3 <- P4
Front = 1 Rear = 3

P2 DEQUEUED
Queue : P3 <- P4
Front = 2 Rear = 3

P6 ENQUEUED
Queue : P3 <- P4 <- P6
Front = 2 Rear = 0

P7 ENQUEUED
Queue : P3 <- P4 <- P6 <- P7
Front = 2 Rear = 1
```

## ✅ Result

The **Circular Queue using Array** was successfully implemented in Java. The program demonstrates FIFO processing, queue overflow, enqueue, dequeue, and circular movement of the `front` and `rear` pointers.


# 📌 Meeting Rooms III – Approach (Priority Queue Strategy)

## 🧠 Approach

We use **two Priority Queues**:

### 1️⃣ Available Rooms Queue

* Stores **free rooms**
* Always assigns the **smallest room number first**
* Type: `Min Heap`

```
availableRooms → [roomNumber]
```

---

### 2️⃣ Busy Rooms Queue

* Stores rooms currently in use
* Keeps track of **when each room becomes free**
* Structure:

```
busyRooms → {endTime, roomNumber}
```

Sorted by:

* earliest `endTime`
* if tie → smaller `roomNumber`

---

## 📌 Steps

### Step 1: Sort meetings

Sort all meetings based on:

```
start time
```

So meetings are processed chronologically.

---

### Step 2: Release finished rooms

Before assigning a meeting:

```
while busyRooms.peek().endTime ≤ meeting.start
    move room → availableRooms
```

This frees rooms whose meetings already ended.

---

### Step 3: Assign room

### Case A: Room available

If:

```
availableRooms NOT empty
```

Assign:

```
smallest room number
```

Update:

```
busyRooms.add({meeting.endTime, room})
```

Increase count:

```
roomUsage[room]++
```

---

### Case B: No room available

Delay meeting until earliest room becomes free:

```
earliestRoom = busyRooms.poll()
```

New meeting time:

```
newEndTime = earliestRoom.endTime + duration
```

Push back:

```
busyRooms.add({newEndTime, room})
```

Increase usage:

```
roomUsage[room]++
```

---

### Step 4: Return answer

Return room with:

```
maximum meetings hosted
```

If tie:

```
return smallest room number
```

---

## ⏱️ Complexity Analysis

Let:

```
n = number of rooms
m = number of meetings
```

### Time Complexity

```
Sorting meetings → O(m log m)
Heap operations → O(m log n)
```

Overall:

```
O(m log m + m log n)
≈ O(m log m)
```

(Usually written as **O(m log n)** in discussion context)

---

### Space Complexity

```
availableRooms heap → O(n)
busyRooms heap → O(n)
roomUsage array → O(n)
```

Total:

```
O(n)
```

---


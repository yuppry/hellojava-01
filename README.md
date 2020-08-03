# workshop-java-01

## Circular buffer

### 1. Data structure ? (Internal)
+ Array of String

### 2. Operations/Behavior/Methods ?  user -> CB ?
+ writeData(string):void
+ readData(): string
+ isFull(): boolean
+ isEmpty(): boolean

+ setSize(int): void

### 3. Internal process ?
+ buffer size = 10 (default)
+ read pointer = 0
+ write pointer = 0

### List of test cases
* new_buffer_should_empty
* new_buffer_with_default_size_should_10
* create_new_buffer_with_default_size_should_10
* write_A_B_to_buffer_should_read_A_B
* overwrite_C_to_fulled_buffer
* writing_12_times_should_overwrite_and_readable

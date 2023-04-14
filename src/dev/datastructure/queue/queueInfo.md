# 큐

큐는 선입선출(FIFO) 원칙을 따르는 선형 데이터 구조입니다. 다시 말해, 큐에 가장 먼저 추가된 요소가 가장 먼저 제거됩니다.

큐는 일상생활에서 많이 볼 수 있는 모델입니다. 예를 들어, 은행에서 줄을 서서 대기하는 것이 큐와 비슷합니다. 가장 먼저 온 사람이 가장 먼저 은행 업무를 처리하고 나가고, 그 다음으로 온 사람이 처리를 받게 됩니다.

## 큐의 구조

큐는 다음과 같은 두 가지 포인터로 구성됩니다.

- front: 큐에서 가장 앞에 있는 항목의 인덱스
- rear: 큐에서 가장 뒤에 있는 항목의 인덱스

큐에 새로운 항목을 추가할 때는 rear 포인터를 증가시키고, 항목을 삭제할 때는 front 포인터를 증가시킵니다.

## 큐의 작업

큐는 다음과 같은 다섯 가지 작업을 지원합니다.

| 메서드 | 리턴값 | 사용법 | 동작 |  |
| --- | --- | --- | --- | --- |
| enqueue | 없음 | queue.enqueue(element) | 큐의 뒤쪽에 요소를 추가 | Stack 의 push 와 유사 |
| dequeue | 제거된 요소 | queue.dequeue() | 큐에서 가장 앞쪽의 요소를 제거하고 반환 | Stack 의 pop 과 유사 |
| front | 맨 앞 요소 | queue.front() | 큐의 가장 앞쪽에 있는 요소 반환 | Stack 의 top 과 유사 |
| size | 큐 크기 | queue.size() | 큐 내 요소의 개수 반환 |  |
| isEmpty | 큐가 비었는지 여부 | queue.isEmpty() | 큐가 비어있는지 여부 반환 |  |

### element vs peek

- element() : 헤드 요소 조회 및 반환, 그러나 큐가 비어있다면 예외 발생 
- peek() : 헤드 요소 조회 및 반환, 그러나 큐가 비어있다면 null 반환

### remove vs poll

- remove() : 헤드 요소를 조회(출력 가능)하고 제거, 하지만 큐가 비어 있다면 예외 발생
- poll() : 헤드 요소를 조회(출력 가능)하고 제거, 하지만 큐가 비어 있다면 null 반환

### add vs offer

- add(e) : 삽입 성공 시 true 반환, 하지만 사용 가능한 공간이 없어 삽입 실패 시 IllegalStateException 발생
- offer(e) : 삽입 성공 시 true 반환, 하지만 사용 가능한 공간이 없어 삽입 실패 시 false 반환

## 사용 예시코드

```java
import java.util.Queue;
import java.util.LinkedList;

Queue<Integer> queue = new LinkedList<>();

queue.add(1);
queue.add(2);
queue.offer(3);
```
* LinkedList 는 queue 의 모든 메소드를 구현하여 위와 같은 업캐스팅 방식을 사용하여 큐의 기능을 사용할 수 있다.
* 만약 enqueue, dequeue, front, size, isEmpty 같은 메서드를 사용하고자 한다면 오버라이딩하여 직접 구현해줘야 한다. 
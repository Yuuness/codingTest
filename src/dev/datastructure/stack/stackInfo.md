# 스택이란?

스택은 LIFO 의 원칙을 따르는 선형 데이터 구조다. 즉, 스택에 마지막으로 추가된 요소가 가장 먼저 제거된다.

# 스택의 메서드


| 메서드                                 | 리턴값 | 사용법 | 동작 |
|-------------------------------------| --- | --- | --- |
| <span style="color:red">push</span> | 없음 | stack.push(element) | 스택 맨 위에 새로운 element 추가 |
| <span style="color:red">pop</span>  | 제거된 요소 | stack.pop() | 스택 맨 위의 요소 제거 후 반환 |
| **top**                             | 맨 위 요소 | stack.peek() | 스택 맨 위의 요소 반환 |
| size                                | 스택 크기 | stack.size() | 스택 내 요소의 개수 반환 |
| isEmpty                             | 스택이 비었는지 여부 | stack.isEmpty() | 스택이 비어있는지 여부 반환 |


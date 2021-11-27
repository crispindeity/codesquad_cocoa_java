# 마스터즈코스 테스트 준비
> 작년 마스터즈코스 테스트 문제를 풀어보자.

## 평면큐브 구현
<details>
<summary>문제</summary>
<div markdown="1">

## 문제 설명
초기화면
```
R R W
G C W
G B B
```
사용자 입력을 받아서 아래의 동작을 하는 프로그램을 구현하시오.
```
> U  가장 윗줄을 왼쪽으로 한 칸 밀기 RRW -> RWR
> U' 가장 윗줄을 오른쪽으로 한 칸 밀기 RRW -> WRR
> R  가장 오른쪽 줄을 위로 한 칸 밀기 WWB -> WBW
> R' 가장 오른쪽 줄을 아래로 한 칸 밀기 WWB -> BWW
> L  가장 왼쪽 줄을 아래로 한 칸 밀기 RGG -> GRG (L의 경우 R과 방향이 반대임을 주의한다.)
> L' 가장 왼쪽 줄을 위로 한 칸 밀기 RGG -> GGR
> B  가장 아랫줄을 오른쪽으로 한 칸 밀기 GBB -> BGB (B의 경우도 U와 방향이 반대임을 주의한다.)
> B' 가장 아랫줄을 왼쪽으로 한 칸 밀기 GBB -> BBG
> Q  Bye~를 출력하고 프로그램을 종료한다.
```
## 요구사항
- 처음 시작하면 초기 상태를 출력한다.
- 간단한 프롬프트 (CLI에서 키보드 입력받기 전에 표시해주는 간단한 글자들 - 예: CUBE> )를 표시해 준다.
- 한 번에 여러 문자를 입력받은 경우 순서대로 처리해서 매 과정을 화면에 출력한다.
## 동작예시
```
R R W
G C W
G B B

CUBE> UUR

U
R W R
G C W
G B B

U
W R R
G C W
G B B

R
W R W
G C B
G B R

CUBE> Q
Bye~
```
## 2단계 코딩 요구사항
- 너무 크지 않은 함수 단위로 구현하려고 노력할 것
- 전역변수의 사용을 자제할 것
- 객체와 배열을 적절히 활용할 것
</div>
</details>

## 목차
1. [Main클래스](#FlatCubeMain클래스)
2. [Input클래스](#Input클래스)
3. [FlatCube클래스](#FlatCube클래스)
4. [Cube클래스](#Cube클래스)
5. [Commends클래스](#Commends클래스)

### FlatCubeMain클래스
### Input클래스
### FlatCube클래스
### Cube클래스
### Commends클래스
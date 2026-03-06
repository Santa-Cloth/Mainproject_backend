# 👔 Wizard of Ounce (Backdnd)

> AI 이미지 분석 기반의 유사 상품 검색 및 실시간 패션 트렌드 큐레이션 서비스

## 🎯 프로젝트 소개
- 개발 기간: 2025.12.24 ~ 2026.03.05 (6주)
- 서비스 목적: 벡터 임베딩 기반 유사도 분석을 통해 유사 스타일 상품을 추천하고 매장 관리자의 상품 운영 의사결정을 지원하는 시스템 구현
- 핵심 기능: 
    - **이미지 분석**: 업로드 이미지 기반 유사 상품 반환
    - **스타일 분류**: K-Fashion 기준 10개 스타일로 분류한 결과 및 확률 시각화
    - **시장 트렌드 조회**: 네이버 쇼핑 API 기반 검색어별 스타일 트렌드 랭킹 제공
    - **대시보드**: 스타일별 분포 차트, 매장별·기간별 상품 랭킹, 스타일 맵 : UMAP 3D 시각화로 자사 상품 스타일 분포 확인
    - **북마크** : 매입 후보 상품 저장 및 관리

## 🛠 기술 스택 (Tech Stack)
- **Language**: <img src="https://img.shields.io/badge/Java-007396?style=flat-square&logo=data:image/svg%2bxml;base64,PHN2ZyBmaWxsPSIjRkZGRkZGIiB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciICB2aWV3Qm94PSIwIDAgNTAgNTAiIHdpZHRoPSI1MHB4IiBoZWlnaHQ9IjUwcHgiPjxwYXRoIGQ9Ik0gMjguMTg3NSAtMC4wMDM5MDYyNSBDIDMwLjkzNzUgNi4zNTkzNzUgMTguMzIwMzEzIDEwLjI4OTA2MyAxNy4xNTIzNDQgMTUuNTkzNzUgQyAxNi4wNzQyMTkgMjAuNDYwOTM4IDI0LjY0MDYyNSAyNi4xMjEwOTQgMjQuNjQ0NTMxIDI2LjEyMTA5NCBDIDIzLjM0Mzc1IDI0LjEwNTQ2OSAyMi40MDIzNDQgMjIuNDQxNDA2IDIxLjA5NzY1NiAxOS4zMDQ2ODggQyAxOC44OTA2MjUgMTQgMzQuNTMxMjUgOS4yMDMxMjUgMjguMTg3NSAtMC4wMDM5MDYyNSBaIE0gMzYuNTUwNzgxIDguODEyNSBDIDM2LjU1MDc4MSA4LjgxMjUgMjUuNTAzOTA2IDkuNTExNzE5IDI0Ljk0MTQwNiAxNi41ODIwMzEgQyAyNC42OTE0MDYgMTkuNzMwNDY5IDI3Ljg0Mzc1IDIxLjQxMDE1NiAyNy45Mzc1IDIzLjcwMzEyNSBDIDI4LjAwNzgxMyAyNS41NzAzMTMgMjYuMDUwNzgxIDI3LjEyODkwNiAyNi4wNTA3ODEgMjcuMTI4OTA2IEMgMjYuMDUwNzgxIDI3LjEyODkwNiAyOS42MDE1NjMgMjYuNDYwOTM4IDMwLjcxNDg0NCAyMy42MDU0NjkgQyAzMS45NDUzMTMgMjAuNDM3NSAyOC4zMjgxMjUgMTguMjczNDM4IDI4LjY5MTQwNiAxNS43MzgyODEgQyAyOS4wNDI5NjkgMTMuMzEyNSAzNi41NTA3ODEgOC44MTI1IDM2LjU1MDc4MSA4LjgxMjUgWiBNIDM5LjIzMDQ2OSAyNS4xNDQ1MzEgQyAzOC4wNzQyMTkgMjUuMDkzNzUgMzYuNzg5MDYzIDI1LjQ3NjU2MyAzNS42MjUgMjYuMzEyNSBDIDM3LjkwNjI1IDI1LjgyNDIxOSAzOS44MzU5MzggMjcuMjE4NzUgMzkuODM1OTM4IDI4LjgyODEyNSBDIDM5LjgzNTkzOCAzMi40NTMxMjUgMzQuNTk3NjU2IDM1Ljg3ODkwNiAzNC41OTc2NTYgMzUuODc4OTA2IEMgMzQuNTk3NjU2IDM1Ljg3ODkwNiA0Mi43MDcwMzEgMzQuOTUzMTI1IDQyLjcwNzAzMSAyOSBDIDQyLjcwNzAzMSAyNi41MzkwNjMgNDEuMTUyMzQ0IDI1LjIzNDM3NSAzOS4yMzA0NjkgMjUuMTQ0NTMxIFogTSAxOS4xODM1OTQgMjUuMTUyMzQ0IEMgMTkuMTgzNTk0IDI1LjE1MjM0NCA5LjA2MjUgMjUuMDE1NjI1IDkuMDYyNSAyNy44Nzg5MDYgQyA5LjA2MjUgMzAuODcxMDk0IDIyLjMxNjQwNiAzMS4wODIwMzEgMzEuNzgxMjUgMjkuMjM4MjgxIEMgMzEuNzgxMjUgMjkuMjM4MjgxIDM0LjMwODU5NCAyNy41MDc4MTMgMzQuOTgwNDY5IDI2Ljg2MzI4MSBDIDI4Ljc3NzM0NCAyOC4xMjg5MDYgMTQuNjIxMDk0IDI4LjI5Njg3NSAxNC42MjEwOTQgMjcuMjAzMTI1IEMgMTQuNjIxMDk0IDI2LjE5MTQwNiAxOS4xODM1OTQgMjUuMTUyMzQ0IDE5LjE4MzU5NCAyNS4xNTIzNDQgWiBNIDE2LjczODI4MSAzMC43MjI2NTYgQyAxNS4xODc1IDMwLjcyMjY1NiAxMi44NzEwOTQgMzEuOTIxODc1IDEyLjg3MTA5NCAzMy4wNzgxMjUgQyAxMi44NzEwOTQgMzUuNDAyMzQ0IDI0LjU2MjUgMzcuMTk1MzEzIDMzLjIxODc1IDMzLjc5Njg3NSBMIDMwLjIyMjY1NiAzMS45NjA5MzggQyAyNC4zNTU0NjkgMzMuODM5ODQ0IDEzLjUzOTA2MyAzMy4yMzgyODEgMTYuNzM4MjgxIDMwLjcyMjY1NiBaIE0gMTguMTc5Njg4IDM1LjkyMTg3NSBDIDE2LjA1MDc4MSAzNS45MjE4NzUgMTQuNjcxODc1IDM3LjIzNDM3NSAxNC42NzE4NzUgMzguMjAzMTI1IEMgMTQuNjcxODc1IDQxLjE4NzUgMjcuMzc4OTA2IDQxLjQ4ODI4MSAzMi40MTQwNjMgMzguNDUzMTI1IEwgMjkuMjE0ODQ0IDM2LjQxNzk2OSBDIDI1LjQ1MzEyNSAzOC4wMDc4MTMgMTYuMDA3ODEzIDM4LjIyMjY1NiAxOC4xNzk2ODggMzUuOTIxODc1IFogTSAxMS4wODk4NDQgMzguNjI1IEMgNy42MjEwOTQgMzguNTU0Njg4IDUuMzY3MTg4IDQwLjExMzI4MSA1LjM2NzE4OCA0MS40MDYyNSBDIDUuMzYzMjgxIDQ4LjI4MTI1IDQwLjg5MDYyNSA0Ny45NDkyMTkgNDAuODkwNjI1IDQwLjkyMTg3NSBDIDQwLjg5MDYyNSAzOS43NTc4MTMgMzkuNTE1NjI1IDM5LjIwMzEyNSAzOS4wMTk1MzEgMzguOTM3NSBDIDQxLjkyMTg3NSA0NS42NTYyNSA5Ljk2ODc1IDQ1LjEzNjcxOSA5Ljk2ODc1IDQxLjE3MTg3NSBDIDkuOTY4NzUgNDAuMjY5NTMxIDEyLjMxMjUgMzkuMzgyODEzIDE0LjQ5MjE4OCAzOS44MDg1OTQgTCAxMi42NDQ1MzEgMzguNzU3ODEzIEMgMTIuMTAxNTYzIDM4LjY3NTc4MSAxMS41ODIwMzEgMzguNjMyODEzIDExLjA4OTg0NCAzOC42MjUgWiBNIDQ0LjYzNjcxOSA0My4yNSBDIDM5LjIzNDM3NSA0OC4zNjcxODggMjUuNTQ2ODc1IDUwLjIzNDM3NSAxMS43ODEyNSA0Ny4wNzQyMTkgQyAyNS41NDI5NjkgNTIuNzAzMTI1IDQ0LjU2NjQwNiA0OS41MzUxNTYgNDQuNjM2NzE5IDQzLjI1IFoiLz48L3N2Zz4=&logoColor=white" /> Java 21
- **Framework**: <img src="https://img.shields.io/badge/Spring_Boot-6DB33F?style=flat-square&logo=spring-boot&logoColor=white"/> Spring Boot 3.5.10
- **Database**: <img src="https://img.shields.io/badge/PostgreSQL-4169E1?style=flat-square&logo=postgresql&logoColor=white"/> PostgreSQL(Supabase), pgvector
- **ORM**: Spring Data JPA, Hibernate 6
- **Build Tool**: <img src="https://img.shields.io/badge/Gradle-02303A?style=flat-square&logo=gradle&logoColor=white"/> Gradle

## 🔗 주요 API 명세

### 1. AI 기반 유사 상품 추천 (`/api/recommand`)
| Method | Endpoint | Description |
|:---:|---|---|
| **GET** | `/api/recommand/{productId}` | 512차원 벡터 기준 유사 상품 추천 |
| **GET** | `/api/recommand/768/{productId}` | 768차원 벡터 기준 유사 상품 추천  |
| **POST** | `/api/recommand/analyze` | 이미지 업로드 → 512차원 분석 → 유사 상품 추천 |
| **POST** | `/api/recommand/768/analyze` | 이미지 업로드 → 768차원 분석 → 유사 상품 추천 |

### 2. 회원 관리 (`/api/members`)
| Method | Endpoint | Description |
|:---:|---|---|
| **POST** | `/api/members/signup` | 신규 회원가입 |
| **POST** | `/api/members/login` | 로컬 로그인 처리 및 JWT 엑세스 토큰 발급 |
| **POST** | `/api/members/logout` | 로그아웃 처리 (서버 세션 무효화) |
| **GET** | `/api/members/me` | JWT 토큰 기반 현재 로그인 사용자 정보 조회 |
| **GET** | `/api/members/list` | 전체 회원 목록 조회 (관리자용) |
| **PATCH** | `/api/members/update` | 회원 정보 선택적 수정 |
| **POST** | `/api/members/profile` | 프로필 이미지 Supabase Storage 업로드 및 회원 정보 갱신 |
| **DELETE** | `/api/members/withdraw` | 비밀번호 확인 후 회원 탈퇴 처리 |

### 3. 관심 상품 — 위시리스트 (`/api/save-products`)
| Method | Endpoint | Description |
|:---:|---|---|
| **GET** | `/api/save-products` | 현재 로그인 회원의 관심 상품 목록 조회 |
| **POST** | `/api/save-products` | 네이버 상품을 관심 상품으로 등록 |
| **DELETE** | `/api/save-products` | `List<String>` Body로 여러 건의 관심 상품 삭제 |

### 4. 자사 상품 관리 (`/api/products`)
| Method | Endpoint | Description |
|:---:|---|---|
| **GET** | `/api/products/list` | 전체 또는 카테고리별 필터링된 나인온스 상품 목록 조회 |
| **GET** | `/api/products/detail?productId=` | 특정 상품 ID의 상세 정보 조회 |
| **GET** | `/api/products/map/512` | 512차원 Scatter Plot 렌더링용 X/Y/Z 좌표 반환 |
| **GET** | `/api/products/map/768` | 768차원 Scatter Plot 렌더링용 X/Y/Z 좌표 반환 |
| **GET** | `/api/products/style-count/512` | 512차원 벡터 보유 상품의 스타일별 분포 통계 |
| **GET** | `/api/products/style-count/768` | 768차원 벡터 보유 상품의 스타일별 분포 통계 |
| **GET** | `/api/products/internal-count` | 나인온스 자체 상품 총 개수 |
| **GET** | `/api/products/naver-count` | 네이버 크롤링 상품 총 개수 |

### 5. 네이버 외부 상품 관리 (`/api/naver-products`)
| Method | Endpoint | Description |
|:---:|---|---|
| **GET** | `/api/naver-products/list` | 네이버 크롤링 데이터 기반 전체 외부 상품 목록 조회 |

### 6. 트렌드 분석 (`/api/trends`)
| Method | Endpoint | Description |
|:---:|---|---|
| **GET** | `/api/trends/shopping-insight` | 네이버 쇼핑인사이트 API 기반 스타일 실시간 트렌드 순위 |
| **GET** | `/api/trends/by-year` | 연도별 월간 스타일 판매량 트렌드 조회 (파라미터 없으면 전체 연도) |

### 7. 판매 통계 (`/api/sales`)
| Method | Endpoint | Description |
|:---:|---|---|
| **GET** | `/api/sales/rank` | 매장별·기간별 상품 판매 순위 Top 5 조회 (전체/온라인/특정 매장) |

### 8. 매장 정보 (`/api/store`)
| Method | Endpoint | Description |
|:---:|---|---|
| **GET** | `/api/store/list` | 등록된 전체 매장(오프라인/온라인) 목록 조회 |

### 9. 시스템 로그 모니터링 (`/api/logs`)
| Method | Endpoint | Description |
|:---:|---|---|
| **GET** | `/api/logs/view` | 브라우저 내장 실시간 서버 로그 대시보드 (HTML 반환) |
| **GET** | `/api/logs/raw` | 서버 로그 파일 마지막 1000줄 Raw 텍스트 반환 |

## ⚙ 핵심 기술 설계

### 1. Java 21 가상 스레드
- FastAPI 호출 시 수 네트워크 지연으로 인한 스레드 풀 고갈 문제를 해결하기 위해 Java 21 가상 스레드를 도입함. 수천 건의 동시 요청에서도 스레드 블로킹 없이 안정적으로 처리함.

### 2. pgvector 벡터 유사도 검색
- 고차원 임베딩 벡터를 PostgreSQL의 pgvector 확장을 활용해 DB 엔진 단에서 코사인 유사도를 직접 연산하는 Native Query를 구축

### 3. Stateless OAuth2 + Cookie 기반 인증
Scale-out 환경에서 Redis 같은 세션 클러스터링 비용을 없애기 위해, Spring Security의 소셜 로그인 흐름을 HTTP-Only 쿠키 기반으로 재구현(AuthorizationRequestRepository)하고 성공 시 JWT만 교환하는 완전 무상태(Stateless) 아키텍처를 구현했습니다. 악의적 요청은 필터 단에서 즉시 차단합니다.

### 4. Spring 6 Declarative HTTP Interfaces
FastAPI 통신에 @HttpExchange 어댑터(Reactor Netty 기반)를 커스텀 튜닝(커넥션 풀 500개, 120s 타임아웃)하여 사용했습니다. RestTemplate나 FeignClient 대비 보일러플레이트를 최소화하고 코드 유지보수성을 높였습니다.

### 5. CompletableFuture 병렬 벡터 검색
이미지 업로드 후 내부 DB와 네이버 외부 DB에서의 유사 상품 검색을 CompletableFuture.supplyAsync()로 동시에 병렬 실행하고 allOf().join()으로 합산합니다. 순차 실행 대비 응답 시간을 단일 검색 수준으로 단축했습니다.

### 6. MapStruct + Caffeine Cache
MapStruct로 DTO ↔ Entity 변환을 컴파일 타임에 생성해 런타임 리플렉션 오버헤드를 제거하고, Caffeine 인메모리 캐시(TTL 10분)로 트렌드·추천 조회의 반복 DB 호출을 최소화했습니다.

### 7. Interface Projection + 읽기 전용 트랜잭션
SimilarProductProjection으로 Native Query 결과에서 필요한 6개 필드(productId, title, price, imageUrl, productLink, similarityScore)만 추출해 불필요한 메모리 로딩과 Dirty Checking을 방지합니다. 조회 전용 메서드에는 @Transactional(readOnly = true)를 적용해 DB 락 경합을 줄였습니다.

### 8. Supabase Storage 분리
바이너리 파일을 RDBMS에 직접 저장하지 않고 Supabase Storage 버킷에 업로드한 뒤 공개 URL만 DB에 기록합니다. RDBMS 비대화를 방지하고 프론트엔드의 이미지 스트리밍 성능을 향상시켰습니다.

### 9. Docker Multi-stage Build
1단계(JDK)에서 빌드 후 2단계(JRE)에만 실행 파일을 복사하는 멀티 스테이지 빌드로 컨테이너 이미지 크기를 최소화하고 공격 벡터를 줄였습니다. Swagger, P6Spy를 통합하여 프론트엔드 팀과의 즉각적인 API 연동이 가능합니다.

## 💻 로컬 실행 및 배포

### 환경 변수 설정(.env)
프로젝트 루트에 `.env`파일을 생성하고 아래 항목을 채워주세요.

```ini
# Database & General Security Auth
DB_PASSWORD=your_supabase_postgres_password
JWT_SECRET=your_super_secret_jwt_signature_key

# OAuth2
OAUTH2_GOOGLE_CLIENT_ID=your_google_id
OAUTH2_GOOGLE_CLIENT_SECRET=your_google_secret
OAUTH2_NAVER_CLIENT_ID=your_naver_id
OAUTH2_NAVER_CLIENT_SECRET=your_naver_secret
OAUTH2_KAKAO_CLIENT_ID=your_kakao_id
OAUTH2_KAKAO_CLIENT_SECRET=your_kakao_secret
```

### Docker

```bash
# 이미지 빌드
docker build -t fashion-api:latest .

# 컨테이너 실행
```bash
docker run -d -p 8080:8080 \
--env-file .env \
--name fashion-backend \
fashion-api:latest

# 로그 확인
docker logs -f fashion-backend
```

### 로컬 직접 실행(Java 21)
```bash
# Windows
> gradlew.bat build -x test
> gradlew.bat bootRun

# macOS / Linux
$ ./gradlew build -x test
$ ./gradlew bootRun
```

> 서버 구동 후 http://localhost:8080/swagger-ui.html 에서 전체 API를 테스트할 수 있습니다.

##  ERD
<img width="1963" height="1503" alt="erd_최종의최종의최종" src="https://github.com/user-attachments/assets/7925c42e-9eb7-4af1-89eb-3757ce458367" />


- 메시지 표준 V1.1 class (2017.06.28)

- History
    - v1.1
        - 일임형 매매 추가 API 반영 (2017.06.28)
    - v1.0
        -메시지 표준 V1.0 반영 (2016.05.18) 


# JsonSampleForJava
OpenAPI 요청/응답 클래스와 JSON sample code

- 일반 계좌 API

    - 실계좌번호 리스트 요청/응답
    : org.openapi.account.RealAccountListRequest
    : org.openapi.account.RealAccountListResponse

    - 가상계좌 발급요청/발급/교체/폐기 통지
    : org.openapi.account.VirtualAccountRequest
    : org.openapi.account.VirtualAccountResponse

    - 자산 포트폴리오 조회 요청
    : org.openapi.portfolio.PortfolioRequest
    : org.openapi.portfolio.PortfolioResponse

    - 계좌잔고조회 서비스
    : org.openapi.balance.BalanceRequest
    : org.openapi.balance.BalanceResponse

    - 거래내역조회 서비스
    : org.openapi.transaction.TransactionHistoryRequest
    : org.openapi.transaction.TransactionHistoryResponse

    - 관심종목 조회 서비스
    : org.openapi.symbol.InterestSymbolListRequest
    : org.openapi.symbol.InterestSymbolListResponse


- 일임형 매매 계좌 API

    - 주문 체결 내역 요청/응답
    : org.openapi.b2b.orderDetail.OrderDetailListRequest
    : org.openapi.b2b.orderDetail.OrderDetailListResponse

    - 일일 계좌 잔고 조회 요청/응답 
    : org.openapi.b2b.balanceList.BalanceListRequest
    : org.openapi.b2b.balanceList.BalanceListResponse

    - 결제예정 정산 내역 조회 요청/응답  
    : org.openapi.b2b.settleList.SettleListRequest
    : org.openapi.b2b.settleList.SettleListResponse
    
    - 일임 설정 계좌 조회 요청/응답  
    : org.openapi.b2b.accountList.AccountListRequest
    : org.openapi.b2b.accountList.AccountListResponse
    
    - 일임계좌 거래내역 조회 요청/응답  
    : org.openapi.b2b.tradeBook.TradeBookListRequest
    : org.openapi.b2b.tradeBook.TradeBookListResponse    
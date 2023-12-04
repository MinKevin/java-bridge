package bridge.view;

public enum GuideMessage {
    GAME_START("다리 건너기 게임을 시작합니다."),
    INPUT_BRIDGE_LENGTH("다리의 길이를 입력해주세요."),
    INPUT_NEXT_DIRECTION("이동할 칸을 선택해주세요. (위: U, 아래: D)"),
    INPUT_RETRY_OR_NOT("게임을 다시 시도할지 여부를 입력해주세요. (재시도: R, 종료: Q)"),
    OUTPUT_GAME_RESULT("최종 게임 결과"),
    OUTPUT_GAME_SUCCESS_OR_NOT("게임 성공 여부: "),
    OUTPUT_TOTAL_TRIAL_COUNT("총 시도 횟수: ")
    ;

    private final String message;

    GuideMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

package gapp.season.util.task;

public interface OnTaskCode {
    int CODE_FAIL = -1;
    int CODE_SUCCESS = 0;
    int CODE_STATE_1 = 1;
    int CODE_STATE_2 = 2;
    int CODE_STATE_3 = 3;
    int CODE_STATE_4 = 4;
    int CODE_STATE_5 = 5;
    int CODE_STATE_6 = 6;
    int CODE_STATE_7 = 7;
    int CODE_STATE_8 = 8;
    int CODE_STATE_9 = 9;

    void onTaskDone(int code);
}

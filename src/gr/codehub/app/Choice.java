package gr.codehub.app;

public enum Choice {
    EXIT,
    ADD,
    REMOVE,
    DISPLAY,
    CLEAR,
    TOTALCOST,
    SAVE,
    LOAD,

    ERROR;

    public Choice mapping(int index){
        switch (index){
            case 1:
                return ADD;
            case 2:
                return REMOVE;
            case 3:
                return DISPLAY;
            case 4:
                return CLEAR;
            case 5:
                return TOTALCOST;
            case 6:
                return SAVE;
            case 7:
                return LOAD;
            case 0:
                return EXIT;
            default:
                return ERROR;
        }
    }
}

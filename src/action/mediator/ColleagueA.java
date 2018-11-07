package action.mediator;

/**
 * Created by chy on 18/9/16.
 */
class ColleagueA extends AbstractColleague{

    public void setNumber(int number, AbstractMediator am) {
        this.number = number;
        am.AaffectB();
    }
}

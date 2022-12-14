package framework.entity;

import framework.util.common.ConfigInput;
import framework.util.common.DataFactory;

/**
 * Created by karthik.m on 6/13/2018.
 */
public class User {
    public String loginId, password, msisdn, rrn;

    public User(){
        this.loginId = "USR" + DataFactory.getRandomNumberAsString(4);
        this.msisdn = ConfigInput.msisdnPrefix + DataFactory.getRandomNumberAsString(9);
    }

    public void setReferenceNum(String rrn){
        this.rrn = rrn;
    }
}

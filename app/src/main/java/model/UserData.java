package model;

/**
 * Created by BMay on 11/02/2015.
 */
public class UserData {
    //create member variables
    private String mUserName;
    private String mRealName;
    private int mAge;
    private String mGender;
    private String mLocation;

    public UserData(String userName, String realName, int age, String gender, String location){
        mUserName = userName;
        mRealName = realName;
        mAge = age;
        mGender = gender;
        mLocation = location;
    }

    public String getUserName() {
        return mUserName;
    }

    public void setUserName(String userName) {
        mUserName = userName;
    }

    public String getRealName() {
        return mRealName;
    }

    public void setRealName(String realName) {
        mRealName = realName;
    }

    public int getAge() {
        return mAge;
    }

    public void setAge(int age) {
        mAge = age;
    }

    public String getGender() {
        return mGender;
    }

    public void setGender(String gender) {
        mGender = gender;
    }

    public String getLocation() {
        return mLocation;
    }

    public void setLocation(String location) {
        mLocation = location;
    }
}

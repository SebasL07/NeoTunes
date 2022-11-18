package model;

public class Date{
    
    /**
     * day represents the day in the date
     */
    private int day;
    /**
     * month represent the month in the date in number
     */
    private int month;
    /**
     * year represents the year in the date
     */
    private int year;

    /**
     * Constructor method of the class Date
     * @param d int, is the day 
     * @param m int, is the month in number
     * @param y int, is the year 
     */
    public Date(int d, int m, int y){

        day = d;
        month = m;
        year = y; 
    }

    /**
     * get method for the atribute day
     * @return day int
     */
    public int getDay(){
        return day;
    }

    /**
     * get method for the atribute month
     * @return month int
     */
    public int getMonth(){
        return month;
    }

    /**
     * get method for the atribute year
     * @return year int
     */
    public int getYear(){
        return year;
    }

    /**
     * set method for the atribute day
     * @param d int, represents the day
     */
    public void setDay(int d){
        day = d;
    }

    /**
     * set method for the atribute month
     * @param m month, represents the month
     */
    public void setMonth(int m){
        month = m;
    }

    /**
     * set method for the atribute year
     * @param y int, represents the year
     */
    public void setYear(int y){
        year = y;
    }

    /**
     * method toString to show the informtaion of the class
     * 
     * @return msg with the information of the class
     */
    public String toString(){
        return day + "/" + month + "/" + year;
    }
}
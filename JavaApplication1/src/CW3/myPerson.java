/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CW3;

/**
 *
 * @author 30868
 */
public class myPerson {
    private String name;
    private String phone;
    private String nights;
    private String rooms;
    private String check_in_date;
    private String check_out_date;
    private String hotel;

    public myPerson(String name, String phone, String nights, String rooms, String check_in_date, String check_out_date, String hotel) {
        this.name = name;
        this.phone = phone;
        this.nights = nights;
        this.rooms = rooms;
        this.check_in_date = check_in_date;
        this.check_out_date = check_out_date;
        this.hotel = hotel;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getNights() {
        return nights;
    }

    public String getRooms() {
        return rooms;
    }

    public String getCheck_in_date() {
        return check_in_date;
    }

    public String getCheck_out_date() {
        return check_out_date;
    }

    public String getHotel() {
        return hotel;
    }

    @Override
    public String toString() {
        return  name + "  "+ phone;
    }



  
    
}

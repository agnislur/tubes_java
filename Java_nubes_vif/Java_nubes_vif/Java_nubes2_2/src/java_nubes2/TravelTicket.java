/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_nubes2;

/**
 *
 * @author agnie
 */
abstract class TravelTicket {
    private String destination;
    protected int price;

    public TravelTicket(String destination) {
        this.destination = destination;
    }

    public String getDestination() {
        return destination;
    }

    public int getPrice() {
        return price;
    }

    public abstract void setPrice();
    public abstract String ticketInfo();
}


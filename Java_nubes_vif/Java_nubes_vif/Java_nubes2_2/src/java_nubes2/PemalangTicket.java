/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_nubes2;

/**
 *
 * @author agnie
 */
class PemalangTicket extends TravelTicket {
    private String classType;

    public PemalangTicket(String classType) {
        super("Pemalang");
        this.classType = classType;
        setPrice();
    }

    @Override
    public void setPrice() {
        if (classType.equals("VIP")) {
            super.price = 700000;
        } else if (classType.equals("Ekonomi")) {
            super.price = 200000;
        }
    }

    @Override
    public String ticketInfo() {
        return "Tiket ke " + super.getDestination() + " | Kelas: " + classType + " | Harga: " + super.getPrice();
    }
}

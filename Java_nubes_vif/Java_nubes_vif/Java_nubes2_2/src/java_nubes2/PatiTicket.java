/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_nubes2;

/**
 *
 * @author agnie
 */
class PatiTicket extends TravelTicket {
    private String classType;

    public PatiTicket(String classType) {
        super("Pati");
        this.classType = classType;
        setPrice();
    }

    @Override
    public void setPrice() {
        if (classType.equals("VIP")) {
            super.price = 300000;
        } else if (classType.equals("Ekonomi")) {
            super.price = 100000;
        }
    }

    @Override
    public String ticketInfo() {
        return "Tiket ke " + super.getDestination() + " | Kelas: " + classType + " | Harga: " + super.getPrice();
    }
}

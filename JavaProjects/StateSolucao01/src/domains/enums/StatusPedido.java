/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package domains.enums;
/**
 *
 * @author jeffe
 */
public enum StatusPedido {
    AGUARDANDO_PAGAMENTO(1,"AGUARDANDO_PAGAMENTO"),PAGO(2,"PAGO"),
    CANCELADO(2,"CANCELADO"),ENVIADO(3,"ENVIADO");
    
    private Integer id;
    private String statuPedido;

    private StatusPedido(Integer id, String statuPedido) {
        this.id = id;
        this.statuPedido = statuPedido;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatuPedido() {
        return statuPedido;
    }

    public void setStatuPedido(String statuPedido) {
        this.statuPedido = statuPedido;
    }

    @Override
    public String toString() {
        return "StatusPedido{" + statuPedido + '}';
    }
    
    public static StatusPedido toEnum(Integer id) {
        if(id==null) return null;
        for(StatusPedido x : StatusPedido.values()){
            if(id.equals(x.getId())){
                return x;
            }
        }
        throw new IllegalArgumentException("Status Pedido inválido");
    }
}
